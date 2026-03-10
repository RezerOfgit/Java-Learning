-- 使用tinyint 来演示范围 有符号-128~127 如果没有符号 0-255
-- 说明：表的字符集，校验规则，存储引擎，这里使用默认
-- 1.如果没有指定 unsinged ，则TINYINT就是有符号-128~127
-- 2.如果指定unsinged，则TINYINT就是无符号 O-255
CREATE TABLE t2(
		id TINYINT);

INSERT
	INTO
	t2
VALUES (0);
#这是非常简单的添加语句

SELECT
	*
FROM
	T2 T ;

CREATE TABLE t3(id TINYINT UNSIGNED);

INSERT
	INTO
	t3
VALUES(25);

SELECT
	*
FROM
	t3;