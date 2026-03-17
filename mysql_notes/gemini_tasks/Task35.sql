-- 背景：在企业开发中，每次 INSERT 都要自己去查上一个 ID 是多少，然后再手动 +1 填进去，
-- 这太反人类了，而且高并发下极易撞车报错。
--
-- 需求：
-- 新建一张表 weapon_log（武器出库记录）。包含两列：id (INT) 和 weapon_name (VARCHAR)。
-- 核心魔法：在定义 id 列时，不仅要把它设为 PRIMARY KEY，还要紧接着加上 AUTO_INCREMENT 关键字！
-- 测试：执行两次 INSERT 插入数据。重点：在插入时，故意不写 id 的值！
-- （例如：INSERT INTO weapon_log (weapon_name) VALUES ('高频武士刀');
-- 和 VALUES ('热能射线枪')）。
CREATE TABLE weapon_log(
		id int PRIMARY KEY AUTO_INCREMENT ,
		weapon_name VARCHAR(32));
INSERT INTO weapon_log (weapon_name) VALUES ('高频武士刀');
INSERT INTO weapon_log VALUES (NULL ,'热能射线枪');
SELECT * FROM weapon_log;
-- 执行 SELECT * 查看表数据，看看数据库是不是自动帮你把 1 和 2 给填上了！
--
-- 考点：AUTO_INCREMENT 机制的语法与缺省插入行为。