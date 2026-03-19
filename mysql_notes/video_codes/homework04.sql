-- 7.根据：emp员工表，dept部门表，工资=薪金+佣金, 写出正确SQLhomework04.SQL
-- 
-- （1）.列出至少有一个员工的所有部门
SELECT COUNT(*) AS c, DEPTNO 
		FROM  EMP E 
		GROUP BY DEPTNO 
		HAVING c > 1; 
-- （2）.列出薪金比“SMITH”多的所有员工。
SELECT SAL FROM EMP E WHERE ENAME = 'smith';
SELECT *
		FROM  EMP E 
		WHERE SAL > (
		SELECT SAL FROM EMP E WHERE ENAME = 'smith'); 
-- （3）.列出受雇日期晚于其直接上级的所有员工。
/*		先把emp 表 当做两张表worker，leader
-- 		条件 1. worker.hiredate > leader.hiredate
-- 			2. worker.mgr = leader.empno
*/
SELECT worker.ename AS '员工名', worker.hiredate AS '员工入职时间',
		leader.ename AS '上级名', leader.hiredate AS '上级入职时间'	
		FROM emp worker, emp leader
		WHERE worker.hiredate > leader.HIREDATE 
		AND worker.mgr = leader.empno;

-- （4）．列出部门名称和这些部门的员工信息，同时列出那些没有员工的部门。
SELECT DNAME ,e.*
		FROM DEPT D 
		LEFT JOIN EMP E ON d.DEPTNO = e.DEPTNO ;

-- （5）.列出所有“CLERK”（办事员）的姓名及其部门名称。
SELECT ENAME ,DNAME 
		FROM EMP E ,DEPT D 
		WHERE JOB = 'clerk'
		AND e.DEPTNO = d.DEPTNO ;
-- （6）.列出最低薪金大于1500的各种工作。
SELECT MIN(SAL) AS min_sal , JOB 
		FROM EMP E 
		GROUP BY JOB 
		HAVING min_sal > 1500;

-- （7）.列出在部门“SALES”（销售部）工作的员工的姓名。
SELECT ename
		FROM EMP E ,DEPT D 
		WHERE DNAME = 'sales'
		AND e.DEPTNO = d.DEPTNO ;
-- （8）．列出薪金高于公司平均薪金的所有员工。
SELECT *
		FROM EMP E 
		WHERE SAL > (
				SELECT AVG(SAL)
				FROM EMP E2);
-- （9）.列出与“SCOTT”从事相同工作的所有员工。
SELECT JOB 
		FROM EMP E 
		WHERE ENAME = 'scott';
SELECT *
		FROM EMP E 
		WHERE JOB = (
				SELECT JOB 
				FROM emp
				WHERE ENAME = 'scott')
		AND ENAME != 'scott';
-- （10）．列出薪金高于在部门30工作的所有员工的薪金的员工姓名和薪金。
SELECT MAX(SAL) 
		FROM EMP E 
		WHERE DEPTNO = 30;
SELECT ENAME ,SAL 
		FROM EMP E 
		WHERE SAL > (
				SELECT MAX(SAL) 
				FROM EMP E 
				WHERE DEPTNO = 30
		);
-- （11）．列出在每个部门工作的员工数量、平均工资和平均服务期限。
SELECT COUNT(*), DEPTNO ,AVG(SAL),AVG(DATEDIFF(NOW(),HIREDATE)) 
		FROM EMP E
		GROUP BY DEPTNO ;
-- （12）、列出所有员工的姓名、部门名称和工资。
SELECT ename, dname, sal
		FROM EMP E, DEPT D 
		WHERE e.DEPTNO = d.DEPTNO ;
-- （13）、列出所有部门的详细信息和部门人数。
SELECT COUNT(*) AS c, DEPTNO 
		FROM EMP E 
		GROUP BY DEPTNO ;


SELECT d.*, c AS '部门人数'
		FROM DEPT D LEFT JOIN (
				SELECT COUNT(*) AS c, DEPTNO 
				FROM EMP E 
				GROUP BY DEPTNO) e
		ON  e.DEPTNO = d.DEPTNO ; -- 优先使用

SELECT d.*, c AS '部门人数'
		FROM DEPT D , (
				SELECT COUNT(*) AS c, DEPTNO 
				FROM EMP E 
				GROUP BY DEPTNO) e
		WHERE e.DEPTNO = d.DEPTNO ;

-- （14）.列出各种工作的最低工资。
SELECT MIN(SAL) , JOB 
		FROM EMP E 
		GROUP BY JOB ;
-- （15）.列出MANAGER（经理）的最低薪金。
SELECT MIN(SAL), JOB 
		FROM EMP E 
		WHERE JOB = 'manager';
-- （16）.列出所有员工的年工资，按年薪从低到高排序。
SELECT ENAME ,(SAL + IFNULL(COMM, 0) ) * 12 year_sal
		FROM EMP E 
		ORDER BY year_sal ;


















































