-- 6.根据：emp员工表写出正确SQL homework03.sql

-- 1.选择部门30中的所有员工
SELECT *
		FROM EMP
		WHERE DEPTNO = 30;
-- 2.列出所有办事员（CLERK)的姓名，编号和部门编号.
SELECT ENAME , EMPNO ,DEPTNO ,JOB 
		FROM EMP
		WHERE JOB = 'CLERK';
-- 3.找出佣金高于薪金的员工.
SELECT *
		FROM EMP E 
		WHERE IFNULL(COMM, 0) > SAL ;
-- 4.找出佣金高于薪金60%的员工
SELECT *
		FROM EMP E 
		WHERE IFNULL(COMM, 0) > (SAL * 0.6);
-- 5.找出部门10中所有经理（MANAGER）和部门20中所有办事员（CLERK）的详细资料
-- 方法1
SELECT *
		FROM EMP E
		WHERE DEPTNO = 10 AND JOB = 'manager'
UNION 
SELECT *
		FROM EMP E2
		WHERE DEPTNO = 20 AND JOB = 'clerk';
-- 方法2(更好)
SELECT *
		FROM EMP E
		WHERE (DEPTNO = 10 AND JOB = 'manager')
		OR (DEPTNO = 20 AND JOB = 'clerk');
-- 6.找出部门10中所有经理（MANAGER），部门20中所有办事员（CLERK），还有既不是经理又不是办事员
-- 但其薪金大于或等于2000的所有员工的详细资料.
SELECT *
		FROM EMP E
		WHERE (DEPTNO = 10 AND JOB = 'manager')
		OR (DEPTNO = 20 AND JOB = 'clerk')
		OR (JOB != 'manager' AND JOB != 'clerk' AND SAL >= 2000);
-- 7.找出收取佣金的员工的不同工作
SELECT DISTINCT job
		FROM EMP E 
		WHERE COMM IS NOT NULL ;
-- 8.找出不收取佣金或收取的佣金低于100的员工.
SELECT ENAME , COMM 
		FROM EMP E 
		WHERE COMM IS NULL 
		OR IFNULL(COMM, 0) < 100;
-- 9.找出各月倒数第3天受雇的所有员工.
-- 提示：last_day(日期)，可以返回该日期所在月份的最后一天
-- last_day(日期) - 2 得到日期所在月份的倒数第3天
SELECT *
		FROM EMP E 
		WHERE HIREDATE = last_day(HIREDATE) - 2;
-- 10.找出早于12年前受雇的员工.
SELECT *
		FROM EMP E 
		WHERE DATE_ADD(HIREDATE, INTERVAL 12 YEAR) < NOW() ;

-- 11.以首字母小写的方式显示所有员工的姓名
SELECT CONCAT(LCASE(SUBSTRING(ENAME,1,1)),SUBSTRING(ENAME,2)) 
		FROM EMP E ;
-- 12.显示正好为5个字符的员工的姓名
SELECT *
		FROM EMP E 
		WHERE LENGTH (ENAME) = 5;
-- 13.显示不带有"R"的员工的姓名
SELECT ENAME 
		FROM EMP E
		WHERE ENAME NOT LIKE '%R%';
-- 14.显示所有员工姓名的前三个字符
SELECT SUBSTRING(ENAME,1,3)
		FROM EMP E;
SELECT LEFT(ENAME,3)
		FROM EMP E;
-- 15.显示所有员工的姓名，用a替换所有"A"
SELECT REPLACE (ENAME,'A','a')
		FROM EMP E;
-- 16.显示满10年服务年限的员工的姓名和受雇日期
SELECT ENAME , HIREDATE 
		FROM EMP E
		WHERE DATE_ADD(HIREDATE, INTERVAL 10 YEAR) <= NOW() ;
-- 17.显示员工的详细资料，按姓名排序
SELECT *
		FROM EMP E
		ORDER BY ENAME ;
-- 18.显示员工的姓名和受雇日期，根据其服务年限，将最老的员工排在最前面.
SELECT ENAME , HIREDATE 
		FROM EMP E
		ORDER BY  hiredate ASC ;
-- 19.显示所有员工的姓名、工作和薪金，按工作降序排序，若工作相同则按薪金排序
SELECT ENAME ,JOB , SAL 
		FROM EMP E
		ORDER BY  JOB DESC , sal;
-- 20.显示所有员工的姓名、加入公司的年份和月份，按受雇日期所在月排序，若月份相同则将最早年份
-- 的员工排在最前面，
SELECT ENAME ,CONCAT( YEAR (HIREDATE ),'-', MONTH (hiredate))
		FROM EMP E
		ORDER BY MONTH(hiredate) , YEAR(HIREDATE);
-- 21.显示在一个月为30天的情况所有员工的日薪金，忽略余数
SELECT ENAME , FLOOR(SAL / 30 ) AS '日薪金' -- floor忽略余数, round四舍五入
		FROM EMP E;
-- 22.找出在（任何年份的）2月受聘的所有员工。
SELECT *
		FROM EMP E
		WHERE MONTH (HIREDATE) = 2;
-- 23.对于每个员工，显示其加入公司的天数
SELECT ENAME ,DATEDIFF(NOW(), HIREDATE) AS '加入公司天数' 
		FROM EMP E;
-- 24.显示姓名字段的任何位置包含”A“的所有员工的姓名
SELECT ENAME 
		FROM EMP E
		WHERE ENAME LIKE '%A%';
-- 25.以年月日的方式显示所有员工的服务年限（大概）
SELECT 
    ENAME,
    CONCAT(
        FLOOR(DATEDIFF(CURDATE(), HIREDATE)/365), '年',
        FLOOR(MOD(DATEDIFF(CURDATE(), HIREDATE), 365)/30), '个月',
        MOD(MOD(DATEDIFF(CURDATE(), HIREDATE), 365), 30), '天'
    ) AS '服务年限'
FROM EMP;























