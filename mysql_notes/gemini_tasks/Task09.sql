-- 需求：请写出两句特殊的 INSERT 语句来测试你建表时的约束边界：
-- 
-- 测试防空洞：插入一条商品，只指定 id 和 price，故意不写 goods_name，
-- 看看你昨天加的 NOT NULL DEFAULT '' 会不会自动用空字符串兜底填入，会不会报错。
INSERT INTO GOODS (id, PRICE)
		VALUES (1, 1000);
-- 测试边界值：插入一台价值 9999999.99（七百万）的服务器，看看 DECIMAL(8,2) 
INSERT INTO GOODS (id, PRICE, GOODS_NAME)
		VALUES (2, 9999999.99, '服务器');
-- 会不会拦住它并报错（思考一下 8 和 2 代表的总位数和小数位数）。
SELECT * FROM GOODS G ;