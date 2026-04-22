package com.gemini.task;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task06 {
    /*
    假设系统有一段极其简陋的登录验证代码（使用老式 Statement 拼接字符串）：

Java
String username = "admin";
String password = userInput; // 假设这是从网页文本框接收到的密码
String sql = "SELECT * FROM users WHERE user_name = '" + username + "' AND pwd = '" + password + "'";
任务： 如果你是一个黑客，你会在密码输入框里（即 userInput 变量）输入一段什么神仙字符串，使得不管真正的密码是什么，这条 SQL 都能成功查出数据并让你登录成功？请写出这个经典的“万能密码”字符串。

or '1' = '1
     */
}
