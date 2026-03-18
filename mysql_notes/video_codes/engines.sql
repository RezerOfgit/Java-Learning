-- 表类型和存储引擎

-- 查看所有的存储引擎
SHOW engines;

-- innodb 存储引擎，是前面使用过
-- 1. 支持事务 2. 支持外键 3. 支持行级锁

-- myisam 存储引擎
CREATE TABLE t28(
		id int,
		`name` varchar(32)) ENGINE myisam;
-- 1. 添加速度快 2. 不支持外键和事务 3. 支持表级锁

START TRANSACTION ;
SAVEPOINT t1;
INSERT INTO t28 VALUES (1, 'jack');
SELECT * FROM t28;
ROLLBACK TO t1; -- 未报错, 但实际未回退Some non-transactional changed tables couldn't be rolled back

-- memory存储引擎
-- 1. 数据存储在内存中[关闭了Mysql服务，数据丢失，但是表结构还在]
-- 2. 执行速度很快（没有IO读写）3．默认支持索引（hash表）
CREATE TABLE t29(
		id int,
		`name` varchar(32)) ENGINE memory ;

INSERT INTO t29 
		VALUES (1, 'jack'), (2, 'tom'), (3, 'milan');
SELECT * FROM t29;
DESC t29;

-- 指令修改存储引擎
ALTER TABLE `t29` ENGINE = innodb;

