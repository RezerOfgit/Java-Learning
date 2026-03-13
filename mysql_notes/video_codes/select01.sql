-- 创建新的表(student)
CREATE TABLE `student` (
		id int NOT NULL DEFAULT 1,
		name varchar(20) NOT NULL DEFAULT '',
		chinese float NOT NULL DEFAULT 0.0,
		english float NOT NULL DEFAULT 0.0,
		math float NOT NULL DEFAULT 0.0);

INSERT INTO `student` (id, name, chinese, english, math) VALUES (1, 'rezero', 89, 78, 90);
INSERT INTO `student` (id, name, chinese, english, math) VALUES (2, '张飞', 67, 98, 56);
INSERT INTO `student` (id, name, chinese, english, math) VALUES (3, '宋江', 89, 78, 77);
INSERT INTO `student` (id, name, chinese, english, math) VALUES (4, '关羽', 88, 98, 90);
INSERT INTO `student` (id, name, chinese, english, math) VALUES (5, '赵云', 82, 84, 67);
INSERT INTO `student` (id, name, chinese, english, math) VALUES (6, '欧阳锋', 55,85,45);
INSERT INTO `student` (id, name, chinese, english, math) VALUES (7, '黄蓉', 75,65,30) ;
INSERT INTO `student` (id, name, chinese, english, math) VALUES (8, '黄二狗', 95,45,60) ;

-- DELETE FROM `student`;

-- 查询表中所有学生的信息。
SELECT * FROM `student`;
	
-- 查询表中所有学生的姓名和对应的英语成绩。
SELECT `name`, english FROM STUDENT S ;

-- 过滤表中重复数据 distinct 。
SELECT DISTINCT english FROM STUDENT S ;

-- 要查询的记录，每个字段都相同，才会去重
SELECT DISTINCT `name`, english FROM STUDENT S ;




















































