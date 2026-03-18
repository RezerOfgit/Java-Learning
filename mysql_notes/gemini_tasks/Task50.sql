-- 请设计一个“极简学生选课系统”，编写完整的 DDL 建表语句。要求如下：
-- 
-- 学生表 (student)：包含 id (主键自增), name (姓名，非空)。
-- 课程表 (course)：包含 id (主键自增), course_name (课程名，唯一约束),
-- credits (学分，整数)。
-- 选课记录表 (enrollment)：包含 student_id, course_id, grade (成绩)。
-- 	要求 A： 建立两个外键，分别指向 student 和 course 的 id。
-- 	要求 B： 使用 CHECK 约束，保证 grade 成绩必须在 0 到 100 之间。
CREATE TABLE student(
		id int PRIMARY KEY AUTO_INCREMENT ,
		`name` varchar(32) NOT NULL);
CREATE TABLE course(
		id int PRIMARY KEY AUTO_INCREMENT ,
		course_name varchar(32) UNIQUE ,
		credits int);
CREATE TABLE enrollment(
		student_id int ,
		course_id int ,
		grade decimal(10, 2) CHECK (grade BETWEEN 0 AND 100),
		FOREIGN KEY (student_id) REFERENCES student(id),
		FOREIGN KEY (course_id) REFERENCES course(id)
		);
SELECT * FROM student;
SELECT * FROM course;
SELECT * FROM enrollment;
-- 插入学生数据
INSERT INTO student (name) VALUES 
('张三'),
('李四'),
('王五'),
('赵六'),
('钱七');

-- 插入课程数据
INSERT INTO course (course_name, credits) VALUES 
('数学', 4),
('语文', 3),
('英语', 2),
('物理', 4),
('化学', 3);

-- 插入选课记录数据（成绩在0-100之间）
INSERT INTO enrollment (student_id, course_id, grade) VALUES 
(1, 1, 90.00),  -- 张三选数学
(1, 2, 85.50),  -- 张三选语文
(2, 1, 78.00),  -- 李四选数学
(2, 3, 92.00),  -- 李四选英语
(3, 2, 88.00),  -- 王五选语文
(3, 4, 95.50),  -- 王五选物理
(4, 3, 76.00),  -- 赵六选英语
(4, 5, 89.00),  -- 赵六选化学
(5, 1, 91.00),  -- 钱七选数学
(5, 4, 87.50);  -- 钱七选物理












