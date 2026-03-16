-- 子查询练习

-- 请思考：查找每个部门工资高于本部门平均工资的人的资料
-- 这里要用到数据查询的小技巧，把一个子查询当作一个临时表使用
-- 1. 先得到每个部门的部门号和 对应的平均工资
SELECT DEPTNO ,AVG(SAL) AS avg_sal
		FROM EMP E 
		GROUP BY DEPTNO ;

-- 2. 把上面的结果当做子查询，和 emp 进行多表查询
SELECT *
		FROM emp ,(
				SELECT DEPTNO ,AVG(SAL) AS avg_sal
				FROM EMP E 
				GROUP BY DEPTNO
		) temp
		WHERE temp.deptno = emp.DEPTNO AND emp.sal > temp.avg_sal;

-- 查找每个部门工资最高的人的详细资料
SELECT DEPTNO ,MAX(SAL) AS max_sal 
		FROM emp
		GROUP BY DEPTNO ;
SELECT * 
		FROM emp, (
				SELECT DEPTNO ,MAX(SAL) AS max_sal 
				FROM emp
				GROUP BY DEPTNO
		) temp
		WHERE emp.DEPTNO = temp.deptno AND emp.SAL = temp.max_sal;

-- 查询每个部门的信息(包括：部门名，编号，地址)和人员数量
-- 1. 部门名，编号，地址 来自 dept表
-- 2. 各个部门的人员数量－》构建一个临时表

SELECT COUNT(*) , DEPTNO
		FROM EMP E 
		GROUP BY DEPTNO ;

SELECT dname, dept.DEPTNO ,loc, temp.per_num AS '人数'
		FROM dept ,(
				SELECT COUNT(*) AS per_num , DEPTNO
				FROM EMP E 
				GROUP BY DEPTNO
		)temp
		WHERE temp.deptno = dept.deptno;

-- 还有一种写法 表.* 表示将该表所有列都显示出来，可以简化sql语句
-- 在多表查询中，当多个表的列不重复时，才可以直接写列名
SELECT temp.* , dname,loc
		FROM dept ,(
				SELECT COUNT(*) AS per_num , DEPTNO
				FROM EMP E 
				GROUP BY DEPTNO
		)temp
		WHERE temp.deptno = dept.deptno;


































