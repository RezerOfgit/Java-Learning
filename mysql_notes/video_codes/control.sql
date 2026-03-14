-- 演示流程控制语句

-- IF(expr1,expr2,expr3）如果expr1为True，则返回expr2 否则返回 expr3
SELECT IF (TRUE , '北京', '上海') FROM DUAL ;

-- IFNULL(expr1,expr2)	如果expr1不为空NULL，则返回expr1，否则返回expr2
SELECT IFNULL(NULL, '今天是晴天') FROM DUAL; -- 今天是晴天

-- SELECT CASE WHEN expr1 THEN expr2 WHEN expr3 THEN expr4 
-- ELSE expr5 END; [类似多重分支.]
-- 如果expr1 为TRUE，则返回expr2，如果expr3 为true，返回 expr4，否则返回 expr5
SELECT CASE 
		WHEN TRUE THEN '语句1'
		WHEN FALSE THEN '语句2'
		ELSE '语句3'
END;

-- 1.查询emp表，如果comm是null，则显示0.0
SELECT ENAME ,IF(COMM IS NULL , 0.0, COMM) FROM EMP E ;

SELECT ENAME ,IFNULL(comm, 0.0) FROM EMP E; 

-- 2.如果emp 表的job 是CLERK则显示 职员，如果是 MANAGER 则显示经理
-- 如果是SALESMAN 则显示销售人员，其它正常显示
SELECT ENAME, (CASE 
				WHEN JOB = 'CLERK' THEN '职员'
				WHEN JOB = 'MANAGER' THEN '经理'
				WHEN JOB = 'SALESMAN' THEN '销售人员'
				ELSE job END 
				) AS '工作'
		FROM EMP E ;










































































