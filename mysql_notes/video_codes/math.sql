-- 演示数学相关函数
-- ABS (num) 绝对值
SELECT ABS(-10) FROM DUAL ; 

-- BIN (decimal number)  十进制转二进制
SELECT BIN(10) FROM DUAL ; 

-- CEILING (number2)  向上取整，得到比num2大的最小整数
SELECT CEILING(1.2) FROM DUAL ; 

-- CONV (number2，from base，to base) 进制转换
-- 下面的含义是 8 是十进制的8, 转成二进制输出
SELECT CONV(8, 10, 2) FROM DUAL ; 

-- FLOOR (number2)   向下取整，得到比num2小的最大整数
SELECT FLOOR(2.1) FROM DUAL ; 

-- FORMAT(NUMBER, decimal_places )  保留小数位数
SELECT FORMAT(1.8520, 1) FROM DUAL ; 

-- HEX (DecimalNumber )    转十六进制
SELECT HEX(16) FROM DUAL ; 

-- LEAST (NUMBER , number2 [,..］) 求最小值
SELECT LEAST(7, 2, 3, 4) FROM DUAL ; 

-- MOD (numerator ,denominator ) 求余
SELECT MOD(10, 3) FROM DUAL ; 

-- RAND([seed])   RAND([seed]) 其范围为0≤v≤1.0
SELECT RAND() FROM DUAL ; 
-- RAND([seed]) [seed] 如果有确定的值, 那么随机的结果确定
SELECT RAND(3) FROM DUAL ; 











































