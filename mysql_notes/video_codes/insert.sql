-- 练习insert 语句
-- 创建一张商品表goods（id int，goods_name varchar（1o），price double）;
-- 添加2条记录

CREATE TABLE `goods`(id int,
	goods_name varchar(10),
	price double);
-- 添加数据
INSERT INTO `goods` (id, goods_name, price)
		VALUES (1, '苹果手机', 9999);

INSERT INTO `goods` (id, goods_name, price)
		VALUES (2, '小米汽车', 29999);

SELECT * FROM `goods`;

CREATE TABLE `goods2`(id int,
	goods_name varchar(10),
	price double NOT NULL DEFAULT 100);

DROP TABLE `goods2`;