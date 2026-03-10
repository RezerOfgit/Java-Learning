-- Task07：极致抠门的架构师（数据类型实战 P742-P747）
-- 背景：公司的硬盘很贵，老板要求建表时必须“斤斤计较”，绝不能所有字段都无脑用 VARCHAR(255) 或者 INT。
-- 需求：在 gemini_db 中创建一张商品表 goods，包含以下字段，请你选择最合适的数据类型：
CREATE TABLE `goods`(
		id int, -- 商品编号 id（普通的整数即可）
		goods_name varchar(100), -- 商品名称 goods_name（最多支持 100 个字符）
		price decimal(8, 2), -- 商品单价 price（要求非常精确，总共 8 位数，其中 2 位是小数。
		is_online bit(1), -- 上架状态 is_online（只有两种状态：0 代表下架，1 代表上架。
		produce_date date); -- 生产日期 produce_date（只需要记录年月日，不需要时分秒）
DESC `goods`;

-- 考点：DECIMAL, BIT (或 TINYINT), DATE 等核心数据类型的使用。