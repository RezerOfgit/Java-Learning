-- 创建表的课堂练习
-- 字段			属性
-- Id			整型
-- name			字符型
-- sex			字符型
-- brithday		日期型(date)
-- entry_date	日期型(date)
-- job			字符型
-- Salary		小数型
-- resume		文本型

CREATE TABLE `emp` (
		id int,
		`name` varchar(32),
		sex char(1),
		birthday date,
		entry_date datetime,
		job varchar(32),
		salary double,
		resume text) charset utf8 COLLATE utf8_bin ENGINE innodb;
-- 添加一条
INSERT INTO `emp`
			VALUES (88, 'jack', '男', '2000-12-12', 
			'2025-11-11 11:11:11', '经理', 299999, '毕业于清华大学');

INSERT INTO `emp`
			VALUES (100, 'marry', '女', '2001-01-01', 
			'2022-01-11 21:11:11', '职员', 19998, '毕业于北京大学');

SELECT * FROM `emp`;





























