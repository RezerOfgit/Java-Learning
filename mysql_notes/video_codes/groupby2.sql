-- 增强groupby的使用
-- (1) 显示每种岗位的雇员总数、平均工资。
SELECT COUNT(*), AVG(SAL) , JOB 
		FROM EMP E 
		GROUP BY JOB ;
-- (2) 显示雇员总数，以及获得补助的雇员数。
-- 思路：获得补助的雇员数就是comm 列为非null，就是count(列)，如果该列的值为null，是不会统计
-- 不会统计，SQL 非常灵活，需要我们动脑筋
SELECT COUNT(*), COUNT(comm) 
		FROM EMP E ;
-- 扩展要求：统计没有获得补助的雇员数
SELECT COUNT(*), COUNT(IF(comm IS NULL , 1, NULL )) 
		FROM EMP E ;
SELECT COUNT(*), COUNT(*) - COUNT(comm) 
		FROM EMP E ;

-- (3) 显示管理者的总人数。
SELECT COUNT(DISTINCT mgr)
		FROM EMP E ;

-- (4) 显示雇员工资的最大差额。
-- 思路:max(sal) -min(sal)
SELECT MAX(SAL) - MIN(SAL) 
		FROM EMP E ;

SELECT * FROM EMP E ;

-- 应用案例：请统计各个部门的平均工资，并且是大于1000的，并且按照平均工资从高到低排序，
-- 取出前两行记录
SELECT DEPTNO ,AVG(SAL) AS 'avg_sal' 
		FROM EMP E 
		GROUP BY DEPTNO 
		HAVING avg_sal > 1000 
		ORDER BY avg_sal DESC 
		LIMIT 0, 2;








































