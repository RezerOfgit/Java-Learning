-- 基于 Task50 的表结构。
-- 请编写 SQL：统计并找出平均成绩大于 85 分的学生的 student_id 以及他们的平均分。
-- (提示：需要用到分组聚合和分组后的过滤)。
SELECT STUDENT_ID ,AVG(GRADE) 
		FROM ENROLLMENT E 
		GROUP BY STUDENT_ID 
		HAVING AVG(GRADE) > 85; 