-- 背景：咱们不照抄视频里的普通商店，我们来开一家“赛博朋克装备店”。
-- 你需要设计两张表，并且把这段时间学的所有约束全都用上！
-- 
-- 需求：
-- 创建客户表 cyber_customer：
-- id (INT，必须是主键)。
-- nickname (VARCHAR，必须非空 NOT NULL，且必须唯一 UNIQUE)。
CREATE TABLE cyber_customer(
		id int PRIMARY KEY ,
		nickname varchar(32) UNIQUE NOT NULL DEFAULT '');
-- 创建订单表 cyber_order：
-- order_id (INT，必须是主键)。
-- customer_id (INT，外键，关联到客户表的 id)。
-- amount (DECIMAL(10,2)，订单金额，必须加 CHECK 约束，要求金额 >= 0)。
CREATE TABLE cyber_order(
		order_id int PRIMARY KEY ,
		customer_id int,
		amount decimal(10, 2) CHECK (amount >= 0),
		FOREIGN KEY (customer_id) REFERENCES cyber_customer(id));
DESC cyber_customer;
DESC cyber_order;
-- 考点：综合运用 PRIMARY KEY, NOT NULL, UNIQUE, FOREIGN KEY, CHECK 构建严密的业务底层架构。