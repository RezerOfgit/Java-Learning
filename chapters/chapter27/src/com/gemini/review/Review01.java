package com.gemini.review;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Review01 {
    /*
    在编写 close(ResultSet rs, Statement stmt, Connection conn) 方法释放资源时，
    为什么绝对不能把这三个 .close() 调用写在同一个 try-catch 块中？如果写在同一个 try 里，
    当 rs.close() 突然抛出异常时，会导致底层的数据库连接池发生什么严重的后果？

    三个 close 必须各自独立 try-catch，保证即使前面的关闭抛异常，后面的资源依然会被释放，
    尤其是 Connection 必须归还给连接池，否则连接池耗尽系统崩溃。
     */
}
