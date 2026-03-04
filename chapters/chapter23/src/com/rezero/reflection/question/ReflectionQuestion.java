package com.rezero.reflection.question;

import com.rezero.Cat;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Re-zero
 * @version 1.0
 * 反射问题的引入
 */
@SuppressWarnings({"all"})
public class ReflectionQuestion {
    public static void main(String[] args) throws IOException {
        //根据配置文件 re.properties 指定信息，创建Cat对象并调用方法hi

        // 传统的方式 new
        Cat cat = new Cat();
        cat.hi();

        //我们尝试做一做 -> 明白反射
        //1. 使用Properties 类，可以读写配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\re.properties"));
        String classfullpath = properties.get("classfullpath").toString();
        String method = properties.get("method").toString();
        System.out.println("classfullpath" + classfullpath);
        System.out.println("method" + method);

    }
}
