package com.gemini.review_;

import java.util.HashSet;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Review12 {
    /*
    考察点：构造机制与扩容时机（类比 ArrayList）。
    题目： 在 JDK 8 中，执行 HashSet set = new HashSet(); 这一行代码后：
底层的 table 数组初始化了吗？长度是多少？
当我们执行第 1 次 add 操作时，默认会将数组扩容到多大？
JDK 8 中，new HashSet()（底层是 new HashMap()）的那一刻，数组还没有初始化，
长度是 0（为了省内存，万一你只 new 不用呢）。 只有当你执行 第 1 次 add 时，
它才会像睡醒了一样，突然扩容到 16。 (记住这个“懒加载”特性，面试官觉得你很细。)
     */
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("111");
    }
}
