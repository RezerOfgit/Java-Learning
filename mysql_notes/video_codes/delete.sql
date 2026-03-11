-- delete 语句演示
-- 删除表中名称为marry的记录。
DELETE
FROM
	EMPLOYEE
WHERE
	user_name = 'marry';

CREATE TABLE test01(
		id int);

INSERT INTO TEST01 VALUES (1);

SELECT * FROM test01;
-- 删除表中所有记录，老师提醒，一定要小心
DELETE FROM test01;

-- 要删除这个表
DROP TABLE TEST01 ;

-- Delete语句不能删除某一列的值(可使用 update 设为 null 或者'')
UPDATE EMPLOYEE SET job = '' WHERE user_name = 'jack';

SELECT * FROM EMPLOYEE E ;














