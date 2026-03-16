-- 背景：财务总监核对资产，要求看所有商品的报表，看看它们属于哪个分类。他强调：“有些新录入的商品还没来
-- 得及分配分类，但也必须在报表里显示出来，分类名留空即可！”
-- 
-- 需求：请使用 RIGHT JOIN ... ON ... 语法，依然保持 category 表在左边，
-- goods 表在右边。查询 goods_name 和 cat_name。
SELECT * FROM CATEGORY C ;
SELECT * FROM GOODS G ;

SELECT category.id, CAT_NAME , goods_name
		FROM category RIGHT JOIN goods 
		ON category.id = goods.CATEGORY_ID ;

-- 考点：右外连接的特性（强制完全展示右侧表的所有数据）。