package com.rezero.datasource;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.util.Properties;

/**
 * @author Re-zero
 * @version 1.0
 * 演示c3p0 的使用
 */
public class C3P0_ {

    //方式1： 相关参数，在程序中指定user, url , password 等
    @Test
    public void testC3P0_01() throws Exception {
        //1. 创建一个数据源对象
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();

        //2. 通过配置文件mysql.properties 获取相关连接的信息
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));

        //读取相关的属性值
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");

        //给数据源comboPooledDataSource 设置相关的参数
        //注意：连接管理是由comboPooledDataSource 来管理
        comboPooledDataSource.setDriverClass(driver);
        comboPooledDataSource.setJdbcUrl(url);
        comboPooledDataSource.setUser(user);
        comboPooledDataSource.setPassword(password);

        //设置初始化连接数
        comboPooledDataSource.setInitialPoolSize(10);
        //最大连接数
        comboPooledDataSource.setMaxPoolSize(50);
        //测试连接池的效率, 测试对mysql 5000 次操作
        long start = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            //这个方法就是从DataSource 接口实现的
            Connection connection = comboPooledDataSource.getConnection();
//            System.out.println("连接成功");
            connection.close();
        }
        long end = System.currentTimeMillis();
        //c3p0 5000 连接mysql 耗时=851
        System.out.println("c3p0 5000 连接mysql 耗时=" + (end - start));
    }

    //第二种方式使用配置文件模板来完成
    //1. 将c3p0 提供的c3p0.config.xml 拷贝到src 目录下
    //2. 该文件指定了连接数据库和连接池的相关参数
    @Test
    public void testC3P0_02() throws Exception {

        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource("rezero");

        //测试连接池的效率, 测试对mysql 5000 次操作
        long start = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            //这个方法就是从DataSource 接口实现的
            Connection connection = comboPooledDataSource.getConnection();
//            System.out.println("连接成功");
            connection.close();
        }
        long end = System.currentTimeMillis();
        //c3p0 5000 第二种方式连接mysql 耗时=847
        System.out.println("c3p0 5000 第二种方式连接mysql 耗时=" + (end - start));
    }
}
