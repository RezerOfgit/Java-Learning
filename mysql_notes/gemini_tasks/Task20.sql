-- 背景：真正的多表查询，必须找到两张表之间的“信物（关联字段）”。
-- 
-- 需求：请同时查询 goods 和 category 表。我们需要显示：商品名称 (goods_name) 
-- 和它对应的 分类名称 (cat_name)。
-- 要求：必须使用 WHERE 子句，让 goods 表里的 category_id 等于 category 表里的 id，
-- 把它们精准地关联起来！
SELECT goods_name, CAT_NAME 
		FROM goods, category
		WHERE goods.CATEGORY_ID = category.ID ;
-- 考点：多表连接的过滤条件（WHERE 表1.字段 = 表2.字段）。