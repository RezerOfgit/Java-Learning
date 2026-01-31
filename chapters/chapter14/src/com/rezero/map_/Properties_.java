package com.rezero.map_;

import java.util.Properties;

/**
 * @author Re-zero
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Properties_ {
    public static void main(String[] args) {

        //解读
        //1. Properties 继承 Hashtable
        //2. 可以通过k-v存放数据,当然key 和value 不能为null

        Properties properties = new Properties();
        properties.put("john", 100);
//        properties.put(null, 100);// 抛出 空指针异常
//        properties.put("john", null);// 抛出 空指针异常
        properties.put("lucy", 100);
        properties.put("lic", 100);
        properties.put("lic","88");//如果有相同的key, value被替换
        System.out.println("properties = " + properties);

        //通过k获取对应值
        System.out.println(properties.get("lic"));//88
        System.out.println(properties.getProperty("lic"));

        //删除
        properties.remove("lic");
        System.out.println("properties=" + properties);

        //修改
        properties.put("john","约翰");
        System.out.println("properties=" + properties);
    }
}
