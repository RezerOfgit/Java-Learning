package com.homework.h02;
/**
 * 2.写出四种访问修饰符和各自的访问权限Homework02.java
 */
public class Homework02 {
    public static void main(String[] args) {
        System.out.println("4种访问修饰符的访问权限：");
        System.out.println();
        System.out.println("访问级别\t" + "访问控制修饰符\t" +
                "同类\t" + "同包\t" + "子类\t" + "不同包");
        System.out.println("公开\t\t" + "public\t\t\t" +
                "√  \t" + "√  \t" + "√  \t" + "√");
        System.out.println("受保护 \t" + "protected \t\t" +
                "√  \t" + "√  \t" + "√  \t" + "×");
        System.out.println("默认\t\t" + "没有修饰符\t\t" +
                "√  \t" + "√  \t" + "×  \t" + "×");
        System.out.println("私有\t\t" + "private \t\t" +
                "√  \t" + "×  \t" + "×  \t" + "×");
    }
}
