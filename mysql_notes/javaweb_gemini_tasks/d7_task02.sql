-- 编写 SQL 语句：
-- 
-- 1. 统计计算：求出目前所有 '数码' 类商品的总库存量（SUM）和平均价格（AVG）。
-- 2. 分组统计：按照商品分类（category）进行分组，统计出每个分类下有多少件商品，
-- 以及该分类下的最高价格。

SELECT SUM(STOCK_QUANTITY) AS '总库存量', AVG(PRICE) AS '平均价格' FROM GOODS G 
		WHERE CATEGORY = '数码';

SELECT CATEGORY AS '商品分类', COUNT(*) AS '分类下商品总数', max(PRICE) AS '最高价格'
		FROM GOODS G 
		GROUP BY CATEGORY ;