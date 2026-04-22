package com.gemini.review;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Review04 {
    /*
    假设你正在代码审查（Code Review），看到新来的实习生写了下面这段代码
    （他试图用 PreparedStatement 防止注入）：

String userInputName = "admin' OR '1'='1"; // 恶意输入
String sql = "SELECT * FROM users WHERE username = '" + userInputName + "'";
PreparedStatement pstmt = connection.prepareStatement(sql);
ResultSet rs = pstmt.executeQuery();
问题： 请问这段代码能防止 SQL 注入吗？如果不能，请指出他犯了什么致命的逻辑错误，并用一句话告诉他该怎么改。

不能防止 SQL 注入。
致命错误
他用了 PreparedStatement，但没有用 ? 占位符。他把用户输入直接拼接进了 SQL 字符串，
和老式 Statement 的写法一模一样。
     */
}
