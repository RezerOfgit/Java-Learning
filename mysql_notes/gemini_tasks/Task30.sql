-- 背景：会员系统升级，要求用户绑定手机号。虽然手机号不是主键，但也绝对不允许两个人绑定同一个号码！
-- 
-- 需求：
-- 请使用 ALTER TABLE 命令，给你的 vip_member 表新增一列 phone (VARCHAR 类型)。
-- 核心考点：给这个 phone 字段加上 UNIQUE 约束！
ALTER TABLE vip_member
		ADD 	`phone` varchar(32) UNIQUE ;
DESC vip_member;
-- 思考：UNIQUE 约束允许存入 NULL 吗？如果你存入两个 NULL 的手机号，数据库会报错“号码重复”吗？
-- （请大胆猜测或实操验证）

-- UNIQUE 约束允许存入 NULL, 存入两个 NULL 的手机号，数据库不会报错“号码重复”