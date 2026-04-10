-- 编写 SQL 语句：
-- 
-- 1. 新建分类表：创建一个 category_info 表，包含 id (主键，自增) 和 category_name (分类名称，VARCHAR)。
-- 2. 重构商品表：给现有的 goods 表增加一个字段 category_id (INT 类型)。
-- 3. 建立纽带：为 goods 表的 category_id 增加一个外键约束 (Foreign Key)，
-- 让它关联到 category_info 表的 id 字段上。

CREATE TABLE `category_info`(
		id int PRIMARY KEY AUTO_INCREMENT ,
		category_name varchar(32) comment '分类名称'
);
SELECT * FROM CATEGORY_INFO CI ;

ALTER TABLE GOODS ADD category_id int;

SELECT * FROM GOODS G ;

ALTER TABLE GOODS ADD CONSTRAINT fk_category_id 
		FOREIGN KEY (category_id) 
		REFERENCES category_info(id);
















