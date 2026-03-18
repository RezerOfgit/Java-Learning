-- 在 MySQL 8.0 中，InnoDB 是绝对的霸主，但我们依然需要掌握如何操控引擎。请编写以下 SQL 脚本：
-- 
-- 查询当前 MySQL 服务器支持的所有存储引擎。
SHOW engines;
-- 创建一张名为 user_action_log 的表（包含字段：id 主键自增，action_name 动作名称，
-- create_time 创建时间）。要求： 在建表时显式指定使用 MyISAM 存储引擎，字符集设为 utf8mb4。
CREATE TABLE user_action_log(
		id int PRIMARY KEY AUTO_INCREMENT ,
		action_name varchar(32),
		create_time datetime) ENGINE myisam CHARACTER SET utf8mb4;
-- 后来发现 MyISAM 不支持事务，业务需求变更，请写出将 user_action_log 表的存储
-- 引擎修改回 InnoDB 的 SQL 语句。
ALTER TABLE user_action_log ENGINE = innodb;