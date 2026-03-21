-- 1.创建 news表
-- 2.使用jdbc添加5条数据
-- 3.修改id=1的记录，将content改成一个新的消息
-- 4.删除id=3的记录
CREATE TABLE mynews(
		id int,
		content varchar(32));
INSERT INTO mynews 
		VALUES (1, '北京新闻');
INSERT INTO mynews 
		VALUES (2, '上海新闻');
INSERT INTO mynews 
		VALUES (3, '江苏新闻');
INSERT INTO mynews 
		VALUES (4, '安徽新闻');
INSERT INTO mynews 
		VALUES (5, '浙江新闻');

















