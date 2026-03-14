-- 背景：仓库里有些商品放得太久了，仓管员想知道每件商品从生产出来到现在，到底过了多少天。
-- 需求：请写一条 SQL，查询商品的 goods_name，produce_date（生产日期），
-- 并使用 DATEDIFF() 函数计算出：从今天起，距离生产日期已经过去了多少天。
-- 给这个计算出来的列起个别名叫 '已生产天数'。

SELECT GOODS_NAME, DATEDIFF(NOW(), PRODUCE_DATE) 
			AS '已生产天数' FROM GOODS G ;
-- 考点：DATEDIFF(date1, date2) 的使用，以及如何获取当前日期（CURRENT_DATE() 
-- 或 NOW()）。
-- (💡 提示：算相差天数时，记得是 大日期 减去 小日期 哦！)