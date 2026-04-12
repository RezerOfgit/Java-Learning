-- 编写 SQL 语句：
-- 
-- 1. 内连接 (INNER JOIN)：查询所有商品的信息，要求结果中不仅要有商品名 (goods_name) 和
-- 价格 (price)，还要显示它对应的分类名称 (category_name)。
-- (提示：利用两张表的 category_id = id 作为连接条件)。

-- 2. 左外连接 (LEFT JOIN)：查询所有的分类名称，以及该分类下的商品名称。
-- 要求：即使像“服饰”这种目前没有任何商品的分类，也必须展示在结果里（商品名显示为 NULL）。

SELECT * FROM GOODS G ;

SELECT * FROM CATEGORY_INFO CI ;

SELECT g.GOODS_NAME, g.PRICE ,ci.CATEGORY_NAME 
		FROM GOODS G INNER JOIN CATEGORY_INFO CI ON
		g.CATEGORY_ID = CI.ID ;

SELECT g.CATEGORY, g.GOODS_NAME 
		FROM GOODS G LEFT JOIN CATEGORY_INFO CI ON 
		g.CATEGORY_ID = CI.ID ;















