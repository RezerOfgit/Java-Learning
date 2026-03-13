-- 背景：老板不想看密密麻麻的商品明细，他只要宏观的汇总数据。
-- 需求：写一条 SQL，同时算出以下三个数据：
-- 
-- 库房里一共有多少件商品？（给列起个别名：'商品总数'）
SELECT COUNT(*) AS '商品总数' FROM GOODS G; 

-- 所有商品的平均价格是多少？（别名：'平均单价'）
SELECT AVG(price) AS '平均单价' FROM GOODS G;

-- 库房里最贵的商品单价是多少？（别名：'最高单价'）
SELECT MAX(price) AS '最高单价' FROM GOODS G; 
-- 考点：COUNT(), AVG(), MAX() 聚合函数的组合使用。
SELECT 
    COUNT(*) AS '商品总数', 
    AVG(price) AS '平均单价', 
    MAX(price) AS '最高单价' 
FROM GOODS G;