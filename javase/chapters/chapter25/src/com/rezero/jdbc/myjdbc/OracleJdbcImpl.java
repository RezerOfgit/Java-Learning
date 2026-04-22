package com.rezero.jdbc.myjdbc;

/**
 * @author Re-zero
 * @version 1.0
 * 模拟oracle 数据库实现jdbc
 */
public class OracleJdbcImpl implements JdbcInterface{

    @Override
    public Object getConnection() {
        System.out.println("得到oracle 的连接");
        return null;
    }

    @Override
    public void crud() {
        System.out.println("完成对oracle 的增删改查");
    }

    @Override
    public void close() {
        System.out.println("关闭oracle 的连接");
    }
}
