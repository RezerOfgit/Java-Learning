package com.gemini.task;

import com.gemini.task.Task17_JDBCUtilsByDruid;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task19 {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            connection = Task17_JDBCUtilsByDruid.getConnection();
            QueryRunner queryRunner = new QueryRunner();
            String sql = "SELECT * FROM product WHERE price >= ?";

            List<Product> list = queryRunner.query(connection, sql, new BeanListHandler<>(Product.class), 100);
            for (Product product : list) {
                System.out.print(product);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            Task17_JDBCUtilsByDruid.close(null, null, connection);
        }
    }
}
