-- 背景：加了索引后，查询确实变快了。但是！后勤部疯狂抱怨：“现在每次新进一把武器（执行 INSERT），
-- 系统都卡得要死！”
-- (💡 核心顿悟：索引就像新华字典的目录，查字确实快了，但每次你往字典里新加一个字，
-- 不仅要加正文，还得去修改目录！所以索引会严重拖慢增删改的速度！)
-- 
-- 需求：综合考量后，架构师决定牺牲查询速度，保住入库速度。请写出 SQL 代码，
-- 删除 weapon_log 表上的 idx_weapon_name 索引。
DROP INDEX idx_weapon_name ON weapon_log;

ALTER TABLE weapon_log DROP INDEX idx_weapon_name;


-- 考点：DROP INDEX 索引名 ON 表名; 或者 ALTER TABLE 表名 DROP INDEX 索引名; 的语法。