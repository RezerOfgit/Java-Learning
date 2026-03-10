-- CHAR(size)
-- 固定长度字符串 最大 255 字符 
-- VARCHAR(size) 0~65535字节
-- 可变长度字符串最大65532字节   【utf8编码最大21844字符1-3个字节用于记录大小】
-- 如果表的编码是utf8 varchar(size) size=(65535-3) / 3 = 21844
-- 如果表的编码是gbk varchar(size) size =(65535-3) / 2 = 32766
CREATE TABLE t08 (`name` char(255));
CREATE TABLE t09 (`name` varchar(32766) charset gbk);
CREATE TABLE t10 (`name` varchar(21844));

DROP TABLE t09;