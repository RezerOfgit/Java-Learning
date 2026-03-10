-- 演示bit类型使用
-- 说明
-- 1. bit（m) m 在 1-64
-- 2. 添加数据 范围 按照你给的位数来确定，比如m=8 表示一个字节 0~255
-- 3. 显示按照bit
-- 4. 查询时，仍然可以按照数来查询
CREATE TABLE t04 (num bit(8));
INSERT INTO t04 VALUES (2);
SELECT * FROM t04;
SELECT * FROM t04 WHERE num = 2;

-- 把 num 列的值拿出来，加上 0，强迫 MySQL 把它当成数字算出来
SELECT num + 0 FROM t04;
