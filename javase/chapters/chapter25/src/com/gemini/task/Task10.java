package com.gemini.task;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Re-zero
 * @version 1.0
 * 每次操作完数据库都要关资源，太烦了！请在你的 JDBCUtils 中补充一个通用的资源释放方法：
 * public static void close(ResultSet rs, Statement stmt, Connection conn)
 * 要求： 必须在方法内部考虑空指针异常的情况（即判断传入的对象是否为 null，不为空才执行 .close()），并捕获可能抛出的 SQLException。
 */
public class Task10 {
    public static void close(ResultSet set, Statement statement, Connection connection) {
        try {
            if (set != null) {
                set.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
