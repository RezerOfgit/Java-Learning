-- 演示sql 注入
-- 创建一张表
CREATE TABLE admin (-- 管理员表
		`name` varchar(32) NOT NULL UNIQUE ,
		pwd varchar(32) NOT NULL DEFAULT '') CHARACTER SET utf8;

-- 添加数据
INSERT INTO admin
		VALUES ('tom', '123');

-- 查找某个管理是否存在
SELECT * 
		FROM admin
		WHERE name = 'tom' AND pwd = '123';

-- SQL
-- 输入用户名为 1' or
-- 输入密码为 or '1' = '1
SELECT * 
		FROM admin
		WHERE name = '1' or' AND pwd = 'or '1' = '1';

SELECT *
		FROM admin;