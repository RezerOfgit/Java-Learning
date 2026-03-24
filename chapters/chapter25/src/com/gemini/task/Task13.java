package com.gemini.task;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task13 {
    public static void main(String[] args) {
        Connection connection = null;
        String sql01 = "update account set balance = balance - 100 where id = 1";
        String sql02 = "update account set balance = balance + 100 where id = 2";
        PreparedStatement preparedStatement = null;

        try {
            connection = Task09_JDBCUtils.getConnection();
            connection.setAutoCommit(false);
            preparedStatement = connection.prepareStatement(sql01);
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement(sql02);
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
            Task09_JDBCUtils.close(null, preparedStatement, connection);
        }
    }
}
