-- 视图课堂练习

-- 针对emp，dept，和 salgrade张三表.创建一个视图emp_view03，可以显示雇员编号，雇员名，
-- 雇员部门名称和薪水级别[即使用三张表，构建一个视图]

CREATE VIEW emp_view03
		AS
		SELECT emp.empno, emp.ename, dept.dname, salgrade.grade
		FROM emp, dept, salgrade
		WHERE emp.deptno = dept.deptno 
		AND ( sal BETWEEN losal AND hisal );

DROP VIEW emp_view03;
SELECT * FROM emp_view03;

SELECT * FROM emp;
SELECT * FROM dept;
SELECT * FROM salgrade;