package com.gemini.task;

import com.gemini.reflection.Hero;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task03ClassCreate {
    public static void main(String[] args) {
        String fileAllPath = "com.gemini.reflection.Hero";
        try {
        //1. 方式一：已知类的全路径（多用于读取配置文件，如 Task01）
            Class<?> cls1 = Class.forName(fileAllPath);
            System.out.println(cls1);
        //2. 方式二：已知具体的类名（多用于参数传递）
            Class<Hero> cls2 = Hero.class;
            System.out.println(cls2);
        //3. 方式三：已经有了一个对象实例（多用于运行时辨别对象类型）
            Hero hero = new Hero();
            Class<? extends Hero> cls3 = hero.getClass();
            System.out.println(cls3);

        //4. 先获取系统当前的类加载器实例（这就是第三个搬运工：Application ClassLoader）：
            ClassLoader classLoader = hero.getClass().getClassLoader();
            Class<?> cls4 = classLoader.loadClass(fileAllPath);
            System.out.println(cls4);

            System.out.println(cls1.hashCode());
            System.out.println(cls2.hashCode());
            System.out.println(cls3.hashCode());
            System.out.println(cls4.hashCode());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
