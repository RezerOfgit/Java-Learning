-- 创建测试数据库tmp
CREATE DATABASE tmp;

-- 删除已存在的函数（如果存在）
DROP FUNCTION IF EXISTS rand_string;
DROP FUNCTION IF EXISTS rand_num;
DROP PROCEDURE IF EXISTS insert_emp;

-- 创建部门表
CREATE TABLE dept (
    deptno MEDIUMINT UNSIGNED NOT NULL DEFAULT 0 COMMENT '部门编号',
    dname VARCHAR(20) NOT NULL DEFAULT '' COMMENT '部门名称',
    loc VARCHAR(13) NOT NULL DEFAULT '' COMMENT '部门所在地'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='部门表';

-- 创建雇员表
CREATE TABLE emp (
    empno MEDIUMINT UNSIGNED NOT NULL DEFAULT 0 COMMENT '雇员编号',
    ename VARCHAR(20) NOT NULL DEFAULT '' COMMENT '雇员姓名',
    job VARCHAR(9) NOT NULL DEFAULT '' COMMENT '工作职位',
    mgr MEDIUMINT UNSIGNED NOT NULL DEFAULT 0 COMMENT '上级编号',
    hiredate DATE NOT NULL COMMENT '入职日期',
    sal DECIMAL(7,2) NOT NULL COMMENT '薪水',
    comm DECIMAL(7,2) NOT NULL COMMENT '红利',
    deptno MEDIUMINT UNSIGNED NOT NULL DEFAULT 0 COMMENT '部门编号'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='雇员表';

-- 创建工资级别表
CREATE TABLE salgrade (
    grade MEDIUMINT UNSIGNED NOT NULL DEFAULT 0 COMMENT '级别',
    losal DECIMAL(17,2) NOT NULL COMMENT '最低工资',
    hisal DECIMAL(17,2) NOT NULL COMMENT '最高工资'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='工资级别表';

-- 插入工资级别测试数据
INSERT INTO salgrade VALUES 
(1, 700, 1200),
(2, 1201, 1400),
(3, 1401, 2000),
(4, 2001, 3000),
(5, 3001, 9999);

-- 修改分隔符为$$
DELIMITER $$

-- 创建随机字符串生成函数（添加NOT DETERMINISTIC声明）
CREATE FUNCTION rand_string(n INT) 
RETURNS VARCHAR(255) 
NOT DETERMINISTIC  -- 声明为非确定性函数
NO SQL            -- 声明不包含SQL语句
BEGIN
    DECLARE chars_str VARCHAR(100) DEFAULT 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789';
    DECLARE return_str VARCHAR(255) DEFAULT '';
    DECLARE i INT DEFAULT 0;
    
    WHILE i < n DO
        SET return_str = CONCAT(return_str, SUBSTRING(chars_str, FLOOR(1 + RAND() * 62), 1));
        SET i = i + 1;
    END WHILE;
    
    RETURN return_str;
END$$

-- 创建随机部门号生成函数（添加NOT DETERMINISTIC声明）
CREATE FUNCTION rand_num() 
RETURNS INT 
NOT DETERMINISTIC  -- 声明为非确定性函数
NO SQL            -- 声明不包含SQL语句
BEGIN
    DECLARE i INT DEFAULT 0;
    SET i = FLOOR(10 + RAND() * 500);
    RETURN i;
END$$

-- 创建插入雇员的存储过程
CREATE PROCEDURE insert_emp(IN start INT, IN max_num INT)
BEGIN
    DECLARE i INT DEFAULT 0;
    
    -- 关闭自动提交，提高插入性能
    SET autocommit = 0;
    
    REPEAT
        SET i = i + 1;
        -- 插入雇员数据，使用随机生成的值
        INSERT INTO emp VALUES (
            (start + i),           -- 雇员编号
            rand_string(6),        -- 随机姓名
            'SALESMAN',            -- 职位
            FLOOR(1000 + RAND() * 1000),  -- 随机上级编号
            CURDATE(),             -- 当前日期作为入职日期
            ROUND(2000 + RAND() * 3000, 2),  -- 随机薪水
            ROUND(100 + RAND() * 500, 2),    -- 随机红利
            rand_num()             -- 随机部门编号
        );
    UNTIL i = max_num
    END REPEAT;
    
    -- 提交所有更改
    COMMIT;
END$$

-- 调用存储过程插入80万条数据
CALL insert_emp(100001, 800000)$$

-- 恢复分隔符为;
DELIMITER ;

SELECT COUNT(*) FROM emp; -- 在没有创建索引时，我们的查询一条记录0.03s
SELECT * FROM EMP E 
		WHERE EMPNO = 663488; -- 0.576s
		
-- 使用索引来优化一下
-- 创建索引后emp.ibd 文件大小会变大 [索引本身也会占用空间.]

-- empno_index 索引名称
-- ON emp (empno) : 表示在emp 表的empno 列创建索引
CREATE INDEX empno_index ON emp (empno); -- 1.514s
-- 创建索引后， 查询的速度如何
SELECT *
		FROM EMP E 
		WHERE EMPNO = 663488; -- 0.002s 原来是0.576s

-- 创建索引后，只对创建了索引的列有效
SELECT *
		FROM EMP E 
		WHERE ENAME = '9mcJVg'; -- 0.579s
CREATE INDEX ename_index ON emp(ename);
SELECT *
		FROM EMP E 
		WHERE ENAME = '9mcJVg'; -- 0.003s

















