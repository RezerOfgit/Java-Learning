-- 背景：竞争对手来咱们平台爬取数据，他们想找一个和“旧鼠标”定价一模一样，且分类也一模一样的商品。
-- 
-- 需求：
-- 内部先查：查出名叫 '旧鼠标' 的商品的 category_id 和 price（注意，这里查了两列！）。
-- 外部再查：查出所有的 goods_name, category_id, price。
SELECT CATEGORY_ID , PRICE 
		FROM GOODS G 
		WHERE GOODS_NAME = '旧鼠标';

SELECT GOODS_NAME , CATEGORY_ID , PRICE 
		FROM goods
		WHERE (CATEGORY_ID, PRICE) IN (
				SELECT CATEGORY_ID , PRICE 
				FROM GOODS G 
				WHERE GOODS_NAME = '旧鼠标'
		);

-- 核心条件：外部的 (category_id, price) 必须等于内部查出来的那个组合！
-- 考点：多列匹配的语法：WHERE (字段1, 字段2) = (SELECT 字段1, 字段2 FROM ...)。