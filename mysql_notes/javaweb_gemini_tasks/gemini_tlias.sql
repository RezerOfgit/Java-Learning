-- 1. 清理旧战场 (炸毁旧表，解除外键约束)
DROP TABLE IF EXISTS goods_tag_relation;
DROP TABLE IF EXISTS tags;
DROP TABLE IF EXISTS goods;
DROP TABLE IF EXISTS category_info;

-- 2. 创建部门表 (dept)
CREATE TABLE dept (
    id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT COMMENT '主键ID',
    name VARCHAR(10) NOT NULL UNIQUE COMMENT '部门名称',
    create_time DATETIME NOT NULL COMMENT '创建时间',
    update_time DATETIME NOT NULL COMMENT '修改时间'
) COMMENT '部门表';

-- 3. 插入部门测试数据
INSERT INTO dept (name, create_time, update_time) VALUES 
('学工部', now(), now()), 
('教研部', now(), now()), 
('咨询部', now(), now()), 
('就业部', now(), now()), 
('人事部', now(), now());

-- 4. 创建员工表 (emp) - 提前建好，本章主要操作 dept
CREATE TABLE emp (
    id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT COMMENT 'ID',
    username VARCHAR(20) NOT NULL UNIQUE COMMENT '用户名',
    password VARCHAR(32) DEFAULT '123456' COMMENT '密码',
    name VARCHAR(10) NOT NULL COMMENT '姓名',
    gender TINYINT UNSIGNED NOT NULL COMMENT '性别, 说明: 1 男, 2 女',
    image VARCHAR(300) COMMENT '图像',
    job TINYINT UNSIGNED COMMENT '职位, 说明: 1 班主任,2 讲师, 3 学工主管, 4 教研主管, 5 咨询师',
    entrydate DATE COMMENT '入职时间',
    dept_id INT UNSIGNED COMMENT '部门ID',
    create_time DATETIME NOT NULL COMMENT '创建时间',
    update_time DATETIME NOT NULL COMMENT '修改时间'
) COMMENT '员工表';

SELECT * FROM DEPT D ;
SELECT * FROM EMP E ;






