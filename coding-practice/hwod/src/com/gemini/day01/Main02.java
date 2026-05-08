package com.gemini.day01;

import java.util.Scanner;

/**
 * 2. 不知道有多少行输入（以 EOF 结束）
 * @author Re-zero
 * @version 1.0
 */
public class Main02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 只要还有下一行，就一直读。遇到空行或者直接结束符才停止。
        while (in.hasNextLine()) {
            String line = in.nextLine();
            if (line.isEmpty()) break; // 视题目情况加跳出条件
            System.out.println("处理该行：" + line);
        }
    }
}
