package com.gemini.task;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task17_JDBCUtilsByDruid {
    //    声明一个静态属性 DataSource dataSource。
    private static DataSource dataSource;

    //    在 static {} 静态代码块中，读取 druid.properties，并使用工厂类
//    DruidDataSourceFactory.createDataSource(properties) 初始化这个 dataSource。
    static {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src\\tasksdruid.properties"));
            dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //    重写 getConnection() 方法：直接从 dataSource 中获取连接并返回。
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    //  （思考）在新的 close(ResultSet rs, Statement stmt, Connection conn) 方法中，
//  当代码执行到 conn.close() 时，这个连接是真的被物理销毁了吗？不会物理销毁，而是归还给连接池（逻辑关闭）
    public static void close(ResultSet resultSet, Statement statement, Connection connection) {
        try {
            if (resultSet != null) resultSet.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            if (statement != null) statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            if (connection != null) connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
