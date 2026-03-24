package com.rezero.batch_;

import com.rezero.utils.JDBCUtils;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author Re-zero
 * @version 1.0
 * 演示java 的批处理
 */
public class Batch_ {
    //传统方法，添加5000 条数据到admin2
    @Test
    public void noBatch() throws SQLException {
        Connection connection = JDBCUtils.getConnection();
        String sql = "insert into admin2 values (null, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        System.out.println("开始执行");
        long start = System.currentTimeMillis();//开始时间
        for (int i = 0; i < 5000; i++) {
            preparedStatement.setString(1, "jack" + i);
            preparedStatement.setString(2, "666");
            preparedStatement.executeUpdate();
        }
        long end = System.currentTimeMillis();
        System.out.println("传统方式耗时" + (end - start));//传统方式耗时7778
        //关闭连接
        JDBCUtils.close(null, preparedStatement, connection);
    }

    //使用批量方式添加数据
    @Test
    public void Batch() throws SQLException {
        Connection connection = JDBCUtils.getConnection();
        String sql = "insert into admin2 values (null, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        System.out.println("开始执行");
        long start = System.currentTimeMillis();//开始时间
        for (int i = 0; i < 5000; i++) {
            preparedStatement.setString(1, "jack" + i);
            preparedStatement.setString(2, "666");
            //将sql 语句加入到批处理包中-> 看源码
            /*
                //1. //第一就创建ArrayList - elementData => Object[]
                //2. elementData => Object[] 就会存放我们预处理的sql 语句
                //3. 当elementData 满后,就按照1.5 扩容
                //4. 当添加到指定的值后，就executeBatch
                //5. 批量处理会减少我们发送sql 语句的网络开销，而且减少编译次数，因此效率提高
                //下面的代码是mysql 5.x
                public void addBatch() throws SQLException {
                    synchronized(this.checkClosed().getConnectionMutex()) {
                    if (this.batchedArgs == null) {
                        this.batchedArgs = new ArrayList();
                    }
                    for(int i = 0; i < this.parameterValues.length; ++i) {
                        this.checkAllParametersSet(this.parameterValues[i], this.parameterStreams[i], i);
                    }
                    this.batchedArgs.add(new PreparedStatement.BatchParams(this.parameterValues,
                    this.parameterStreams, this.isStream, this.streamLengths, this.isNull));
                    }
                }
             */
            preparedStatement.addBatch();
            //当有1000 条记录时，在批量执行
            if ((i + 1) % 1000 == 0) {
                preparedStatement.executeBatch();
                //清空一把
                preparedStatement.clearBatch();
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("批量方式耗时" + (end - start));//批量方式耗时121
        //关闭连接
        JDBCUtils.close(null, preparedStatement, connection);
    }
}
