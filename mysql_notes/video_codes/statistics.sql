-- 演示 mysql 的统计函数的使用
-- 统计一个班级共有多少学生？
SELECT COUNT(*) FROM STUDENT S;

-- 统计数学成绩大于90的学生有多少个？
SELECT COUNT(*) FROM STUDENT S
		WHERE MATH > 80;

-- 统计总分大于250的人数有多少？
SELECT COUNT(*) FROM STUDENT S
		WHERE (CHINESE + ENGLISH + MATH) > 250;

SELECT * FROM STUDENT S ;

-- count（*）和count（列）的区别
-- 解释：count(*)返回满足条件的记录的行数
-- count(列)：统计满足条件的某列有多少个，但是会排除为 null 的情况

CREATE TABLE t15(`name` varchar(20));
INSERT INTO t15 VALUES ('tom');
INSERT INTO t15 VALUES ('jack');
INSERT INTO t15 VALUES ('mary');
INSERT INTO t15 VALUES (null);

SELECT * FROM t15;

SELECT COUNT(*) FROM t15; -- 4
SELECT COUNT(`name`) FROM t15; -- 3























