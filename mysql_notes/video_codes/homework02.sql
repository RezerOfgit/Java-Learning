-- 2.写出查看DEPT表和EMP表的结构的sql语句
DESC DEPT ;
DESC EMP ;

-- 3.使用简单查询语句完成：
-- （1）显示所有部门名称。
-- （2）显示所有雇员名及其全年收入13月（工资+补助），并指定列别名“年收入“
SELECT DNAME 
		FROM DEPT;
SELECT ENAME , ( SAL + IFNULL(COMM, 0) ) * 13 AS '年收入'
		FROM EMP;

-- 4.限制查询数据。
-- （1）显示工资超过2850的雇员姓名和工资。
SELECT ENAME , SAL 
		FROM emp 
		WHERE SAL > 2850;
-- （2）显示工资不在1500到2850之间的所有雇员名及工资。
SELECT ENAME , SAL 
		FROM emp 
		WHERE (sal < 1500 OR SAL > 2850);
SELECT ENAME , SAL 
		FROM emp 
		WHERE NOT (sal >= 1500 AND SAL <= 2850);
-- （3）显示编号为7566的雇员姓名及所在部门编号。
SELECT ENAME , DEPTNO 
		FROM emp 
		WHERE empno = 7566;
-- （4）显示部门10和30中工资超过1500的雇员名及工资。
-- SELECT ENAME , SAL 
-- 		FROM EMP
-- 		WHERE DEPTNO = 10 OR DEPTNO  = 30
-- 		HAVING SAL > 1500;
-- HAVING子句必须配合GROUP BY使用（用于过滤分组后的聚合结果）。若没有GROUP BY，
-- 单独使用HAVING会报错（如ORA-00979: not a GROUP BY expression）。

SELECT ENAME , SAL 
		FROM EMP
		WHERE (DEPTNO = 10 OR DEPTNO  = 30) AND SAL > 1500;
-- （5）显示无管理者的雇员名及岗位。
SELECT ENAME , JOB 
		FROM EMP
		WHERE mgr IS NULL ;
-- 5.排序数据。
-- （1）显示在1991年2月1日到1991年5月1日之间雇用的雇员名，岗位及雇佣日期，并以雇佣日期进行排序。
SELECT ENAME ,JOB , HIREDATE 
		FROM emp 
		WHERE HIREDATE BETWEEN '1991-02-01' AND '1991-05-01'
		ORDER BY HIREDATE ;

SELECT ENAME ,JOB , HIREDATE 
		FROM emp 
		WHERE HIREDATE >= '1991-02-01' AND HIREDATE <= '1991-05-01'
		ORDER BY HIREDATE ;
-- （2）显示获得补助的所有雇员名，工资及补助，并以工资降序排序
SELECT ENAME , SAL , COMM 
		FROM EMP
		WHERE comm IS NOT NULL 
		ORDER BY COMM DESC;

























