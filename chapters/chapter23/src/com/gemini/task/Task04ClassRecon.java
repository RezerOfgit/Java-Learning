package com.gemini.task;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author Re-zero
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Task04ClassRecon {
    public static void main(String[] args) {
        try {
            Class<?> Stringcls = Class.forName("java.lang.String");
            System.out.println("====开始分析String类的结构====");

            System.out.println("====String类的所有属性====");
            Field[] fields = Stringcls.getDeclaredFields();
            for (Field f : fields) {
                String modifiers = Modifier.toString(f.getModifiers());
                System.out.println(modifiers);
                String fName = f.getName();
                System.out.println(fName);
            }

            System.out.println("====String类的所有方法====");
            Method[] methods = Stringcls.getDeclaredMethods();
            for (Method m : methods) {
                String mName = m.getName();
                System.out.println(mName);
            }
            System.out.println("====分析结束====");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
