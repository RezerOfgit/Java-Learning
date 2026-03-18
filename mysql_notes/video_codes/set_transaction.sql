-- 查看当前会话隔离级别
SELECT @@transaction_isolation;

-- 查看系统当前隔离级别
SELECT @@global.transaction_isolation;

-- 设置当前会话隔离级别
SET SESSION TRANSACTION ISOLATION LEVEL READ UNCOMMITTED ; 

-- 设置系统当前隔离级别
-- SET GLOBAL TRANSACTION ISOLATION LEVEL [你设置的级别]


-- 1.登录mysql控制客户端A，创建表Dog（id，name），开始一个事务，添加两条记录；
-- 2.登录mysgl控制客户端B，开始一个事务，设置为读未提交  
SET SESSION TRANSACTION ISOLATION LEVEL READ UNCOMMITTED;
START TRANSACTION;
SELECT * FROM Dog; -- 可以查到
-- 3.A客户端修改Dog一条记录，不要提交。看看B客户端是否看到变化，说明什么问题？
-- 4.登录mysql客户端C，开始一个事务，设置为读已提交，这时A客户修改一条记录，
-- 不要提交，看看C客户端是否看到变化，说明什么问题？-- 查不到












