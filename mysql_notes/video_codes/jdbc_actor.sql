CREATE TABLE actor(
		id int PRIMARY KEY AUTO_INCREMENT ,
		name varchar(32) NOT NULL DEFAULT '',
		sex char(1) NOT NULL DEFAULT '女',
		borndate datetime ,
		phone varchar(12));

SELECT * FROM actor;