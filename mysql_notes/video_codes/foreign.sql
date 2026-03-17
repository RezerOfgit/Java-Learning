-- 外键演示
-- 创建主表 my_class
CREATE TABLE my_class (
		id int PRIMARY KEY , -- 班级编号
		`name` varchar(32) NOT NULL DEFAULT '');

-- 创建从表 my_stu
CREATE TABLE my_stu (
		id int PRIMARY KEY , -- 学生编号
		`name` varchar(32) NOT NULL DEFAULT '',
		class_id int , -- 学生所在班级的编号
		-- 下面指定外键关系
		FOREIGN KEY (class_id) REFERENCES my_class(id));
-- 测试数据
INSERT INTO my_class
		VALUES (100, 'java'), (200, 'web');
SELECT * FROM my_class;

INSERT INTO my_stu
		VALUES (1, 'tom', 100);
INSERT INTO my_stu
		VALUES (2, 'jack', 200);
INSERT INTO my_stu
		VALUES (3, 'lucy', 300); -- 这里会失败...因为300班级不存在
INSERT INTO my_stu
		VALUES (4, 'mary', NULL ); -- 可以，外键 没有写not nul1
SELECT * FROM my_stu;
-- 一旦建立主外键的关系，数据不能随意删除了
DELETE FROM my_class
		WHERE id = 100; -- 删除失败

		
		
		
		
		
		
		
		
		