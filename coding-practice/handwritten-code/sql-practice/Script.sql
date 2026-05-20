-- 耗材表
CREATE TABLE material (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    category_id BIGINT,
    specification VARCHAR(200),
    unit VARCHAR(20),
    stock INT DEFAULT 0,
    version INT DEFAULT 0,
    is_deleted TINYINT DEFAULT 0,
    create_time DATETIME DEFAULT CURRENT_TIMESTAMP,
    update_time DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

-- 领用记录表
CREATE TABLE record (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    material_id BIGINT NOT NULL,
    applicant VARCHAR(50) NOT NULL,
    quantity INT NOT NULL,
    status TINYINT DEFAULT 0 COMMENT '0待审批 1通过 2驳回',
    remark VARCHAR(500),
    create_time DATETIME DEFAULT CURRENT_TIMESTAMP,
    update_time DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

-- 用户表
CREATE TABLE user (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(200) NOT NULL,
    role_id BIGINT,
    create_time DATETIME DEFAULT CURRENT_TIMESTAMP
);

-- 角色表
CREATE TABLE role (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    role_name VARCHAR(50) NOT NULL,
    description VARCHAR(200)
);

-- 角色权限关联表
CREATE TABLE role_permission (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    role_id BIGINT NOT NULL,
    permission_id BIGINT NOT NULL
);


-- 第 2 项：多表联查
-- 题目 1：查询所有待审批的领用记录，显示耗材名称和申请人
SELECT r.id, m.name, r.applicant, r.quantity, r.create_time
FROM record r
JOIN material m ON r.material_id = m.id
WHERE r.status = 0
ORDER BY r.create_time DESC;
-- 题目 2：查询每种耗材的总领用量，按领用量从高到低排序
SELECT m.name, SUM(r.quantity) AS total_quantity
FROM record r
JOIN material m ON r.material_id = m.id
GROUP BY m.name
ORDER BY total_quantity DESC;
-- 题目 3：查询每个申请人的领用次数，只显示领用超过 3 次的人
SELECT applicant, COUNT(*) AS apply_count
FROM record
GROUP BY applicant
HAVING apply_count > 3
ORDER BY apply_count DESC;
-- 题目 4：查询库存低于 10 的耗材名称和库存
SELECT name, stock
FROM material
WHERE stock < 10 AND is_deleted = 0;

-- 第 3 项：子查询
-- 题目 1：查询领用量最大的那条记录（显示耗材名称、申请人、数量）
SELECT m.name, r.applicant, r.quantity
FROM record r
JOIN material m ON r.material_id = m.id
WHERE r.quantity = (SELECT MAX(quantity) FROM record);
-- 题目 2：查询从未有人领用过的耗材
SELECT name, stock
FROM material
WHERE id NOT IN (SELECT DISTINCT material_id FROM record)
  AND is_deleted = 0;

-- 第 4 项：窗口函数
-- 题目 1：查询每个申请人最近一次领用记录
SELECT applicant, material_id, quantity, create_time
FROM (
    SELECT *, ROW_NUMBER() OVER (PARTITION BY applicant ORDER BY create_time DESC) AS rn
    FROM record
) t
WHERE rn = 1;
-- 题目 2：给领用记录按时间排序编号
SELECT id, applicant, quantity,
       ROW_NUMBER() OVER (ORDER BY create_time DESC) AS rank_num
FROM record;
-- 记住窗口函数的骨架：
-- ROW_NUMBER() OVER (PARTITION BY 分组字段 ORDER BY 排序字段)

-- 第 5 项：事务场景
-- 手写：扣减库存 + 插入领用记录的事务 SQL
START TRANSACTION;

-- 1. 扣减库存（原子扣减，和项目一致）
UPDATE material
SET stock = stock - 2, version = version + 1
WHERE id = 1 AND stock >= 2;

-- 2. 判断是否扣减成功（通过 ROW_COUNT()）
-- 如果返回 0 行，说明库存不足，执行 ROLLBACK

-- 3. 插入领用记录
INSERT INTO record (material_id, applicant, quantity, remark, status)
VALUES (1, 'test01', 2, '日常领用', 0);

COMMIT;
































