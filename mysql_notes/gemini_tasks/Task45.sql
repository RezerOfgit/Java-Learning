-- 场景： 公司有一张员工表 employee，字段有：emp_id (工号), name (姓名), 
-- salary (薪水), phone (手机号)。
-- 现在要给公司的“外包行政人员”开通查询权限，但绝对不能让他们看到员工的 salary（薪水）。
-- 任务： 请编写 SQL 语句，创建一个名为 v_emp_admin 的视图，该视图只暴露工号、姓名和手机号。
CREATE VIEW v_emp_admin
		AS 
		SELECT emp_id, name, phone
		FROM employee;