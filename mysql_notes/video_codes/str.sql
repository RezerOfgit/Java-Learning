-- 演示字符串相关函数的使用
-- CHARSET(str) 返回字串字符集
SELECT charset(ename) FROM EMP E ;

-- CONCAT (string2 [,...]) 连接字串
SELECT CONCAT(ename, ' 工作是 ', job) FROM EMP E;

-- INSTR (string , substring ) 返回substring在string中出现的位置，没有返回0
-- dual亚元表，系统表 可以作为测试表使用
SELECT INSTR('rezero', 'er') FROM DUAL ;

-- UCASE (string2) 转换成大写
SELECT UCASE(ename) FROM EMP E;

-- LCASE (string2) 转换成小写
SELECT LCASE(ename) FROM EMP E;

-- LEFT(string2, length) 从string2中的左边起取length个字符
SELECT LEFT (ename, 2) FROM EMP E ;

-- RIGHT(string2, length) 从string2中的右边起取length个字符
SELECT RIGHT (ename, 2) FROM EMP E ;

-- LENGTH (string) string长度[按照字节]
SELECT LENGTH (ename) FROM emp;

-- REPLACE (str , search_str ,replace_str) 
-- 在str中用replace_str替换search_str
-- 如果是 MANAGER 就替换成 经理
SELECT ename, REPLACE (job, 'MANAGER', '经理') FROM EMP E ;

-- STRCMP (string1 ,string2)   逐字符比较两字串大小
SELECT STRCMP('jack', 'hack') FROM DUAL ; 

-- SUBSTRING(str , position [,length ])  
-- 从str的position开始【从1开始计算】，取length个字符
SELECT SUBSTRING(ename, 1, 2) FROM EMP E; 

-- LTRIM (string2) RTRIM (string2 ) 
-- TRIM(string )去除前端空格或后端空格
SELECT LTRIM('   rezero')  FROM DUAL ;
SELECT RTRIM('rezero     ')  FROM DUAL ;
SELECT TRIM('   rezero   ')  FROM DUAL ;

-- 以首字母小写的方式显示所有员工emp表的姓名
-- 方法一
SELECT CONCAT(LCASE(LEFT (ename, 1)), SUBSTRING(ename, 2)) AS new_name
		FROM EMP E ;
-- 方法二
SELECT CONCAT(LCASE(SUBSTRING(ename, 1, 1) ), SUBSTRING(ename, 2)) FROM EMP E ;






































