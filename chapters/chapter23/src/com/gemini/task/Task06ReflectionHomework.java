package com.gemini.task;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task06ReflectionHomework {
    public static void main(String[] args) {
        try {
            //1. 获取 java.io.File 类的 Class 对象。
            Class<?> fileCls = Class.forName("java.io.File");

            //2. 拿到它带有一个 String 参数的构造器：File(String pathname)。
            Constructor<?> declaredConstructor = fileCls.getDeclaredConstructor(String.class);

            //3. 传入路径参数, 使用这个构造器，通过反射动态创建一个 File 对象
            String filePath = "D:\\mynewfile.txt";
            Object file = declaredConstructor.newInstance(filePath);

            //4. 拿到 File 类的 createNewFile 方法。
            Method createNewFile = fileCls.getMethod("createNewFile");

            //5. 通过反射执行这个方法
            createNewFile.invoke(file);
            System.out.println("创建文件成功...");
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
