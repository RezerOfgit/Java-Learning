package com.gemini.day01;

import java.util.Scanner;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Main01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 假设输入：
        // 3
        // A B C
        int n = in.nextInt();
        in.nextLine(); // ⚠️ 致命防坑：nextInt() 不会读取换行符，必须手动多写一行 nextLine() 吃掉回车！

        String str = in.nextLine();
        String[] arr = str.split(" ");
        System.out.println("数字：" + n + "，数组长度：" + arr.length);
    }
}
