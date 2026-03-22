package com.gemini.task;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task09_JDBCUtils {
    private static String user;
    private static String password;
    private static String url;
    private static String driver;

    static {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("src\\tasks.properties"));

            user = properties.getProperty("user");
            password = properties.getProperty("password");
            url = properties.getProperty("url");
            Class.forName(driver);
            driver = properties.getProperty("driver");
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

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
