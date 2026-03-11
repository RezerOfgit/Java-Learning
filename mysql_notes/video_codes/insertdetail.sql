-- 说明insert 语句的细节
-- 1.插入的数据应与字段的数据类型相同。
-- 	比如把'abc'添加到int类型会错误
INSERT INTO `goods` (id, GOODS_NAME, PRICE)
		VALUES ('3', 'OPPO手机', 2000); -- '3'数字可以转换为int, 'abc'不可以会报错
-- 2.数据的长度应在列的规定范围内，例如：不能将一个长度为80的字符串加入到长度为40的列中。
INSERT INTO `goods` (id, GOODS_NAME, PRICE)
	VALUES (4, '华为手机华为手机华为手机华为手机华为手机华为手机', 8000); 	
-- 3.在values中列出的数据位置必须与被加入的列的排列位置相对应。
INSERT INTO `goods` (id, GOODS_NAME, PRICE)
	VALUES ('华为手机', 4, 8000); -- 不可以
INSERT INTO `goods` (GOODS_NAME, id, PRICE)
	VALUES ('华为手机', 4, 8000); 	
-- 4.字符和日期型数据应包含在单引号中。
INSERT INTO `goods` (id, GOODS_NAME, PRICE)
		VALUES ('3', OPPO手机, 2000); -- 错误, OPPO手机 应该'OPPO手机'
-- 5.列可以插入空值[前提是该字段允许为空]，insert into table value(null)
INSERT INTO `goods` (id, GOODS_NAME, PRICE)
		VALUES (5, 'VIVO手机', NULL );	-- 前提是该字段允许为空, 没有not null
-- 6.insert into tab_name(列名..) values(),(),()形式添加多条记录
INSERT INTO `goods` (id, GOODS_NAME, PRICE)
		VALUES (6, '三星手机', 6000 ), (7, '魅族手机', 2500);
-- 7.如果是给表中的所有字段添加数据，可以不写前面的字段名称
INSERT INTO GOODS 
		VALUES (8, '荣耀手机', 1500);
-- 8.默认值的使用，当不给某个字段值时，如果有默认值就会添加，否则报错
-- 如果某个列没有指定not null，那么当添加数据时，没有给定值，则会默认给null
-- 如果我们希望指定某个列的默认值，可以在创建表时指定
INSERT INTO GOODS (id, GOODS_NAME)
		VALUES (9, '谷歌手机');
		
SELECT * FROM GOODS G ;
		
INSERT INTO `goods2` (id, GOODS_NAME)
		VALUES (10, '传音手机');

SELECT * FROM `goods2`;










		
		
		
		
		
		
		
		
		
		