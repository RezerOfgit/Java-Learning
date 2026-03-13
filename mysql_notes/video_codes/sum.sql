-- 演示sum函数的使用
-- 统计一个班级数学总成绩？
SELECT sum(math) FROM STUDENT S ;

-- 统计一个班级语文、英语、数学各科的总成绩
SELECT sum(chinese), SUM(english), SUM(math) FROM STUDENT S;

-- 统计一个班级语文、英语、数学的成绩总和
SELECT SUM(chinese + english + math) FROM STUDENT S;

-- 统计一个班级语文成绩平均分
SELECT SUM(CHINESE) / COUNT(*) FROM STUDENT S ;

-- 演示avg的使用
-- 练习：
-- 求一个班级数学平均分？
SELECT AVG(math) FROM STUDENT S;

-- -求一个班级总分平均分
SELECT AVG(chinese + english + math) FROM STUDENT S;

-- 演示max 和 min 的使用
-- 求班级最高分和最低分（数值范围在统计中特别有用）
SELECT MAX(chinese + english + math), MIN(chinese + english + math)
		FROM STUDENT S ;

-- 求出班级数学最高分和最低分
SELECT MAX(math) AS math_high_score, min(math) AS math_low_score
		FROM STUDENT S ;









































