CREATE TABLE product(
		id int,
		`name` varchar(32),
		price decimal(8, 2));
SELECT * FROM product;

CREATE TABLE account (
		id int,
		balance decimal(8, 2));
SELECT * FROM account;
INSERT into account values(1, 1000);
insert into account values(2, 2000);
