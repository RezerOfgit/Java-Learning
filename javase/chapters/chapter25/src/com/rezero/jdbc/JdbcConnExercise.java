package com.rezero.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author Re-zero
 * @version 1.0
 * 使用方式 5
 * -- 1.创建 mynews表
 * -- 2.使用jdbc添加5条数据
 * -- 3.修改id=1的记录，将content改成一个新的消息
 * -- 4.删除id=3的记录
 */
public class JdbcConnExercise {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));

        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");

        Class.forName(driver);

        // 用数组存放所有SQL语句
        String[] sqls = {
                "create table mynews(id int, content varchar(32))",
                "insert into mynews values (1, '北京新闻1')",
                "insert into mynews values (2, '北京新闻2')",
                "insert into mynews values (3, '北京新闻3')",
                "insert into mynews values (4, '北京新闻4')",
                "insert into mynews values (5, '北京新闻5')",
                "update mynews set content = 'new北京新闻' where id = 1",
                "delete from mynews where id = 3"
        };

        try (
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement()
        ) {
            for (String sql : sqls) {
                int rows = statement.executeUpdate(sql);
                System.out.println("执行成功，影响行数：" + rows);
            }
        }
    }
}
