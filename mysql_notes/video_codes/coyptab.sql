-- 表的复制
-- 为了对某个sql语句进行效率测试，我们需要海量数据时，可以使用此法为表创建海量数据
CREATE TABLE my_tab01(
		id int,
		`name` varchar(32),
		sal double,
		job varchar(32),
		deptno int);
DESC my_tab01;
SELECT * FROM my_tab01;

-- 演示如何自我复制
-- 1．先把emp 表的记录复制到 my_tab01
INSERT INTO my_tab01(
		id, `name`, sal, job, deptno)
		SELECT EMPNO, ENAME, SAL, JOB, DEPTNO FROM emp;

-- 2．自我复制
INSERT INTO my_tab01
		SELECT * FROM my_tab01;
SELECT COUNT(*) FROM my_tab01; 

-- 如何删除掉一张表重复记录
-- 1. 先创建一张表my_tab02，
-- 2. 让 my_tab02 有重复的记录
CREATE TABLE my_tab02 LIKE emp;-- 这个语句把emp表的结构（列），复制到my_tab02
DESC my_tab02;
INSERT INTO my_tab02
		SELECT * FROM EMP ;

SELECT * FROM my_tab02;
-- 3. 考虑去重my_tab02的记录
/*
 * 			思路
 * 			(1) 先创建一张临时表my_tmp，该表的结构和my_tab02一样
 * 			(2) 把my_tmp 的记录 通过 distinct 关键字 处理后把记录复制到my_tmp
 * 			(3) 清除掉my_tab02记录
 * 			(4) 把my_tmp表的记录复制到my_tab02
 * 			(5) drop掉临时表my_tmp
 */
-- (1) 先创建一张临时表my_tmp，该表的结构和my_tab02一样
CREATE TABLE my_tmp LIKE my_tab02;
-- (2) 把my_tmp 的记录 通过 distinct 关键字 处理后把记录复制到my_tmp
INSERT INTO my_tmp
		SELECT DISTINCT * FROM my_tab02;
SELECT * FROM my_tmp;
-- (3) 清除掉my_tab02记录
DELETE FROM my_tab02;
-- (4) 把my_tmp表的记录复制到my_tab02
INSERT INTO my_tab02
		SELECT * FROM my_tmp;
SELECT * FROM my_tab02;
-- (5) drop掉临时表my_tmp
DROP TABLE my_tmp;




























