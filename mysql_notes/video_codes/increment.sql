-- 演示自增长的使用
-- 创建表
CREATE TABLE t24(
		id int PRIMARY KEY AUTO_INCREMENT ,
		email varchar(32) NOT NULL DEFAULT '',
		`name` varchar(32) NOT NULL DEFAULT '');
DESC t24;

-- -测试自增长的使用
INSERT INTO t24
		VALUES (NULL , 'jack@qq.com', 'jack');
INSERT INTO t24
		VALUES (NULL , 'tom@qq.com', 'tom');
INSERT INTO t24
		(email, `name`)
		VALUES ('mary@qq.com', 'mary');
SELECT * FROM t24;

-- 修改默认的自增长开始值
ALTER TABLE t25 AUTO_INCREMENT = 100;
CREATE TABLE t25(
		id int PRIMARY KEY AUTO_INCREMENT ,
		email varchar(32) NOT NULL DEFAULT '',
		`name` varchar(32) NOT NULL DEFAULT '');
INSERT INTO t25
		VALUES (NULL , 'tom@qq.com', 'tom');
INSERT INTO t25
		VALUES (666 , 'aaa@qq.com', 'aaa'); -- 可以指定开始的值
INSERT INTO t25
		VALUES (NULL , '123456@qq.com', '123456'); -- 指定后就是从最大的继续递增
INSERT INTO t25
		VALUES (200 , 'bbb@qq.com', 'bbb');		
INSERT INTO t25
		VALUES (NULL , '123@qq.com', '123'); 
DESC t25;
SELECT * FROM t25;
























