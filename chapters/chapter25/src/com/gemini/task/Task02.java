package com.gemini.task;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task02 {
    public static void main(String[] args) throws SQLException {
        Driver driver = new Driver();

        String url = "jdbc:mysql://localhost:3306/gemini_db";
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "123456");
        Connection connect = driver.connect(url, properties);

        String sql = "insert into jdbc_test values (1, 'Hello JDBC')";
        Statement statement = connect.createStatement();
        int rows = statement.executeUpdate(sql);
        System.out.println(rows > 0 ? "成功" : "失败");

        statement.close();
        connect.close();
    }

}
