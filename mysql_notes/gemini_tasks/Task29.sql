-- 背景：公司要上线一套 VIP 会员系统，必须保证每个会员的编号（ID）是全宇宙独一无二的，且绝对不能为空。
-- 
-- 需求：
-- 请新建一张表叫 vip_member。
-- 包含两个字段：id (整数型) 和 name (字符串)。
CREATE TABLE vip_member(
		id int PRIMARY KEY,
		`name` varchar(32));
INSERT INTO vip_member
		VALUES (1, 'jack');
INSERT INTO vip_member
		VALUES (1, 'tom');
DESC vip_member;
-- 报错内容:SQL Error [1062] [23000]: Duplicate entry '1' for key 'vip_member.PRIMARY'
-- 核心考点：在建表时，给 id 字段加上 PRIMARY KEY 约束！
-- 测试：建好后，尝试插入两条 id 都是 1 的数据。观察并把第二次插入时的报错信息发给我！