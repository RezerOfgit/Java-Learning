-- 背景：学校要建两张表，一张是班级表（主表），一张是学生表（从表）。
-- 必须保证每个学生所属的班级，在班级表里真实存在。
-- 
-- 需求：
-- 请先创建主表 my_class，包含列：id (主键 INT), class_name (VARCHAR)。
-- 再创建从表 my_student，包含列：id (主键 INT), name (VARCHAR), class_id (INT)。
CREATE TABLE my_class (
		id int PRIMARY KEY ,
		class_name varchar(32));

CREATE TABLE my_student(
		id int,
		name varchar(32),
		class_id int,
		FOREIGN KEY (class_id) REFERENCES my_class(id));

SELECT * FROM my_class;
SELECT * FROM my_student;

-- 核心考点：在创建 my_student 表的最后，加上一句外键约束代码，让 class_id 作为外键，
-- 去引用（REFERENCES）my_class 表的 id 列。