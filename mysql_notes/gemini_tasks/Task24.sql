-- 背景：咱们的“1号分类（电子核心）”都是高端货，“2号分类（电脑外设）”相对便宜。老板想搞个噱头，
-- 查出：有没有哪个 1 号分类的商品，比 2 号分类里【所有】商品的单价都要高？
-- 
-- 需求：
-- 内部先查：查出 category_id = 2 的所有商品的 price（这会返回一列价格数字，
-- 比如 899.50 和 15.00）。
-- 外部再查：查出 category_id = 1 的商品名称和价格。
SELECT PRICE 
		FROM GOODS G 
		WHERE CATEGORY_ID = 2;

SELECT GOODS_NAME , PRICE 
		FROM goods 
		WHERE CATEGORY_ID = 1
		AND PRICE > ALL (
			SELECT PRICE 
			FROM GOODS G 
			WHERE CATEGORY_ID = 2
		);



-- 核心条件：外部商品的价格，必须 > ALL (大于内部查询出来的所有价格)。
-- 考点：> ALL（大于最大的）和 > ANY（大于最小的）的实战意义。