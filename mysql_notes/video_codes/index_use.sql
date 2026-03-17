-- 演示mysql的索引的使用
-- 创建索引
CREATE TABLE t25(
		id int,
		`name` varchar(32));

-- 查询表是否有索引
SHOW INDEX FROM t25;

-- 添加索引
-- 添加唯一索引
CREATE UNIQUE INDEX id_index ON t25(id);
-- 添加普通索引方式1
CREATE INDEX id_index ON t25(id);
-- 如何选择
-- 1. 如果某列的值，是不会重复的，则优先考虑使用unique索引，否则使用普通索引
-- 添加普通索引方式2
ALTER TABLE t25 ADD INDEX id_index (id);

-- 添加主键索引
CREATE TABLE t26(
		id int,
		`name` varchar(32));
ALTER TABLE t26 ADD PRIMARY KEY (id);
SHOW INDEX FROM t26;


-- 删除索引
DROP INDEX id_index ON t25;
-- 删除主键索引
ALTER TABLE t26 DROP PRIMARY KEY ; -- 无需写在哪一列

-- 查询索引
-- 方式1
SHOW INDEX FROM t25;
-- 方式2
SHOW indexes FROM t25;
-- 方式3
SHOW KEYS FROM t25;
-- 方式4
DESC t25; -- 没有前几种显示详细



















