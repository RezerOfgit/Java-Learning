-- 背景：随着 weapon_log 里的武器越来越多，运营发现用 WHERE weapon_name = '高频武士刀' 
-- 搜索时越来越慢（发生了极其低效的全表扫描）。
-- 
-- 需求：
-- 请使用 CREATE INDEX 语法，为 weapon_log 表的 weapon_name 字段加上一层普通索引。
-- 按照业界规范，给这个索引专门起个名字，叫 idx_weapon_name。
CREATE INDEX idx_weapon_name ON weapon_log (weapon_name);

SHOW INDEX FROM weapon_log;
-- 考点：CREATE INDEX 索引名 ON 表名(列名); 的语法。