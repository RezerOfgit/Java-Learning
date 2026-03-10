-- 背景：老板想给年纪大的员工发点关怀福利。
-- 
-- 需求：从 emp 表中，找出所有真实年龄（age）大于等于 35 岁的员工，
-- 要求显示他们的 name 和 age。
-- 
-- 考点：最基础的 WHERE 条件过滤。
SELECT
	NAME ,
	age
FROM
	EMP E
WHERE
	AGE >= 35;