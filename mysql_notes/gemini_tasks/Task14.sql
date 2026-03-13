-- 背景：财务部说咱们的系统太死板了，连个几毛钱都要算，结账太麻烦，要求全部“抹零”。
-- 
-- 需求：请查询所有商品的 goods_name 和 price。但是 price 这一列不能显示原价，
-- 要求使用 FLOOR()（向下取整，直接砍掉小数）或者 ROUND()（四舍五入，保留 0 位小数），
-- 把处理后的价格展示出来，并起个别名叫 '抹零价'。
SELECT GOODS_NAME, FLOOR(PRICE) AS '抹零价' FROM GOODS G ;
SELECT GOODS_NAME, ROUND(PRICE, 0) AS '抹零价' FROM GOODS G ;
-- 考点：单行数学函数的处理逻辑。