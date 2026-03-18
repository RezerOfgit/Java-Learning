-- 查看当前会话隔离级别
SELECT @@transaction_isolation;

-- 查看系统当前隔离级别
SELECT @@global.transaction_isolation;

-- 设置当前会话隔离级别
SET SESSION TRANSACTION ISOLATION LEVEL READ UNCOMMITTED ; 

-- 设置系统当前隔离级别
-- SET GLOBAL TRANSACTION ISOLATION LEVEL [你设置的级别]