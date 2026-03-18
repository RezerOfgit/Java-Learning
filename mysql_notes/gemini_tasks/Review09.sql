-- 面试官拷问：“有一张表，id 字段是 PRIMARY KEY AUTO_INCREMENT。在写 INSERT 语句时，
-- 如果我强行在这个 id 的位置塞进去一个 NULL 值，数据库会直接报错崩溃，还是会发生什么神奇的事情？”
-- 
-- 你的任务：直接告诉他答案，证明你是懂 MySQL 底层小动作的实战派。

-- 不会报错崩溃，而是触发“自动生成ID”的隐藏机制，当执行INSERT ... VALUES(NULL, ...)时，
-- MySQL引擎会识别到自增主键列的NULL值，自动将其转换为默认行为——即跳过该值，
-- 转而使用AUTO_INCREMENT机制生成下一个唯一ID。