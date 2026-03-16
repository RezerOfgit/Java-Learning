-- 子查询的演示
-- 请思考：如何显示与MITH同一部门的所有员工？
/*
 * 1. 先查询到 SMITH的部门号得到
 * 2. 把上面的select 语句当做一个子查询来使用
 */
SELECT DEPTNO 
		FROM EMP E 
		WHERE ename = 'SMITH';

SELECT *
		FROM EMP E 
		WHERE DEPTNO = (
			SELECT DEPTNO 
			FROM emp
			WHERE ename = 'SMITH'
		);
-- 课堂练习：如何查询和部门10的工作相同的雇员的
-- 名字、岗位、工资、部门号，但是不含10号部门自已的雇员。
/*
 * 1. 查询到10号部门有哪些工作
 * 2. 把上面查询的结果当做子查询使用
 */
SELECT DISTINCT job
		FROM EMP E 
		WHERE DEPTNO = 10;
SELECT ENAME , JOB ,SAL , DEPTNO 
		FROM EMP E 
		WHERE JOB IN (
			SELECT DISTINCT job
			FROM EMP E 
			WHERE DEPTNO = 10
		) AND DEPTNO != 10;

-- = 要求子查询返回单个值，IN 可以接受多个值。当子查询可能返回多行时，必须用 IN；
-- 当确定只返回单行时，= 语义更清晰但 IN 也能用。




























