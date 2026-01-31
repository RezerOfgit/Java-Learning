package com.gemini.exception_;

import java.util.Scanner;

public class Exception01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个整数：");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("num1 / num2 = " + num1 / num2);
        System.out.println("程序运行结束");
    }
}
