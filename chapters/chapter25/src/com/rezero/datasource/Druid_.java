package com.rezero.datasource;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.jupiter.api.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

/**
 * @author Re-zero
 * @version 1.0
 * 测试druid 的使用
 */
public class Druid_ {
    @Test
    public void testDruid() throws Exception {
        //1. 加入Druid jar 包
        //2. 加入配置文件druid.properties , 将该文件拷贝项目的src 目录
        //3. 创建Properties 对象, 读取配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\druid.properties"));

        //4. 创建一个指定参数的数据库连接池, Druid 连接池
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            Connection connection = dataSource.getConnection();
//            System.out.println(connection.getClass());
//            System.out.println("连接成功");
            connection.close();
        }
        long end = System.currentTimeMillis();
//        druid 连接池操作50000 耗时=1268
        System.out.println("druid 连接池操作500000 耗时=" + (end - start));
    }
}
