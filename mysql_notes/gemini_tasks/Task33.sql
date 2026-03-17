-- 背景：除了表和表之间的关系，我们还要对单列的数据内容做极其严格的限制。比如性别只能是“男”或“女”。
-- (💡 提示：你的技术栈基准是 MySQL 8.0.45，从 MySQL 8.0 开始，CHECK 约束已经全面生效，
-- 不再是 5.7 时代那个只会“假装看看”的摆设了！)

-- 需求：
-- 
-- 新建一张表 test_person，包含 id (INT), name (VARCHAR), gender (VARCHAR)。
-- 在建表语句的最后，加上 CHECK 约束，要求 gender IN ('男', '女')。
-- 尝试插入一条数据，把性别写成 '外星人'。把爆红的错误信息发给我！

CREATE TABLE test_person(
		id int,
		`name` varchar(32),
		gender varchar(16) CHECK (gender IN ('男', '女')));
INSERT INTO test_person
		VALUES (1, 'jack', '外星人');
-- SQL Error [3819] [HY000]: Check constraint 'test_person_chk_1' is violated.
