package com.rezero.homework;

import java.io.*;
import java.util.Properties;

/**
 * @author Re-zero
 * @version 1.0
 * 3.编程题Homework03.java
 * （1）要编写一个dog.properties
 * name=tom
 * age=5
 * color= red
 * （2）编写Dog 类（name,age,color） 创建一个dog对象，读取dog.properties
 * 用相应的内容完成属性初始化，并输出
 * （3）将创建的Dog对象，序列化到文件dog.dat文件
 * (4) 反序列化
 */
public class Homework03 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String filePath = "src\\dog.properties";
        //（1）要编写一个dog.properties
        Properties properties = new Properties();

        properties.setProperty("name", "tom");
        properties.setProperty("age", "5");
        properties.setProperty("color", "red");

        properties.store(new FileOutputStream(filePath), null);
        System.out.println("保存配置文件成功...");

        properties.load(new FileReader(filePath));
        properties.list(System.out);

        //2）编写Dog 类（name,age,color） 创建一个dog对象，读取dog.properties
        // 用相应的内容完成属性初始化，并输出
        String name = properties.get("name") + "";//Object -> String
        int age = Integer.parseInt(properties.get("age") + "");// Object -> int
        String color = properties.get("color") + "";//Object -> String

        Dog dog = new Dog(name, age, color);
        System.out.println("====dog信息====");
        System.out.println(dog);

        //（3）将创建的Dog对象，序列化到文件dog.dat文件
        String serFilePath = "d:\\dog.txt";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(serFilePath));
        oos.writeObject(dog);
        oos.close();
        System.out.println("dog对象序列化完成...");

        //(4) 反序列化
        ObjectInputStream ojs = new ObjectInputStream(new FileInputStream(serFilePath));
        Dog dog1 = (Dog)ojs.readObject();
        System.out.println("====反序列化后dog====");
        System.out.println(dog1);

    }
}
class Dog implements Serializable {
    private String name;
    private int age;
    private String color;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
}