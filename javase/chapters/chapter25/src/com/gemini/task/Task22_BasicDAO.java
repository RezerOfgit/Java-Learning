package com.gemini.task;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task22_BasicDAO<T> {

    private QueryRunner qr = new QueryRunner();

    public List<T> queryMulti(String sql, Class<T>clazz, Object...parameters) {
        Connection connection = null;
        try {
            connection = Task17_JDBCUtilsByDruid.getConnection();
            return qr.query(connection, sql, new BeanListHandler<T>(clazz), parameters);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            Task17_JDBCUtilsByDruid.close(null, null, connection);
        }
    }
}
