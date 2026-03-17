-- 背景：锁链打好后，我们要测试它的防报错机制。
-- 
-- 需求：
-- 请先往 my_class 里插入一条数据：(1, 'Java冲刺班')。
INSERT INTO my_class
		VALUES (1, 'java冲刺班');

-- 测试 1（防乱加）：尝试往 my_student 里插入一个学生，并故意把他的 class_id 写成 999
-- （一个不存在的班级）。观察报错并记录！
INSERT INTO my_student
		VALUES (10, 'jack', 999);
-- SQL Error [1452] [23000]: Cannot add or update a child row: a foreign key constraint fails (`gemini_db`.`my_student`, CONSTRAINT `my_student_ibfk_1` FOREIGN KEY (`class_id`) REFERENCES `my_class` (`id`))

-- 测试 2（防强删）：先往 my_student 里插入一个正常的学生，class_id 给 1。
-- 然后，尝试执行 DELETE FROM my_class WHERE id = 1;（试图把这个班级整个删掉）。
-- 观察报错并记录！
INSERT INTO my_student
		VALUES (20, 'tom', 1);
DELETE FROM my_class 
		WHERE id = 1;
-- SQL Error [1451] [23000]: Cannot delete or update a parent row: a foreign key constraint fails (`gemini_db`.`my_student`, CONSTRAINT `my_student_ibfk_1` FOREIGN KEY (`class_id`) REFERENCES `my_class` (`id`))

-- 考点：外键的两大核心防御机制：拒绝孤儿数据 和 拒绝破坏级联。