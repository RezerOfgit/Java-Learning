package com.rezero.transaction_;

import com.rezero.utils.JDBCUtils;

import java.lang.reflect.ParameterizedType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author Re-zero
 * @version 1.0
 * 创建account表
 * 在表中先添加两条记录tom余额100，king余额200
 * 使用事务完成，tom给king转10元钱。
 */
public class TransactionExercise {
    public static void main(String[] args) {
        //在表中先添加两条记录tom余额100，king余额200
        Connection connection = null;
        String sql01 = "insert into account values (null, 'tom', 100)";
        String sql02 = "insert into account values (null, 'king', 200)";
        PreparedStatement preparedStatement = null;

        try {
            connection = JDBCUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql01);
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement(sql02);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            //关闭资源
            JDBCUtils.close(null, preparedStatement, connection);
        }

        //使用事务完成，tom给king转10元钱。
        String sql03 = "update account set balance = balance - 10 where id = 3";
        String sql04 = "update account set balance = balance + 10 where id = 4";

        try {
            connection = JDBCUtils.getConnection();
            connection.setAutoCommit(false);
            preparedStatement = connection.prepareStatement(sql03);
            preparedStatement.executeUpdate();

            preparedStatement = connection.prepareStatement(sql04);
            preparedStatement.executeUpdate();

            connection.commit();
        } catch (SQLException throwables) {
            try {
                if (connection != null) {
                    connection.rollback();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            throwables.printStackTrace();
        } finally {
            JDBCUtils.close(null, preparedStatement, connection);
        }

    }
}
