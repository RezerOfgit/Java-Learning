-- 背景：前端小哥跑来找你：“咱们网页的推荐位太小了，一次只能放下 2 个商品，
-- 你别把所有数据都一股脑塞给我，网页会卡死的！”
-- 需求：请写一条 SQL，查询 goods 表里的 goods_name 和 price。
-- 要求按价格从高到低（降序）排列，并且只取出前 2 条数据。
SELECT GOODS_NAME , PRICE
		FROM GOODS G 
		ORDER BY PRICE DESC 
		LIMIT 0, 2;
-- 考点：ORDER BY 结合 LIMIT 关键字的使用。（这是后端实现“下一页”功能的核心底牌）。