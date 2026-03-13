-- 演示 orderby 使用
-- 对数学成绩排序后输出【升序】。
SELECT * FROM STUDENT S 
		ORDER BY math ASC ;

-- 对总分按从高到低的顺序输出[降序］--使用别名排序
SELECT `name`, (CHINESE + ENGLISH + MATH) AS total_score
		FROM STUDENT S 
		ORDER BY total_score DESC ;

-- 对姓黄韩的学生成绩[总分］排序输出（升序） where + orderby
SELECT `name`, (CHINESE + ENGLISH + MATH) AS total_score
		FROM STUDENT S 
		WHERE `name` LIKE '黄%'
		ORDER BY total_score ASC ;
