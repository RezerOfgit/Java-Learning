-- 使用约束的课堂练习
-- 商店售货系统表设计案例
-- 现有一个商店的数据库shop_db，记录客户及其购物情况, 由下面三个表组成：
CREATE DATABASE shop_db;

-- 商品goods（商品号goods_id，商品名goods_name，单价unitprice，商品类别
-- category，供应商provider);
CREATE TABLE `goods` (
		goods_id int PRIMARY KEY ,
		goods_name varchar(32),
		unitprice decimal(10,2) CHECK (unitprice > 1.0 AND unitprice < 9999.99),
		category int NOT NULL DEFAULT 0,
		provider varchar(32));
-- 客户customer（客户号customer_id,姓名name,住址address,电邮email性别sex，身
-- 份证card_Id);
CREATE TABLE `customer`(
		customer_id int PRIMARY KEY,
		`name` varchar(32) NOT NULL DEFAULT '',
		`address` varchar(32) NOT NULL DEFAULT '',
		email varchar(32) UNIQUE NOT NULL ,
		-- sex ENUM('男', '女')NOT NULL 这里使用的枚举类型，是生效
		sex varchar(6) CHECK (sex IN ('男', '女')),
		card_id char(18));
-- 购买purchase（购买订单号order_id，客户号customer_id，商品号goods_id，购买数
-- 量nums);
CREATE TABLE `purchase`(
		order_id int UNSIGNED PRIMARY KEY,
		customer_id int, -- 外键约束在后
		goods_id int NOT NULL DEFAULT 0, -- 外键约束在后
		nums int NOT NULL DEFAULT 0,
		FOREIGN KEY (customer_id) REFERENCES customer(customer_id),
		FOREIGN KEY (goods_id) REFERENCES goods(goods_id));
-- 建表，在定义中要求声明[进行合理设计]：
-- (1)每个表的主外键；
-- (2)客户的姓名不能为空值；
-- (3)电邮不能够重复；
-- (4)客户的性别[男|女] check枚举.
-- (5)单价unitprice 在1.0-9999.99 之间check

DESC goods;
DESC customer;
DESC purchase;


























