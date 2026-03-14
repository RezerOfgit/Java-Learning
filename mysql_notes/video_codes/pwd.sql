-- 演示加密函数和系统函数
-- USER()		查询用户
-- 可以查看登录到mysql的有哪些用户，以及登录的IP
SELECT USER() FROM DUAL ; -- 用户@IP地址

-- DATABASE ()	查询当前使用数据库名称
SELECT DATABASE ();

-- MD5(str)		为字符串算出一个MD532的字符串，常用(用户密码)加密
-- root 密码是 123456 -> 加密md5 -> 在数据库中存放的是加密后的密码
SELECT MD5('123456') FROM DUAL ;
SELECT LENGTH (md5('123456')) FROM DUAL ;

-- 演示用户表，存放密码时，是md5
CREATE TABLE `user02`(
		id int, 
		`name` varchar(32) NOT NULL DEFAULT '',
		pwd char(32) NOT NULL DEFAULT '');

INSERT INTO `user02`
		VALUES (100, 'rezero', md5('123456'));

SELECT * FROM user02;

SELECT * FROM user02 -- SQL注入问题
		WHERE `name` = 'rezero' AND pwd = md5('123456');

-- PASSWORD(str)--加密函数，MySQL数据库的用户密码就是 PASSWORD函数加密

SELECT PASSWORD('abc') FROM DUAL ; -- PASSWORD() 函数在 MySQL 8.0 被正式移除

-- 使用现代密码哈希方法（推荐）
SELECT SHA2('abc', 256) AS hashed_password; -- 生成 SHA-256 哈希

-- select * from mysql.user \G从原文密码str 计算并返回密码字符串
-- 通常用于对mysql数据库的用户密码加密
-- mysql.user表示数据库.表
SELECT * FROM mysql.USER;











































