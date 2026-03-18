-- 基于 Task50 的表结构。假设表中已经有了充足的数据。
-- 请编写 SQL：查询出所有选修了“学分为 4 的课程”的学生姓名和对应的课程名。
-- (要求：使用 JOIN 语法实现，拒绝老式的 WHERE 笛卡尔积过滤)。

SELECT s.NAME , c.COURSE_NAME 
		FROM ENROLLMENT E JOIN STUDENT S
		ON e.STUDENT_ID = s.ID JOIN COURSE C 
		ON e.COURSE_ID = c.ID 
		WHERE CREDITS = 4;
		