CREATE TABLE product(
		id int,
		`name` varchar(32),
		price decimal(8, 2));
SELECT * FROM product;
INSERT into product values(200, '手机', 3000);
INSERT into product values(300, '电脑', 5000);
INSERT into product values(400, '鼠标', 90);


CREATE TABLE account (
		id int,
		balance decimal(8, 2));
SELECT * FROM account;
INSERT into account values(1, 1000);
insert into account values(2, 2000);
