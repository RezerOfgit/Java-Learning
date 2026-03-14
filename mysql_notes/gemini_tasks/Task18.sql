-- 背景：之前的 Task12，你按 is_online 分组，统计了在售和下架的商品各有多少个。
-- 现在总监变卦了：“我只想看那些商品数量大于 1 件的组，只有一件商品的组别给我看。”
-- 
-- 需求：请按照 is_online 进行分组，统计每组的商品数量（COUNT(*)）。
-- 但是！最后的结果只显示那些 COUNT(*) 大于 1 的组。
SELECT  IS_ONLINE, COUNT(*)
		FROM GOODS G 
		GROUP BY IS_ONLINE 
		HAVING COUNT(*) > 1;
-- 考点：WHERE 和 HAVING 的本质区别。
-- (💡 核心警告：WHERE 是在分组【前】过滤单行数据的；如果你想在分组【后】对统计出来的结果
-- （比如 COUNT）进行过滤，必须且只能用 HAVING！)




















































































