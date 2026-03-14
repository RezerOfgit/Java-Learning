-- 多表查询
-- ？显示雇员名，雇员工资及所在部门的名字 【笛卡尔集】
/*
 * 		分析
 * 		1. 雇员名, 雇员工资 来自emp表
 * 		2. 部门的名字 来自 dept表
 * 		3. 需求对 emp 和 dept查询
 * 		4. 当我们需要指定显示某个表的列是，需要表.列表
 */
SELECT ename, sal, DNAME , emp.deptno
		FROM emp ,dept
		WHERE emp.deptno = dept.deptno ;

SELECT * FROM EMP E ;
SELECT * FROM DEPT D ;
SELECT * FROM SALGRADE S ;

-- 小技巧：多表查询的条件不能少于 表的个数-1，否则会出现笛卡尔集
-- ？如何显示部门号为10的部门名、员工名和工资
SELECT ename, sal, DNAME , emp.deptno
		FROM emp ,dept
		WHERE emp.deptno = dept.deptno
		AND emp.DEPTNO = 10;

-- ？显示各个员工的姓名，工资，及其工资的级别
-- 思路 姓名，工资来自 emp 13
-- 工资级别 salgrade 5
-- 写sql，先写一个简单，然后加入过滤条件...
SELECT ename, sal, grade
		FROM emp , salgrade
		WHERE SAL BETWEEN losal AND hisal;

-- 练习：显示雇员名，雇员工资及所在部门的名字，并按部门排序[降序排].
SELECT ENAME , SAL , DNAME, emp.DEPTNO
		FROM emp, dept
		WHERE emp.DEPTNO = dept.DEPTNO 
		ORDER BY DEPTNO DESC ;












