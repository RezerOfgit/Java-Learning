-- 编写 SQL 语句：由于业务扩展，现在需要在已存在的 `goods` 表中，新增一个字段叫
-- `category`（商品分类），类型为字符串（最大 20 字符）。


ALTER TABLE `goods` ADD
		`category` varchar(20) comment '商品分类';

DESC `goods`;

SELECT * FROM `goods`;