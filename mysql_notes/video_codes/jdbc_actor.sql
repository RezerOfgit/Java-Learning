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
