-- 1.创建一个最简单的测试表
CREATE TABLE t1(
	name varchar(255)
);
-- 2. 用 SQL 语句向表里插入一小一大两个 tom
INSERT INTO t1 (name) VALUES ('tom');
INSERT INTO t1 (name) VALUES ('Tom');
-- 3. 核心测试：去表里揪出全小写的 tom
SELECT * FROM t1 WHERE name = 'tom';