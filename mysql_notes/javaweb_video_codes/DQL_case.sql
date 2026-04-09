-- 案例1: 按需求完成员工管理的条件分页查询
-- 根据输入条件, 查询第一页数据, 每页展示10条记录
-- 输入条件:
-- 姓名: 张
-- 性别: 男
-- 入职时间: 2000-01-01  2015-12-31
-- 1. 查询员工
-- 1.1根据输入的员工姓名、员工性别、入职时间搜索满足条件的员工信息。
-- 1.2其中员工姓名,支持模糊匹配;性别进行精确查询;入职时间进行范围查询。
-- 1.3支持分页查询。
-- 1.4并对查询的结果,根据最后修改时间进行倒序排序。

SELECT * FROM EMP E 
		WHERE NAME LIKE '%张%'
		AND GENDER = 1
		AND ENTRYDATE BETWEEN '2000-01-01' AND '2015-12-31'
		ORDER BY UPDATE_TIME DESC 
		LIMIT 0, 10;

-- 案例2-1: 根据需求，完成员工性别信息的统计 - count(*) 
-- IF (条件表达式, true取值, false取值)
SELECT IF(GENDER = 1, '男性员工', '女性员工') AS '性别' , COUNT(*) FROM EMP E 
		GROUP BY GENDER ;

-- 案例2-2: 根据需求，完成员工职位信息的统计
-- case 表达式 when 值1 then 结果1 when 值2 then 结果2 ... else... end
SELECT (CASE JOB 
		WHEN 1 THEN '班主任' WHEN 2 THEN '讲师' WHEN 3 THEN '教研主管' 
		WHEN 4 THEN '学工主管' ELSE '无职位' END ) AS '职位', COUNT(*) 
		FROM EMP E 
		GROUP BY JOB;



























