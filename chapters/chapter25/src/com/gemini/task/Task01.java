package com.gemini.task;

import com.rezero.jdbc.myjdbc.MysqlJdbcImpl;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task01 {
    public static void main(String[] args) {
        MysqlJdbcImpl mysqlJdbc = new MysqlJdbcImpl();
        mysqlJdbc.getConnection();

        OracleConnectionImpl oracleConnection = new OracleConnectionImpl();
        oracleConnection.connect();
    }
}
interface DBConnection {
    public void connect();
}
class MysqlConnectionImpl implements DBConnection {

    @Override
    public void connect() {
        System.out.println("连接 MySQL 8.0 成功");
    }
}
class OracleConnectionImpl implements DBConnection {

    @Override
    public void connect() {
        System.out.println("连接 Oracle 成功");
    }
}