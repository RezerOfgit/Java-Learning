-- DDL：表结构
-- 创建：基本语法
CREATE TABLE `user`(
	id int comment 'ID, 唯一标识',
	user_name varchar(32) comment '用户名',
	`name` varchar(32) comment '姓名',
	age int comment '年龄',
	gender char(1) comment '性别'
) comment '用户表';

DROP TABLE `user`;

-- 创建: 基本语法 (约束)
CREATE TABLE `tb_user`(
	id int PRIMARY KEY AUTO_INCREMENT comment 'ID, 唯一标识',
	user_name varchar(32) NOT NULL UNIQUE comment '用户名',
	`name` varchar(32) NOT NULL comment '姓名',
	age int comment '年龄',
	gender char(1) DEFAULT '男' comment '性别'
) comment '用户表';





















