-- 假设你入职了一家新公司，需要为开发团队创建一个公共只读账号。请编写 SQL：
-- 
-- 创建一个用户名为 dev_viewer 的账号，允许他从任何 IP 地址连接数据库，初始密码设为 Dev@2026。
CREATE USER dev_viewer identified BY 'Dev@2026';
-- （安全合规要求）入职一周后，要求强制修改密码。请写出在 MySQL 8.0 中，将 dev_viewer 
-- 的密码修改为 Safe_Dev@888 的标准 SQL 语句。
ALTER USER dev_viewer identified BY 'Safe_Dev@888';