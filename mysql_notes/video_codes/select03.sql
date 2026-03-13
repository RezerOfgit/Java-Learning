-- select语句
-- 查询姓名为赵云的学生成绩
SELECT
	*
FROM
	STUDENT S
WHERE
	NAME = '赵云';
-- 查询英语成绩大于90分的同学
SELECT
	*
FROM
	STUDENT S
WHERE
	ENGLISH > 90;
-- 查询总分大于200分的所有同学
SELECT
	*
FROM
	STUDENT S
WHERE
	(CHINESE + ENGLISH + MATH ) > 200;
-- 使用where子句，课堂练习[5min]：
-- 查询math大于60并且(and)id大于4的学生成绩
SELECT
	*
FROM
	STUDENT S
WHERE
	MATH > 60
	AND ID > 4;
-- 查询英语成绩大于语文成绩的同学
SELECT
	*
FROM
	STUDENT S
WHERE
	ENGLISH > CHINESE ;
-- 查询总分大于200分并且数学成绩小于语文成绩，的姓re的学生.
-- 张% 表示 名字以张开头的就可以
SELECT
	*
FROM
	STUDENT S
WHERE
	(CHINESE + ENGLISH + MATH ) > 200
	AND MATH > CHINESE
	AND NAME LIKE '%ze%';

-- 课堂练习
-- 1.查询英语分数在80-90之间的同学。
SELECT * FROM STUDENT S WHERE ENGLISH >= 80 AND ENGLISH <= 90;

-- between ... and 是闭区间, 左小右大
SELECT * FROM STUDENT S WHERE ENGLISH BETWEEN 80 AND 90;

-- 2.查询数学分数为89，90，91的同学。
SELECT * FROM STUDENT S WHERE MATH = 89 OR MATH = 90 OR MATH  = 91;

SELECT * FROM STUDENT S WHERE MATH IN (89, 90, 91);

-- 3.查询所有姓李的学生成绩。
SELECT * FROM STUDENT S WHERE NAME LIKE '李%';

-- 4.查询数学分>80，语文分>80的同学。
SELECT * FROM STUDENT S WHERE MATH > 80 AND CHINESE > 80;

-- 课堂练习
-- 1.查询语文分数在70-80之间的同学。
SELECT * FROM STUDENT S WHERE CHINESE BETWEEN 70 AND 80;

-- 2.查询总分为189，190，191的同学。
SELECT * FROM STUDENT S WHERE (CHINESE + ENGLISH + MATH) IN (185, 190, 233);

-- 3.查询所有姓赵或者姓关的学生成绩。
SELECT * FROM STUDENT S WHERE NAME LIKE '赵%' OR NAME LIKE '关%';

-- 4.查询数学比语文多30分的同学。
SELECT * FROM STUDENT S WHERE (MATH - CHINESE) > 1;



























































