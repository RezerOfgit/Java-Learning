-- 演示 用户权限的管理

-- 创建用户 rezero 密码123456，从本地登录
CREATE USER 'rezero'@'localhost' identified BY '123456';
-- 使用root用户创建testdb，表news
CREATE DATABASE testdb;

CREATE TABLE news(
		id int,
		content varchar(32));
-- 添加一条测试数据
INSERT INTO news VALUES (100, '北京新闻');
SELECT * FROM news ;

-- 给rezero 分配查看 news 表和 添加news的权限
GRANT SELECT , INSERT 
		ON testdb.news
		TO 'rezero'@'localhost';

-- 可以增加update权限
GRANT UPDATE 
		ON testdb.news
		TO 'rezero'@'localhost';

-- 修改 rezero的密码为 abc
-- SET PASSWORD FOR 'rezero'@'localhost' = PASSWORD('abc'); 
-- PASSWORD()该方法在MySQL 8.0 已废弃

-- 方法1
SET PASSWORD FOR 'rezero'@'localhost' = 'abc';
-- 方法2
ALTER USER 'rezero'@'localhost' IDENTIFIED BY 'abc';

-- 回收 rezero 用户在testdb.news 表的所有权限
REVOKE SELECT , UPDATE , INSERT 
		ON testdb.news
		FROM 'rezero'@'localhost';
-- 或者
REVOKE ALL ON testdb.news FROM 'rezero'@'localhost';

-- 删除 rezero
DROP USER 'rezero'@'localhost';

























