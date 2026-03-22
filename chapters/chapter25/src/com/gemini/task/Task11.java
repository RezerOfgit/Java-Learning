package com.gemini.task;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task11 {
    public static void main(String[] args) {
        Connection connection = null;
        String sql = "insert into product values (?,?,?)";

        PreparedStatement preparedStatement = null;

        try {
            connection = Task09_JDBCUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, 101);
            preparedStatement.setString(2, "机械硬盘");
            preparedStatement.setDouble(3, 499.00);
            preparedStatement.executeUpdate();


//            // 插入时
//            BigDecimal price = new BigDecimal("499.00");
//            preparedStatement.setBigDecimal(3, price);
//
//            // 查询时
//            BigDecimal price = resultSet.getBigDecimal("price");
//            System.out.println("price = " + price);  // 输出：price = 499.00

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            Task09_JDBCUtils.close(null, preparedStatement, connection);
        }

    }
}
