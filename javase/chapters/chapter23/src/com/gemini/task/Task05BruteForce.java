package com.gemini.task;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task05BruteForce {
    public static void main(String[] args) {
        try {
            Class<?> kingCls = Class.forName("com.gemini.reflection.King");

            Constructor<?> declaredConstructor = kingCls.getDeclaredConstructor();
            System.out.println("无参构造器: " + declaredConstructor);
            declaredConstructor.setAccessible(true);
            Object kingObj = declaredConstructor.newInstance();

            Field field = kingCls.getDeclaredField("gold");
            field.setAccessible(true);
            field.set(kingObj, 0);
            System.out.println("抢劫后国王的金币: " + field.get(kingObj));

            Method secretSkill = kingCls.getDeclaredMethod("secretSkill");
            secretSkill.setAccessible(true);
            secretSkill.invoke(kingObj);

        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | NoSuchFieldException | InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
