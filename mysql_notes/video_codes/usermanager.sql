-- Mysql用户的管理
-- 原因：当我们做项目开发时，可以根据不同的开发人员，赋给他相应的Mysq1操作权限
-- 所以，Mysql数据库管理人员（root），根据需要创建不同的用户，赋给相应的权限，供人员使用
-- 1. 创建新的用户
-- 解读（1）'hsp_edu'@'localhost' 表示用户的完整信息 'hsp_edu'用户名 'localhost' 登录的IP
-- （2）123456 密码，但是注意存放到mysql.user表时，是password('123456') 加密后的密码
-- *6BB4837EB74329105EE4568DDA7DC67ED2CA2AD9
CREATE USER 'rezero'@'localhost' identified BY '123456';
SELECT 'host', user, authentication_string
		FROM mysql.USER;

-- 修改自己的密码，没问题
SET PASSWORD = PASSWORD('abcdef');
-- 修改其他人的密码，需要权限
SET PASSWORD FOR 'root'@'1ocalhost'= PASSWORD('123456');
