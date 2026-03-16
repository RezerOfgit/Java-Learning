-- 查询ecshop中各个类别中，价格最高的商品

-- 查询 商品表
-- 先得到 各个类别中，价格最高的商品 max + group by cat_id，当做临时表
-- 把子查询当做一张临时表可以解决很多很多复杂的查询

SELECT CAT_ID ,MAX(SHOP_PRICE) 
		FROM ecs_goods
		GROUP BY CAT_ID ;
SELECT goods_id, ecs_goods.CAT_ID ,goods_name, shop_price
		FROM (
			SELECT CAT_ID ,MAX(SHOP_PRICE) AS max_price
			FROM ecs_goods
			GROUP BY cat_id
		) temp, ecs_goods
		WHERE temp.cat_id = ecs_goods.CAT_ID 
		AND temp.max_price = ecs_goods.shop_price;