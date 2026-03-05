package com.gemini.task;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author Re-zero
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Task02 {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src\\game.properties"));
            String classFullPath = properties.get("classFullPath").toString();//"com.gemini.reflection.Hero"
            String methodName = properties.get("methodName").toString();//"castSpell"
            System.out.println("classFullPat " + classFullPath);
            System.out.println("method " + methodName);

            Class<?> aClass = Class.forName(classFullPath);
            Object o = aClass.newInstance();
            System.out.println("o的运行类型 = " + o.getClass());

            Method method = aClass.getMethod(methodName);

            method.invoke(o);

            Field name = aClass.getField("name");
            System.out.println(name.get(o));

        } catch (IOException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException | NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
