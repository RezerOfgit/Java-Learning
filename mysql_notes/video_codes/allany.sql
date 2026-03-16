-- all 和any的使用
-- 请思考：显示工资比部门30的所有员工的工资高的员工的姓名、工资和部门号
SELECT ENAME , SAL , DEPTNO 
		FROM EMP E 
		WHERE SAL > ALL (
			SELECT SAL 
				FROM EMP E2 
				WHERE DEPTNO = 30
		);
-- 也可以这样写
SELECT ENAME , SAL , DEPTNO 
		FROM EMP E 
		WHERE SAL > (
			SELECT MAX(SAL)
				FROM EMP E2 
				WHERE DEPTNO = 30
		);

-- 请思考：如何显示工资比部门30的其中一个员工的工资高的员工的姓名、工资和部门号
SELECT ENAME , SAL , DEPTNO 
		FROM EMP E 
		WHERE SAL > ANY (
			SELECT SAL 
				FROM EMP E2 
				WHERE DEPTNO = 30
		);
-- 也可以这样写
SELECT ENAME , SAL , DEPTNO 
		FROM EMP E 
		WHERE SAL > (
			SELECT MIN(SAL) 
				FROM EMP E2 
				WHERE DEPTNO = 30
		);













