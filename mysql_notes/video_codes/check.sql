-- 演示check的使用

-- mysql 5.7目前还不支持check，只做语法校验，但不会生效 8.0有效
-- 学习 oracle，sqlserver，这两个数据库是真的生效.
-- 测试
CREATE TABLE t23(
		id int PRIMARY KEY ,
		`name` varchar(32),
		sex varchar(6) CHECK (sex IN ('man', 'woman')),
		sal double CHECK (sal > 1000 AND sal < 2000));

-- 添加数据
INSERT INTO t23
		VALUES (1, 'jack', 'man', 1002);
SELECT * FROM t23;
