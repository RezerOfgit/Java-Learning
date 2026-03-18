-- 基于刚才创建的 dev_viewer 账号：
-- 
-- 数据库中有一个名为 e_commerce 的库，里面有一张 orders（订单表）。
-- 请编写 SQL，只赋予该用户对 e_commerce.orders 表的 查询 (SELECT) 权限。
-- （绝对不能给修改或删除权限）。
GRANT SELECT
		ON e_commerce.orders
		TO  dev_viewer;
-- 后来发现这个账号有越权风险，安全部门要求立刻收回他对 e_commerce.orders 表的查询权限。
-- 请编写对应的收回权限 (REVOKE) 语句。
REVOKE SELECT
		ON e_commerce.orders
		FROM  dev_viewer;
-- （补充细节）在修改完权限后，通常需要执行哪条命令让权限立刻生效？
flush PRIVILEGES ;