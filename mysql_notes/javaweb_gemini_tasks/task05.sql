-- 编写 SQL 语句：刚刚发生了销售和调价，请将 '无线鼠标' 的库存修改为 `450`，
-- 同时将其价格修改为 `89.00`。

UPDATE
	`goods`
SET
	STOCK_QUANTITY = 450,
	PRICE = 89.00
WHERE
	ID = 2;

SELECT * FROM `goods`;