-- 背景：运营搞活动，要求列出一份名单，把满足以下两个条件之一的商品都塞进一张表里：
-- 条件 A：价格大于 500 元的。
-- 条件 B：分类是 1 号（电子核心）的。
-- 
-- 需求：
-- 请写两个独立的 SELECT 查询（一个是条件 A，一个是条件 B）。
-- 然后，使用 UNION 关键字把这两段代码上下缝合在一起！
SELECT GOODS_NAME , CATEGORY_ID ,PRICE 
		FROM goods
		WHERE PRICE > 500
UNION  
SELECT GOODS_NAME , CATEGORY_ID ,PRICE 
		FROM goods
		WHERE CATEGORY_ID = 1;

-- 观察与思考：运行之后，看看 RTX 5090（它既大于500元，又是1号分类）在结果里出现了几次？
-- 如果把 UNION 换成 UNION ALL，结果又有什么不同？
-- union all就是将两个查询结果合并，不会去重
-- UNION 就是将两个查询结果合并，会去重
-- 考点：将两个查询结果集合并（去重 vs 不去重）。