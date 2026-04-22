package com.rezero.map_;

import java.util.HashMap;
import java.util.Objects;

/**
 * @author Re-zero
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class HashMapSource02 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        for (int i = 1; i <= 12; i++) {
            hashMap.put(new A(i), "hello");
        }
        System.out.println("hashMap = " + hashMap);
        //设计代码去验证,table 的扩容
        //0 -> 16(12) -> 32(24) -> 64(64*0.75=48)-> 128 (96) ->
    }
}

class A {
    private int num;

    @Override
    public String toString() {
        return "\nA{" +
                "num=" + num +
                '}';
    }

    //所有的A对象的hashCode都是100
    @Override
    public int hashCode() {
        return 100;
    }

    public A(int num) {
        this.num = num;
    }
}
