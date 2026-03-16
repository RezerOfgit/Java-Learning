-- 给分类表插入一个“虚拟商品”分类（目前没有任何商品属于它）
INSERT INTO category VALUES (3, '虚拟商品');

-- 给商品表插入一个“神秘盲盒”，故意不给它分配 category_id (让它为 NULL)
INSERT INTO goods (id, goods_name, price) VALUES (4, '神秘盲盒', 99.00);

SELECT * FROM CATEGORY C ;
SELECT * FROM GOODS G ;
-- 背景：运营总监要求看所有分类的报表，看看每个分类下有哪些商品。他特别强调：
-- “哪怕这个分类下现在一件商品都没有，你也必须把分类名字给我列出来，商品名那里留空就行！”
-- 
-- 需求：请使用 LEFT JOIN ... ON ... 语法，以 category 表为主表（放在 LEFT JOIN 左边），
-- goods 表为从表。查询 cat_name 和 goods_name。
SELECT category.id, CAT_NAME , goods_name
		FROM category LEFT JOIN goods 
		ON category.id = goods.CATEGORY_ID ;

-- 考点：左外连接的特性（左表的数据全部显示，哪怕右表没有匹配项，也会用 NULL 填充）。