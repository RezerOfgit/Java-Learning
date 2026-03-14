-- 分页查询
-- 按雇员的id号升序取出，每页显示3条记录，请分别显示第1页，第2页，第3页

-- 第1页
SELECT * FROM EMP E 
		ORDER BY EMPNO 
		LIMIT 0, 3;
-- 第2页
SELECT * FROM EMP E 
		ORDER BY EMPNO 
		LIMIT 3, 3;
-- 第3页
SELECT * FROM EMP E 
		ORDER BY EMPNO 
		LIMIT 6, 3;
-- 推导一个公式
SELECT * FROM EMP E 
		ORDER BY EMPNO 
		LIMIT 每页显示记录数 ＊ (第几页-1), 每页显示记录数
	
-- 按雇员的empno号降序取出，每页显示5条记录。请分别显示第3页，第5页对应的sql语句
SELECT * FROM EMP E 
		ORDER BY EMPNO DESC 
		LIMIT 10, 5;












































































