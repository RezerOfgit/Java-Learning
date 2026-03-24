package com.rezero.datasource;

import com.rezero.utils.JDBCUtils;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

/**
 * @author Re-zero
 * @version 1.0
 */
public class ConQuestion {
    //代码连接mysql 5000 次
    @Test
    public void testCon() {
        //看看连接-关闭connection 会耗用多久
        long start = System.currentTimeMillis();
        //System.out.println("开始连接...");
        for (int i = 0; i < 5000; i++) {
            //使用传统的jdbc 方式，得到连接
            Connection connection = JDBCUtils.getConnection();
            //做一些工作，比如得到PreparedStatement ，发送sql
            //..........不关闭时抛出异常Too many connections
            //关闭
            JDBCUtils.close(null, null, connection);
        }
        long end = System.currentTimeMillis();
        System.out.println("传统方式5000次耗时 = " + (end - start));//传统方式5000次耗时 = 33487
    }
}
