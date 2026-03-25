package com.gemini.task;

import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task20 {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            connection = Task17_JDBCUtilsByDruid.getConnection();

            QueryRunner queryRunner = new QueryRunner();
            String sql = "update product set price = 299.0 where id = ?";
            int i = queryRunner.update(connection, sql, 101);
            System.out.println(i > 0 ? "执行成功" : "执行没有影响到表");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            Task17_JDBCUtilsByDruid.close(null, null, connection);
        }
    }
}
