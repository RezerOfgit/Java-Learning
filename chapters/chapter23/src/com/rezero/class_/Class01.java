package com.rezero.class_;

import com.rezero.Cat;

/**
 * @author Re-zero
 * @version 1.0
 * 对Class 类特点的梳理
 */
public class Class01 {
    public static void main(String[] args) throws ClassNotFoundException {
        //看看Class 类图
        //1. Class 也是类，因此也继承Object 类
        //Class

        //2. Class 类对象不是new 出来的，而是系统创建的
        //(1) 传统new 对象
        /*  ClassLoader 类
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                return loadClass(name, false);
            }
        */
        //Cat cat = new Cat();

        //(2) 反射方式, 没有debug 到ClassLoader 类的loadClass, 原因是没有注销Cat cat = newCat();
        /*   ClassLoader 类, 仍然是通过ClassLoader 类加载Cat 类的Class 对象
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                return loadClass(name, false);
            }
         */
        Class<?> cls1 = Class.forName("com.rezero.Cat");

        //3. 对于某个类的Class 类对象，在内存中只有一份，因为类只加载一次
        Class<?> cls2 = Class.forName("com.rezero.Cat");
        System.out.println(cls1.hashCode());
        System.out.println(cls2.hashCode());
        Class<?> cls3 = Class.forName("com.rezero.Dog");
        System.out.println(cls3.hashCode());
    }
}
