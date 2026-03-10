-- 演示字符串类型的使用细节
-- char(4) 和varchar(4) 这个4表示的是字符，而不是字节，不区分字符是汉字还是字母
CREATE TABLE t11(`name` char(4));

INSERT
	INTO
	t11
VALUES ('java');

SELECT
	*
FROM
	t11;

CREATE TABLE t12 (`name` varchar(4));
INSERT INTO t12 VALUES ('你好世界');
INSERT INTO t12 VALUES ('ab你好');
SELECT * FROM t12;

-- 如果varchar 不够用，可以考试使用mediumtext 或者longtext，
-- 如果想简单点，可以使用直接使用text
CREATE TABLE t13 (content text, content2 MEDIUMTEXT, content3 LONGTEXT);
INSERT INTO t13 VALUES ('这是一段话', '这是一段话4561', '这是一段话25...');
SELECT * FROM t13;

-- TEXT 类型怎么查看实际占用的字节大小？
SELECT 
    LENGTH(content) AS size1, 
    LENGTH(content2) AS size2, 
    LENGTH(content3) AS size3 
FROM t13;

-- 字符个数
SELECT CHAR_LENGTH(content) AS size1 FROM t13;









