-- 演示mysql的事务隔离级别

-- 1.开了两个mysql的控制台
-- 2．查看当前mysql的隔离级别

SELECT @@transaction_isolation;
mysql> SELECT @@transaction_isolation;
+-------------------------+
| @@transaction_isolation |
+-------------------------+
| REPEATABLE-READ         |
+-------------------------+

-- 3.把其中一个控制台的隔离级别设置Read uncommitted
SET SESSION TRANSACTION ISOLATION LEVEL READ UNCOMMITTED;