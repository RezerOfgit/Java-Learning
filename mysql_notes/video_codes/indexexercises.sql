-- 建立索引(主键)课后练习
-- 要求：
-- 创建一张订单表order（id号，商品名，订购人，数量）.要求id号为主键，请使·
-- 用2种方式来创建主键.（提示：为练习方便，可以是order1，order2）
CREATE TABLE order1(
		id int PRIMARY KEY ,
		goods_name varchar(32),
		buyer varchar(32),
		nums int);

CREATE TABLE order2(
		id int ,
		goods_name varchar(32),
		buyer varchar(32),
		nums int);
ALTER TABLE order2 ADD PRIMARY KEY (id);

-- 建立索引（唯一）课后练习
-- 要求：
-- 创建一张特价菜谱表menu（id号，菜谱名，厨师，点餐人身份证，价
-- 格）.要求id号为主键，点餐人身份证是unique请使用两种方式来创建
-- unique.（提示：为练习方便，可以是menu1，menu2)
CREATE TABLE menu1(
		id int PRIMARY KEY ,
		recipe varchar(32),
		chef_name varchar(32),
		orderer_id int UNIQUE ,
		price double );

CREATE TABLE menu2(
		id int PRIMARY KEY ,
		recipe varchar(32),
		chef_name varchar(32),
		orderer_id int ,
		price double );
CREATE UNIQUE INDEX idx_orderer_id ON menu2(orderer_id);
-- 建立索引（普通）课堂练习
-- 要求：
-- 创建一张运动员表sportman（id号，名字，特长）.要求id号为主键，
-- 名字为普通索引1，请使用2种方式来创建索引1（提示：为练习方便，可
-- 以是不同表名sportman1，sportman2
CREATE TABLE sportman1(
		id int PRIMARY KEY ,
		`name` varchar(32),
		specialty varchar(32));
CREATE INDEX idx_name ON sportman1(name);
CREATE TABLE sportman2(
		id int PRIMARY KEY ,
		`name` varchar(32),
		specialty varchar(32));
ALTER TABLE sportman2 ADD INDEX idx_name(name);













