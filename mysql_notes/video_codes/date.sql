-- 日期时间相关函数

-- CURRENT_DATE()        当前日期
SELECT CURRENT_DATE() FROM DUAL ;

-- CURRENT_TIME()        当前时间
SELECT CURRENT_TIME() FROM DUAL ;

-- CURRENT_TIMESTAMP()   当前时间戳
SELECT CURRENT_TIMESTAMP() FROM DUAL ;

-- 创建测试表 信息表
CREATE TABLE mes(
		id int,
		content varchar(30),
		send_time datetime);

-- 添加一条记录
INSERT INTO mes
		VALUES (1, '北京新闻', current_timestamp());
INSERT INTO mes
		VALUES (2, '上海新闻', now());
INSERT INTO mes
		VALUES (3, '美国新闻', '2026-3-13');

SELECT * FROM mes;
SELECT NOW() FROM DUAL ; -- 当前时间 

-- 上应用实例
-- 显示所有新闻信息，发布日期只显示日期，不用显示时间，
SELECT id, content, date(send_time) FROM mes;

-- 请查询在10分钟内发布的新闻
SELECT * FROM mes
		WHERE DATE_ADD(send_time, INTERVAL 10 MINUTE) >= NOW();

SELECT * FROM mes
		WHERE SEND_TIME >= DATE_SUB(NOW(), INTERVAL 10 MINUTE);

-- 请在mysql的sq1语句中求出 2011-11-11和1990-1-1相差多少天
SELECT DATEDIFF('2011-11-11', '1990-1-1')  FROM DUAL ;

-- 请用mysql的sql语句求出你活了多少天？【练习】1990-11-11
SELECT DATEDIFF(NOW(), '1990-11-11') FROM DUAL ;

-- 如果你能活80岁，求出你还能活多少天.【练习】
-- 先求出活80岁时，是什么日期X
-- 然后在使用datediff(x，now());
-- INTERVAL 8O YEAR：YEAR可以是 年月日，时分秒
-- '1986-11-11' 可以date,datetime timestamp

SELECT DATEDIFF(DATE_ADD('1990-11-11', INTERVAL 80 YEAR), NOW())
		FROM DUAL ;

SELECT DATEDIFF('10:10:10', '11:11:11') FROM DUAL ;

-- YEAR|MONTH|DAY| DATE (datetime)
SELECT YEAR (NOW()) FROM DUAL ;
SELECT MONTH (NOW()) FROM DUAL ;
SELECT DAY (NOW()) FROM DUAL ;
SELECT MONTH ('2013-11-11') FROM DUAL ;

-- unix_timestamp()：返回的是1970-1-1到现在的秒数
SELECT UNIX_TIMESTAMP() FROM DUAL ; 
-- FROM_UNIXTIME()：可以把一个unix_timestamp 秒数[时间截]，转成指定格式的日期
-- %Y-%m-%d格式是规定好的，表示年月日
-- 意义：在开发中，可以存放一个整数，然后表示时间，通过FROM_UNIXTIME转换

SELECT FROM_UNIXTIME(1773458549, '%Y-%m-%d') FROM DUAL ;
SELECT FROM_UNIXTIME(1773458549, '%Y-%m-%d %H:%i:%s') FROM DUAL ;


























































