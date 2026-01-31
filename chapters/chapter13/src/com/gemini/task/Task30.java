package com.gemini.task;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task30 {
    public static void main(String[] args) {
        int a = 2;
        int b = 7;
        // 请补全公式，生成一个 int 类型的 randomNum
        //int randomNum = (int)(Math.random() * (7 - 2 + 1)) + 2;
        for (int i = 0; i < 10; i++) {
            int randomNum = (int)(Math.random() * (7 - 2 + 1)) + 2;
            System.out.print(randomNum + " ");
        }
    }
}
