-- 背景：运营总监想知道，到底有多少商品在卖，多少商品被下架了。
-- 
-- 需求：请按照 is_online（上架状态）对商品进行分组，查出每种状态的值（0 或 1），
-- 以及该状态下有多少件商品。
SELECT COUNT(*) , IS_ONLINE FROM GOODS G 
			GROUP BY IS_ONLINE ;
-- 考点：GROUP BY 的核心用法。
-- (💡 提示：你的 SELECT 后面应该有两个东西，一个是用来分组的列 is_online，
-- 另一个是用来数数的 COUNT(*))