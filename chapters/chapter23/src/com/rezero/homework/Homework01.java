package com.rezero.homework;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchFieldException {
        //1. 得到 PrivateTest类对应的Class对象
        Class<?> ptCls = Class.forName("com.rezero.homework.PrivateTest");
        //2. 创建对象实例
        Object o = ptCls.newInstance();
        //3. 得到name属性对象
        Field name = ptCls.getDeclaredField("name");//name属性是private
        //4. 暴破name
        name.setAccessible(true);
        name.set(o, "helloDog");
        //5. 得到getName方法对象
        Method getName = ptCls.getMethod("getName");
        //6. 因为getName（） 是pubLic，所有直接调用
        Object invoke = getName.invoke(o);
        System.out.println("name属性值 = " + invoke);


    }
}

class PrivateTest {
    private String name = "helloKitty";

    public String getName() {
        return name;
    }
}