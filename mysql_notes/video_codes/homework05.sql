-- 8.设学校环境如下：一个系有若干个专业，每个专业一年只招一个班，每个班有若千个学生。
-- 现要建立关于系、学生、班级的数据库，关系模式为：
-- 班CLASS （班号classid，专业名subject，系名deptname，入学年份enrolltime，人数num）
-- 学生STUDENT （学号studentid，姓名name，年龄age，班号classid）
-- 系DEPARTMENT （系号departmentid，系名deptname）
-- 试用sQL语言完成以下功能：homeworko5.sql
-- （1）建表，在定义中要求声明：
-- 	（1）每个表的主外码。
-- 	（2）deptname是唯一约束。
-- 	（3）学生姓名不能为空。
-- （2）插入如下数据
-- DEPARTMENT（001， 数学;002，计算机；003，化学；004，中文；005，经济；）
-- CLASS(
-- 101,软件,计算机,1995,20;
-- 102,微电子,计算机,1996,30;
-- 111,无机化学,化学,1995,29;
-- 112,高分子化学,化学,1996,25;
-- 121,统计数学,数学,1995,20;
-- 131,现代语言,中文,1996,20;
-- 141,国际贸易,经济,1997,30;
-- 142,国际金融,经济,1996,14;)
-- STUDENT (
-- 8101,张三,18,101;
-- 8102,钱四,16,121;
-- 8103,王玲,17,131;
-- 8105,李飞,19,102;
-- 8109,赵四,18,141;
-- 8110,李可,20,142;
-- 8201,张飞,18,111;
-- 8302,周瑜,16,112;
-- 8203,王亮,17,111;
-- 8305,董庆,19,102;
-- 8409,赵龙,18,101;
-- 8510,李丽,20,142)
CREATE TABLE DEPARTMENT(
		departmentid int PRIMARY KEY ,
		deptname varchar(32) UNIQUE NOT NULL );
INSERT INTO DEPARTMENT
		VALUES (001,'数学'),(002,'计算机'),(003,'化学'),
		(004, '中文'),(005,'经济');

CREATE TABLE CLASS(
		classid int PRIMARY KEY ,
		subject varchar(32) NOT NULL DEFAULT '',
		deptname varchar(32),
		enrolltime int NOT NULL DEFAULT 2000,
		nums int NOT NULL DEFAULT 0,
		FOREIGN KEY (deptname) REFERENCES DEPARTMENT(deptname));
INSERT INTO CLASS
		VALUES (101,'软件','计算机',1995,20),(102,'微电子','计算机',1996,30),(111,'无机化学','化学',1995,29),
			(112,'高分子化学','化学',1996,25),(121,'统计数学','数学',1995,20),(131,'现代语言','中文',1996,20),
			(141,'国际贸易','经济',1997,30),(142,'国际金融','经济',1996,14);

CREATE TABLE students(
		studentid int PRIMARY KEY ,
		`name` varchar(32) NOT NULL DEFAULT '',
		age int NOT NULL DEFAULT 0,
		classid int,
		FOREIGN KEY (classid) REFERENCES class(classid) );
INSERT INTO students
		VALUES (8101,'张三',18,101),(8102,'钱四',16,121),(8103,'王玲',17,131),
		(8105,'李飞',19,102),(8109,'赵四',18,141),(8110,'李可',20,142),
		(8201,'张飞',18,111),(8302,'周瑜',16,112),(8203,'王亮',17,111),
		(8305,'董庆',19,102),(8409,'赵龙',18,101),(8510,'李丽',20,142);

SELECT * FROM DEPARTMENT;
SELECT * FROM CLASS;
SELECT * FROM students;

-- (3)完成以下查询功能
-- 	3.1找出所有姓李的学生。
SELECT *
		FROM students 
		WHERE `name` LIKE '李%';
-- 	3.2列出所有开设超过1个专业的系的名字。
SELECT deptname, COUNT(subject) AS c
		FROM class 
		GROUP BY deptname
		HAVING c > 1;
-- 	3.3列出人数大于等于30的系的编号和名字。
-- 	1. 先查出各个系有多少人
SELECT sum(nums) AS total_nums, deptname
		FROM class 
		GROUP BY deptname
		HAVING total_nums > 30;
--	2. 将上面的结果看成一个临时表 和 department 联合查询即可
SELECT tmp.*, departmentid
		FROM department d ,(
				SELECT sum(nums) AS total_nums, deptname
				FROM class 
				GROUP BY deptname
				HAVING total_nums > 30) tmp
		WHERE tmp.deptname = d.deptname;
-- (4)学校又新增加了一个物理系,编号为006
INSERT INTO department
		VALUES (006, '物理');
SELECT * FROM department;
-- (5)学生张三退学,请更新相关的表
-- 分析：1.张三所在班级的人数-1  2.将张三从学生表删除   3.需要使用事务控制
-- 开启事务
START TRANSACTION ;

-- 张三所在班级的人数-1
UPDATE class SET nums = nums -1
		WHERE classid = (
				SELECT classid 
						FROM students
						WHERE `name` = '张三');
DELETE FROM students 
		WHERE name = '张三';
-- 提交事务
COMMIT ;

SELECT * FROM students;
SELECT * FROM class ;
















