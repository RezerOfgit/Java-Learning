-- 1. 创建一张“商品分类表”
CREATE TABLE category (
    id INT, 
    cat_name VARCHAR(50)
);

-- 2. 插入两个分类：1号是电子产品，2号是电脑外设
INSERT INTO category VALUES (1, '电子核心'), (2, '电脑外设');

-- 3. 给你的 goods 表加一个“分类编号”字段，让它们能扯上关系
ALTER TABLE goods ADD category_id INT;

-- 4. 把现有的商品归类（RTX 归 1 类，键盘鼠标归 2 类）
UPDATE goods SET category_id = 1 WHERE goods_name LIKE '%RTX%';
UPDATE goods SET category_id = 2 WHERE goods_name NOT LIKE '%RTX%';

SELECT * FROM category;
SELECT * FROM GOODS G ;