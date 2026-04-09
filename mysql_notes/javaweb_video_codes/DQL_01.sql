-- ====================================> DQL <=======================================

SELECT * FROM emp;

--  =================== 基本查询 ======================
-- 1. 查询指定字段 name,entrydate 并返回
SELECT name, entrydate FROM EMP E ;

-- 2. 查询返回所有字段, 快捷键输入 SELECT * FROM EMP E ;在星号按ctrl + 空格
-- 方式一:  推荐 , 效率高 . 更直观
SELECT id, username, password, name, gender, image, job, entrydate, create_time, update_time FROM EMP E ;

-- 方式二: 不推荐(不直观, 性能低)
SELECT * FROM EMP E ;

-- 3. 查询所有员工的 name,entrydate, 并起别名(姓名、入职日期)  --- as 关键字可以省略
SELECT NAME AS '姓名', ENTRYDATE AS '入职日期' FROM EMP E ;


-- 4. 查询员工有哪几种职位(不要重复) -- distinct
SELECT DISTINCT job FROM EMP E ;









