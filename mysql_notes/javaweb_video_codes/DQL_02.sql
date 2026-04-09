--  =================== 条件查询 ======================
SELECT * FROM EMP E ;
select * from emp where id = 1;

-- 1. 查询 姓名 为 杨逍 的员工
SELECT * FROM EMP E 
		WHERE NAME = '杨逍';

-- 2. 查询在 id小于等于5 的员工信息
SELECT * FROM EMP E 
		WHERE id <= 5;

-- 3. 查询 没有分配职位 的员工信息  -- 判断 null , 用 is null
SELECT * FROM EMP E 
		WHERE JOB IS NULL;

-- 4. 查询 有职位 的员工信息  -- 判断 不是null , 用 is not null
SELECT * FROM EMP E 
		WHERE JOB IS NOT NULL;

-- 5. 查询 密码不等于 '123456' 的员工信息
SELECT * FROM EMP E 
		WHERE PASSWORD != '123456';

SELECT * FROM EMP E 
		WHERE PASSWORD <> '123456';

-- 6. 查询入职日期 在 '2000-01-01' (包含) 到 '2010-01-01'(包含) 之间的员工信息
SELECT * FROM EMP E 
		WHERE ENTRYDATE >= '2000-01-01' AND ENTRYDATE <= '2010-01-01';

SELECT * FROM EMP E 
		WHERE ENTRYDATE BETWEEN '2000-01-01' AND '2010-01-01';

-- 7. 查询 入职时间 在 '2000-01-01' (包含) 到 '2010-01-01'(包含) 之间 且 性别为女 的员工信息
SELECT * FROM EMP E 
		WHERE ENTRYDATE >= '2000-01-01' AND ENTRYDATE <= '2010-01-01'
		AND GENDER = 2;

-- 8. 查询 职位是 2 (讲师), 3 (学工主管), 4 (教研主管) 的员工信息
SELECT * FROM EMP E 
		WHERE JOB = 2 OR JOB = 3 OR JOB = 4;

SELECT * FROM EMP E 
		WHERE JOB IN (2, 3, 4);

-- 9. 查询姓名为两个字的员工信息
SELECT * FROM EMP E 
		WHERE NAME LIKE '__';

-- 10. 查询姓 '张' 的员工信息  ---------> 张%
SELECT * FROM EMP E 
		WHERE NAME LIKE '张%';

-- 11. 查询姓名中包含 '三' 的员工信息
SELECT * FROM EMP E 
		WHERE NAME LIKE '%三%';

















