-- 请在 DBeaver 的 SQL 编辑器中，手敲并按顺序执行以下 SQL 模拟“扣减库存”的事务动作（注意观察每一步的结果）：
-- 
-- 开启事务：START TRANSACTION;
-- 执行更新：将 id=1 的机械键盘库存减 1。
-- 此时不要急着提交！ 新开一个 DBeaver 的查询窗口（模拟另一个用户的视角），去查一下 id=1 的库存，
-- 看看有没有变化？（带着这个观察结果来回答我）。
-- 回到第一个窗口，执行回滚操作：ROLLBACK;（模拟系统崩溃，取消操作）。
-- 再次查询库存，确认数据是否安然无恙。

SELECT * FROM GOODS G ;

START TRANSACTION ;

UPDATE GOODS SET STOCK_QUANTITY = STOCK_QUANTITY - 1
		WHERE ID = 1;

-- 去查一下 id=1 的库存，看看有没有变化？（带着这个观察结果来回答我）。
-- 没有变化
ROLLBACK ;
-- 再次查询库存，确认数据安然无恙。
-- 为什么新开窗户查询goods表格数据没有变化, 但是如果在本页上方查询goods库存数量就-1?
















