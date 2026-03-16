-- 背景：你的 goods 表里有一个 id（商品编号），你的 category 表里也有一个 id（分类编号）。
-- 现在产品经理要求：导出一份包含“商品编号、商品名称、分类名称”的报表。
-- 
-- 需求：请写一条多表查询语句（连表条件还是 goods.category_id = category.id），
-- 查询并展示 3 列：id, goods_name, cat_name。
SELECT G.ID AS '商品编号', goods_name AS '商品名称', CAT_NAME AS '分类名称'
		FROM GOODS G , CATEGORY C 
		WHERE G.CATEGORY_ID = C.ID ;


-- 预警：如果你直接在 SELECT 后面写 id，MySQL 会当场报错 Column 'id' in field list is ambiguous（字段 id 模棱两可）。
-- 
-- 考点：请利用表别名（比如给表起名叫 g 和 c），精准告诉 MySQL 你要查的到底是哪张表里的 id！