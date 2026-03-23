package com.rezero.transaction_;

import com.rezero.utils.JDBCUtils;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author Re-zero
 * @version 1.0
 * 演示jdbc 中如何使用事务
 */
public class Transaction_ {

    //没有使用事务.
    @Test
    public void noTransaction() {
        //1. 得到连接
        Connection connection = null;
        //2. 组织一个sql
        String sql01 = "update account set balance = balance - 100 where id = 1";
        String sql02 = "update account set balance = balance + 100 where id = 2";
        PreparedStatement preparedStatement = null;

        //3. 创建PreparedStatement 对象
        try {
            connection = JDBCUtils.getConnection();// 在默认情况下，connection 是默认自动提交
            preparedStatement = connection.prepareStatement(sql01);
            preparedStatement.executeUpdate();

            int i = 1 / 0;
            preparedStatement = connection.prepareStatement(sql02);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            JDBCUtils.close(null, preparedStatement, connection);
        }
    }

    //事务来解决
    @Test
    public void useTransaction() {
        //1. 得到连接
        Connection connection = null;
        //2. 组织一个sql
        String sql01 = "update account set balance = balance - 100 where id = 1";
        String sql02 = "update account set balance = balance + 100 where id = 2";
        PreparedStatement preparedStatement = null;

        //3. 创建PreparedStatement 对象
        try {
            connection = JDBCUtils.getConnection();// 在默认情况下，connection 是默认自动提交
            //将connection 设置为不自动提交
            connection.setAutoCommit(false);//开启了事务
            preparedStatement = connection.prepareStatement(sql01);
            preparedStatement.executeUpdate();

            //int i = 1 / 0;
            preparedStatement = connection.prepareStatement(sql02);
            preparedStatement.executeUpdate();

            //这里提交事务
            connection.commit();
        } catch (SQLException e) {
            //这里我们可以进行回滚，即撤销执行的SQL
            //默认回滚到事务开始的状态.
            try {
                if (connection != null) {
                    connection.rollback();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            //关闭资源
            JDBCUtils.close(null, preparedStatement, connection);
        }
    }
}
