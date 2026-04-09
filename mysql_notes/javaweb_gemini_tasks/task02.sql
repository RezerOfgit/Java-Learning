-- 编写 SQL 语句：在 `product_db` 中创建一张商品表，表名为 `goods`。
-- 
-- 要求包含以下字段（注意根据数据类型规范选择最合适的 MySQL 类型）：
-- - 商品 ID：主键，必须自动递增。   
-- - 商品名称：字符串（最大 50 字符），不能为空。   
-- - 商品价格：浮点数或小数类型（例如 99.99）。    
-- - 库存数量：整数。    
-- - 入库时间：日期时间类型。
CREATE TABLE	 `goods` (
	`ID` int PRIMARY KEY AUTO_INCREMENT comment '商品 ID',
	`goods_name` varchar(50) NOT NULL comment '商品名称',
	`price` decimal(5,2) comment '商品价格',
	`stock_quantity` int comment '库存数量',
	`stock_in_time` datetime comment '入库时间'
);
























