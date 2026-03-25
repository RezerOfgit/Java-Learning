CREATE TABLE actor(
		id int PRIMARY KEY AUTO_INCREMENT ,
		name varchar(32) NOT NULL DEFAULT '',
		sex char(1) NOT NULL DEFAULT '女',
		borndate datetime ,
		phone varchar(12));

SELECT * FROM actor;

-- 增加2条记录，用于测试ResultSet
INSERT INTO ACTOR 
		VALUES (NULL ,'jack', '男', '1990-11-11', '112');
INSERT INTO ACTOR 
		VALUES (NULL ,'刘德华', '男', '1988-11-11', '110');

CREATE TABLE account(
		id int PRIMARY KEY AUTO_INCREMENT ,
		name varchar(32) NOT NULL DEFAULT '',
		balance double NOT NULL DEFAULT 0) CHARACTER SET utf8;

INSERT INTO account
		VALUES (NULL, '马云', 3000);
INSERT INTO account
		VALUES (NULL, '马化腾', 10000);

SELECT * FROM account;

-- 创建测试表
CREATE TABLE admin2(
		id int PRIMARY KEY AUTO_INCREMENT ,
		username varchar(32) NOT NULL,
		password varchar(32) NOT NULL );
SELECT COUNT(*) FROM admin2;
DROP TABLE admin2;

SELECT * FROM GOODS G ;




























