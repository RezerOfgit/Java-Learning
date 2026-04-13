CREATE TABLE	 `goods` (
	`id` int PRIMARY KEY AUTO_INCREMENT comment '商品 ID',
	`name` varchar(50) NOT NULL comment '商品名称',
	`price` decimal(8,2) comment '商品价格',
	`quantity` int comment '库存数量',
	`stock_time` datetime comment '入库时间',
	`category` varchar(20) comment '商品分类',
	category_id int comment '分类id'
);



INSERT INTO `goods` VALUES 
		(1, '机械键盘', 299.00, 100, now(), '数码', 100),
		(2, '无线鼠标', 99.00, 500, now(), '数码', 100),
		(3, '办公桌', 599.00, 20, now(), '家具', 200),
		(4, '手机', 999.00, 100, now(), '数码', 100),
		(5, '空调', 666.00, 500, now(), '家电', 300),
		(6, '办公桌', 599.00, 20, now(), '家具', 200);

DELETE FROM GOODS WHERE id = 8;

UPDATE GOODS SET QUANTITY = QUANTITY - 1
		WHERE ID = 6;

SELECT * FROM GOODS 
		WHERE id = 6;

SELECT id, name, price, quantity, stock_time, category, category_id FROM GOODS G 
		WHERE NAME LIKE '%鼠%'
		AND CATEGORY_ID = 100;

DELETE FROM GOODS WHERE id IN (4, 5, 6);

SELECT * FROM GOODS ;














