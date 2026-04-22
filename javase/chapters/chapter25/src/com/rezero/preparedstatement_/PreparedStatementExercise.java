package com.rezero.preparedstatement_;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

/**
 * @author Re-zero
 * @version 1.0
 * 1.创建admin02表
 * 2.使用PreparedStatement添加5条数据
 * 3.修改tom的记录，将name改成king
 * 4.删除一条的记录
 * 5.查询全部记录，并显示在控制台
 */
public class PreparedStatementExercise {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));

        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");

        Class.forName(driver);

        try (
                Connection connection = DriverManager.getConnection(url, user, password)
        ) {
            //1. 建表
            String sqlCreate = "create table if not exists admin02 (name varchar(32) not null unique ," +
                    "pwd varchar(32) not null default '') ";
            PreparedStatement ps = connection.prepareStatement(sqlCreate);
            boolean success = ps.execute();
            System.out.println(success ? "建表成功" : "建表失败");

            //2. 添加5条数据
            String sqlInsert = "insert into admin02 values(?,?)";
            String[][] data = {
                    {"tom", "123"},
                    {"mike", "124"},
                    {"xoa", "125"},
                    {"zos", "126"},
                    {"cod", "127"},
            };
            ps = connection.prepareStatement(sqlInsert);
            for (String[] row : data) {
                ps.setString(1, row[0]);
                ps.setString(2, row[1]);
                ps.executeUpdate();
            }
            System.out.println("添加成功");

            //3. 修改tom的name为king
            String sqlUpdate = "update admin02 set name = ? where name = ? and pwd = ?";
            ps = connection.prepareStatement(sqlUpdate);
            ps.setString(1, "king");
            ps.setString(2, "tom");
            ps.setString(3, "123");
            ps.executeUpdate();
            System.out.println("修改成功");

            //4. 删除一条记录
            String sqlDelete = "delete from admin02 where name = ?";
            ps = connection.prepareStatement(sqlDelete);
            ps.setString(1, "mike");
            ps.executeUpdate();
            System.out.println("删除成功");

            //5. 查询全部记录
            String sqlSelect = "select * from admin02";
            ps = connection.prepareStatement(sqlSelect);
            ResultSet resultSet = ps.executeQuery();
            System.out.println("查询结果如下:");
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String pwd = resultSet.getString("pwd");
                System.out.println("name = " + name + ", pwd = " + pwd);
            }
        }
        System.out.println("完成");
    }
}
