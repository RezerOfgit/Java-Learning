-- 多列子查询

-- 请思考如何查询与ALLEN的部门和岗位完全相同的所有雇员(并且不含ALLEN本人)
-- (字段1，字段2...) = (select字段1，字段2from...)

-- 分析：1. 得到ALLEN的部门和岗位
SELECT DEPTNO , JOB 
		FROM EMP E 
		WHERE ENAME = 'ALLEN';
-- 分析：2. 把上面的查询当做子查询来使用，并且使用多列子查询的语法进行匹配
SELECT *
		FROM EMP E 
		WHERE (DEPTNO, JOB) = (
				SELECT DEPTNO , JOB 
				FROM EMP E 
				WHERE ENAME = 'ALLEN'
		) AND ENAME != 'ALLEN';
-- 请查询和宋江数学，英语，语文成绩完全相同的学生
SELECT CHINESE , ENGLISH ,MATH 
		FROM STUDENT S 
		WHERE NAME = '宋江';
SELECT *
		FROM STUDENT S 
		WHERE (CHINESE, ENGLISH, MATH) = (
				SELECT CHINESE , ENGLISH ,MATH 
				FROM STUDENT S 
				WHERE NAME = '宋江'
		)AND NAME != '宋江';

SELECT * FROM STUDENT S ;


















