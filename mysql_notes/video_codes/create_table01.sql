-- 指令创建表
-- 注意：hsp_db03创建表时，要根据需保存的数据创建相应的列，并根据数据的
-- 类型定义相应的列类型。例：user表（快速入门案例create_tabo1.sql）
-- id	整形
-- name	字符串
-- password	字符串
-- birthday	日期
CREATE TABLE `user` (
		id int,
		`name` varchar(255),
		`password` varchar(32),
		`birthday` date)
		CHARACTER SET utf8 COLLATE utf8_bin ENGINE innodb;















