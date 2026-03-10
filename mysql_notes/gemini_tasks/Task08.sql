-- 背景：goods 表刚建好，产品经理跑过来说：“哎呀，忘了记录商品的详细描述了，而且商品名称 100 个字符可能不够，改大点！”
-- 需求：不允许删表重跑！ 请使用 ALTER TABLE 语句完成以下两个操作：

-- 给 goods 表增加一个新字段 description（商品描述，因为字数可能很多，请使用 TEXT 类型）。
ALTER TABLE `goods` 
		ADD `description` text;

-- 把 goods_name 字段的长度，从原来的 100 修改扩大到 200。
ALTER TABLE `goods`
		MODIFY goods_name varchar(200)
		NOT NULL DEFAULT '';

DESC `goods`;
-- 考点：ALTER TABLE ... ADD ... 以及 ALTER TABLE ... MODIFY ... 的硬核语法。