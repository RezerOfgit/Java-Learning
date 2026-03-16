-- unique的使用

CREATE TABLE t21(
		id int UNIQUE , -- 表示id列是不可以重复的.
		`name` varchar(32), 
		email varchar(32));
INSERT INTO t21
		VALUES (1, 'jack', 'jack@sohu.com');
INSERT INTO t21
		VALUES (1, 'tom', 'tom@sohu.com'); -- 加入失败
		
-- unqiue使用细节
-- 1. 如果没有指定 notnull，则unique 字段可以有多个null
-- 如果一个列（字段），是unique notnull 使用效果类似 primary key
INSERT INTO t21
		VALUES (NULL , 'jack', 'jack@sohu.com');
SELECT * FROM t21;
-- 2. 一张表可以有多个unique字段
CREATE TABLE t22(
		id int UNIQUE , -- 表示id列是不可以重复的.
		`name` varchar(32) UNIQUE , -- 表示name不可以重复
		email varchar(32));
INSERT INTO t22
		VALUES (NULL , 'jack', 'jack@sohu.com');
DESC t22;
SELECT * FROM t22;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		