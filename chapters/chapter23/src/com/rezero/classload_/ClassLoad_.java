package com.rezero.classload_;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * @author Re-zero
 * @version 1.0
 */
public class ClassLoad_ {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入Key: ");
        String key = scanner.next();
        switch (key) {
            case "1":
                Dog02 dog02 = new Dog02();//静态加载, 依赖性很强
                dog02.cry();
                break;
            case "2":
                //反射 -> 动态加载
                Class cls = Class.forName("Person");//加载Person类[动态加载]
                Object o = cls.newInstance();
                Method m = cls.getMethod("hi");
                m.invoke(o);
                System.out.println("ok");
                break;
            default:
                System.out.println("do nothing...");
        }
    }
}
class Dog02 {
    public void cry() {
        System.out.println("小狗汪汪叫");
    }
}

class Person {
    public void hi() {
        System.out.println("小孩 hi");
    }
}
