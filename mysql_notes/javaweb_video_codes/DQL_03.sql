--  =================== 分组查询 ======================
-- 聚合函数

-- 1. 统计该企业员工数量 -- count
-- A. count(字段)
SELECT COUNT(id) FROM EMP E ; -- 29
SELECT COUNT(JOB) FROM EMP E ; -- 28, null值不参与聚合函数运算

-- B. count(*)
SELECT COUNT(*) FROM EMP E ;

-- C. count(值) 等价 count(*)
SELECT COUNT(1) FROM EMP E ;-- COUNT(常量表达式) 始终返回表中的总行数
SELECT COUNT('a') FROM EMP E ;

-- 2. 统计该企业员工 ID 的平均值
SELECT AVG(ID) FROM EMP E ;

-- 3. 统计该企业最早入职的员工的入职日期
SELECT MIN(ENTRYDATE) FROM EMP E ;

-- 4. 统计该企业最近入职的员工的入职日期
SELECT MAX(ENTRYDATE) FROM EMP E ;

-- 5. 统计该企业员工的 ID 之和
SELECT SUM(ID) FROM EMP E ;


-- 分组
-- 1. 根据性别分组 , 统计男性和女性员工的数量  -- count
SELECT GENDER, COUNT(*) FROM EMP E 
		GROUP BY GENDER ;

-- 2. 先查询入职时间在 '2015-01-01' (包含) 以前的员工 , 并对结果根据职位分组 , 
-- 获取员工数量大于等于2的职位 -- count
SELECT JOB, COUNT(*) FROM EMP E 
		WHERE ENTRYDATE <= '2015-01-01'
		GROUP BY JOB 
		HAVING COUNT(*) >= 2; 































