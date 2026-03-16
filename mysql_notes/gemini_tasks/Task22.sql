-- 背景：财务部要求查出库房里**“价格高于平均单价”**的所有商品。
-- 难点：你不能直接写 WHERE price > AVG(price)，因为聚合函数不能直接跟在 WHERE 后面比较。
-- 你需要用两步逻辑合并成一步！
-- 
-- 需求：请写一条子查询（查中查）。
-- 内部先查：算出现有商品的总平均价 (SELECT AVG(price) FROM goods)。
-- 外部再查：查出 goods_name 和 price，条件是 price > 刚才那个内部查询的结果。
SELECT AVG(PRICE) 
		FROM GOODS G ;
SELECT GOODS_NAME , PRICE 
		FROM GOODS G 
		WHERE PRICE > (
			SELECT AVG(PRICE) 
			FROM GOODS G
);

-- 考点： 深刻理解子查询的执行顺序（永远是括号里的“内部查询”先执行，算出结果后，再喂给“外部查询”当条件）。