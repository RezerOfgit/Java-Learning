-- 编写 SQL 语句：
-- 
-- 1. 标量子查询（单值）：查询出价格高于所有商品“平均价格”的商品名称和价格。
-- (提示：先写一个查平均价格的 SQL，把它用括号括起来，作为主查询的 WHERE 条件)。
-- 
-- 2. 列子查询（多值）：查询出分类为 '数码' 或 '家具' 的所有商品信息。
-- (约束：绝不允许在 goods 表里直接写 WHERE category_id IN (1, 3) 这种硬编码！
-- 必须通过子查询去 category_info 表里根据名字查出 ID 集合，再喂给主查询)。

SELECT AVG(PRICE) FROM GOODS G ;

SELECT GOODS_NAME, PRICE 
		FROM GOODS G 
		WHERE PRICE > (
				SELECT AVG(PRICE) FROM GOODS G);

SELECT ID FROM CATEGORY_INFO CI 
		WHERE CI.CATEGORY_NAME IN ('数码', '家具');

SELECT * FROM GOODS G 
		WHERE CATEGORY_ID IN (
				SELECT ID FROM CATEGORY_INFO CI 
				WHERE CI.CATEGORY_NAME IN ('数码', '家具'));





























