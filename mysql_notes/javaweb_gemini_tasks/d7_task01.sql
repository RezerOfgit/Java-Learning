-- 编写 SQL 语句：
-- 
-- 1. 查询分类（category）为 '数码' 且价格（price）大于 100.00 的所有商品，
-- 要求只显示商品名称和价格，并且按照价格降序 (DESC) 排列。

SELECT GOODS_NAME, PRICE FROM GOODS G 
		WHERE CATEGORY = '数码' AND PRICE > 100.00
		ORDER BY PRICE DESC ;

-- 2. 查询商品名称（goods_name）中包含 '鼠标' 两个字的所有商品记录（提示：使用模糊查询 LIKE），
-- 并按照库存数量升序排列。

SELECT * FROM GOODS G 
		WHERE GOODS_NAME LIKE '%鼠标%'
		ORDER BY STOCK_QUANTITY ASC ;


SELECT * FROM GOODS G ;

INSERT INTO `goods` VALUES 
		(3 , '手机', 999.00, 100, now(), '数码'),
		(4, '空调', 666.00, 500, now(), '家电'),
		(5, '办公桌', 599.00, 20, now(), '家具');

