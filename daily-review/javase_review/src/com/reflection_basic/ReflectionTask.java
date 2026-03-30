package com.reflection_basic;

import java.lang.reflect.Method;

/**
 * @author Re-zero
 * @version 1.0
 */
public class ReflectionTask {
    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("com.reflection_basic.Consumable");
            Method method= cls.getDeclaredMethod("initSys");
            Object instance = cls.getDeclaredConstructor().newInstance();
//            JDK 9 废弃 cls.newInstance()
            method.invoke(instance);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
