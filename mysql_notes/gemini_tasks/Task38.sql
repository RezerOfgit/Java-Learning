CREATE TABLE bank_account ( 
		id INT PRIMARY KEY,
		name VARCHAR(32),
		balance DECIMAL(10, 2) );

INSERT INTO bank_account 
		VALUES (1, '马云', 1000.00), (2, '马化腾', 1000.00);


-- 需求：
-- 开启事务：执行 START TRANSACTION;。
-- 马云给马化腾转 500 元：写两条 UPDATE 语句（马云余额 -500，马化腾余额 +500）。
-- 核心操作：假装此时系统崩溃了！请立刻执行 ROLLBACK; (回滚)。
-- 查表：SELECT * FROM bank_account; 看看马云的钱是不是被数据库救回来了？
START TRANSACTION;
UPDATE BANK_ACCOUNT 
		SET BALANCE = BALANCE - 500
		WHERE NAME = '马云';
UPDATE BANK_ACCOUNT 
		SET BALANCE = BALANCE + 500
		WHERE NAME = '马化腾';
SELECT * FROM BANK_ACCOUNT BA ;
ROLLBACK ;


-- 考点：START TRANSACTION, COMMIT (提交/永久保存), ROLLBACK (回滚/撤销) 的使用。


















