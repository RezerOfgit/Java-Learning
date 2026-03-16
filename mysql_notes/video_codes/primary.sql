-- 主键使用
-- id  name  email
CREATE TABLE t17(
		id int PRIMARY KEY , -- 表示id列是主键
		`name` varchar(32),
		email varchar(32));

-- 主键列的值是不可以重复
INSERT INTO t17
		VALUES (1, 'jack', 'jack@sohu.com');
INSERT INTO t17
		VALUES (2, 'tom', 'tom@sohu.com');
INSERT INTO t17
		VALUES (1, 'rezero', 'rezero@sohu.com');
SELECT * FROM t17;

-- 主键使用的细节讨论
-- primary key不能重复而且不能为null。
INSERT INTO t17
		VALUES (NULL , 'smith', 'smith@sohu.com');
-- 一张表最多只能有一个主键，但可以是复合主键
CREATE TABLE t18(
		id int PRIMARY KEY , -- 表示id列是主键
		`name` varchar(32) PRIMARY KEY, -- 错误的
		email varchar(32));
-- 演示复合主键(id 和 name 做成复合主键)
CREATE TABLE t18(
		id int , 
		`name` varchar(32) , 
		email varchar(32),
		PRIMARY KEY (id, `name`)); -- 这里就是复合主键
INSERT INTO t18
		VALUES (1, 'jack', 'jack@sohu.com');
INSERT INTO t18
		VALUES (1, 'tom', 'tom@sohu.com');
INSERT INTO t18
		VALUES (1, 'jack', 'xx@sohu.com'); -- 错误的

SELECT * FROM t18;

-- 主键的指定方式 有两种
-- 1. 直接在字段名后指定：字段名 primary key
-- 2. 在表定义最后写primary key(列名);
CREATE TABLE t19(
		id int , 
		`name` varchar(32) PRIMARY KEY, 
		email varchar(32));

CREATE TABLE t20(
		id int , 
		`name` varchar(32), 
		email varchar(32),
		PRIMARY KEY(`name`)); -- 在表定义最后写 primary key(列名)
		
-- 使用desc 表名，可以看到primary key的情况
DESC t20; -- 查看t20表的结果，显示约束的情况
DESC t18;




























