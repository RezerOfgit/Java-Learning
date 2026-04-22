package com.rezero.accessible_;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Re-zero
 * @version 1.0
 * 演示通过反射机制创建实例
 */
public class ReflectionCreateInstance {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        //1. 先获取到User类的cLass对象
        Class<?> userCls = Class.forName("com.rezero.accessible_.User");
        //2. 通过public的无参构造器创建实例
        Object o = userCls.newInstance();
        System.out.println(o);
        //3. 通过public的有参构造器创建实例
        /*
            constructor 对象就是
            public User(String name) {//public的有参构造器
                this.name = name;
            }
         */
        //3.1 先得到对应构造器
        Constructor<?> constructor = userCls.getConstructor(String.class);
        //3.2 创建实例, 并传入实参
        Object o2 = constructor.newInstance("你好");
        System.out.println("你好 = " + o2);
        //4. 通过非public的有参构造器创建实例
        //4.1 得到private的构造器对象
        Constructor<?> declaredConstructor = userCls.getDeclaredConstructor(int.class, String.class);
        //4.2 创建实例
        //暴破【暴力破解】，使用反射可以访问private构造器/方江/属性，反射面前，都是纸老虎
        declaredConstructor.setAccessible(true);
        Object o3 = declaredConstructor.newInstance(100, "张三丰");
        System.out.println("o3 = " + o3);
    }
}

class User {//User类
    private int age = 10;
    private String name = "java学习";

    public User() {//无参 public
    }

    public User(String name) {//public的有参构造器
        this.name = name;
    }

    private User(int age, String name) {//private 有参构造器
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}