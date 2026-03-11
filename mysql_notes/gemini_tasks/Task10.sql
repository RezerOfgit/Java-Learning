-- 需求：财务要求查出所有正在上架（is_online 状态为上架），并且价格大于 500 元的商品。
-- 要求查询结果只显示商品名（goods_name）和单价（price），并且按照价格**从低到高（升序）**排序。
INSERT
	INTO
	goods
VALUES 
(1,
'RTX 5090',
25999.00,
1,
'2026-01-01',
'旗舰显卡'), 
(2,
'机械键盘',
899.50,
1,
'2025-11-11',
'红轴'), 
(3,
'旧鼠标',
15.00,
0,
'2020-05-01',
'双击退役');

SELECT
	goods_name,
	price
FROM
	goods G
WHERE 
	is_online = 1 AND price > 500
ORDER BY
	price ASC;


























