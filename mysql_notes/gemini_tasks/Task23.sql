-- 背景：运营要在“机械键盘”的详情页下面，做一个“猜你喜欢”的同类商品推荐模块。
-- 
-- 需求：请写一条子查询。
-- 内部先查：查出名叫 '机械键盘' 的商品，它的 category_id 是多少？（它可能会查出一个值，
-- 如果在别的表里可能会查出一列值）。
-- 外部再查：查出 goods 表里，所有属于这个 category_id 的 goods_name 和 price。
SELECT CATEGORY_ID 
		FROM GOODS G 
		WHERE GOODS_NAME = '机械键盘';
SELECT GOODS_NAME ,PRICE 
		FROM goods
		WHERE CATEGORY_ID = (
				SELECT CATEGORY_ID 
				FROM GOODS G 
				WHERE GOODS_NAME = '机械键盘'
		);



-- 注意：外部接收时，尽量使用 IN 关键字，而不是 =（因为 IN 可以完美兼容内部查询返回多个结果的情况）。
-- 考点：WHERE 字段 IN (子查询) 的用法。