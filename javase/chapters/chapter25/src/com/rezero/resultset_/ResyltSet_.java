package com.rezero.resultset_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * @author Re-zero
 * @version 1.0
 * 演示select 语句返回ResultSet ,并取出结果
 */
@SuppressWarnings({"all"})
public class ResyltSet_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        //通过Properties 对象获取配置文件的信息
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));

        //获取相关的值
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");

        //1. 注册驱动
        Class.forName(driver);//建议写上

        //2. 得到连接
        Connection connection = DriverManager.getConnection(url, user, password);

        //3. 得到statement
        Statement statement = connection.createStatement();

        //4. 组织Sql
        String sql = "select id, name, sex, borndate from actor";
        //执行给定的SQL 语句，该语句返回单个ResultSet 对象
        /*
        +----+--------+-----+---------------------+
        | id | name   | sex | borndate            |
        +----+--------+-----+---------------------+
        |  2 | jack   | 男  | 1990-11-11 00:00:00 |
        |  3 | 刘德华 | 男  | 1988-11-11 00:00:00 |
        +----+--------+-----+---------------------+

            阅读debug 代码resultSet 对象的结构
         */

        ResultSet resultSet = statement.executeQuery(sql);

        //5. 使用while 取出数据
        while (resultSet.next()) {// 让光标向后移动，如果没有更多行，则返回false
            int id = resultSet.getInt(1);
            //int id1 = resultSet.getInt("id"); 通过列名来获取值, 推荐
            String name = resultSet.getString(2);
            String sex = resultSet.getString(3);
            Date date = resultSet.getDate(4);

            System.out.println(id + "\t" + name + "\t" + sex + "\t" + date);
        }

        //6. 关闭连接
        resultSet.close();
        statement.close();
        connection.close();
    }
}
