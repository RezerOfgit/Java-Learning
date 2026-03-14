-- 查询加强
-- 使用where子句
-- 		？如何查找1992.1.1后入职的员
SELECT * FROM EMP E 
		WHERE HIREDATE > '1992-01-01';
-- 如何使用like操作符
-- 		%：表示0到多个字符_：表示单个字符
-- 		?如何显示首字符为s的员工姓名和工资
SELECT ENAME, SAL 
		FROM EMP E 
		WHERE ENAME LIKE 'S%';

-- 		?如何显示第三个字符为大写O的所有员工的姓名和工资
SELECT ENAME , SAL 
		FROM EMP E 
		WHERE ENAME LIKE '__O%';

-- 如何显示没有上级的雇员的情况
SELECT * FROM EMP E 
		WHERE MGR IS NULL ;

-- 查询表结构
DESC EMP ;

-- 使用orderby子句
-- 		？如何按照工资的从低到高的顺序[升序］，显示雇员的信息
SELECT * FROM EMP E 
		ORDER BY SAL ASC ;

-- ?按照部门号升序而雇员的工资降序排列，显示雇员信息
SELECT * FROM EMP E 
		ORDER BY DEPTNO ASC , SAL DESC ;














































