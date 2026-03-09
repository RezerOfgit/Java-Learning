-- 备份恢复数据库的表
-- 备份库的表
mysqldump -u root -p123456 hsp_db02 t1 > d:\\t1_bak.SQL

-- 删除t1表
DROP TABLE t1;

-- 恢复数据库（注意：进入Mysql命令行再执行）
mysql -u root -p123456 hsp_db02 < d:\t1_bak.sql

-- 第二个恢复方法，直接将bak.sql的内容放到查询编辑器中，执行