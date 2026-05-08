package com.gemini.day01;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Re-zero
 * @version 1.0
 * 题目 1：字符串变换最小字符串（经典 100 分题）
 * 题目描述： 给定一个字符串 s，最多只能进行一次变换，返回变换后能得到的最小字符串（字典序）。
 * 变换是指将字符串任意两个位置的字符进行交换。
 * 输入： bcdefa
 * 输出： acdefb
 * 破题核心思路： 找到当前字符串中，原本该排在最前面的字符（比如 a），但它现在位于后面。
 * 把它和最前面的较大字符交换即可。注意处理本来就是有序的情况（如 abc）。
 */
public class No01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            String s = scanner.nextLine();
            System.out.println(getMinString(s));
        }
        scanner.close();
    }

    public static String getMinString(String s) {
        char[] chars = s.toCharArray();
        // 1. 创建一个排序后的字符数组，作为我们的“理想目标”
        char[] sortedChars = chars.clone();
        Arrays.sort(sortedChars);

        // 2. 寻找第一个不匹配的位置
        for (int i = 0; i < chars.length; i++) {
            // 如果当前位置字符不一致，说明这里需要放入 sortedChars[i]
            if (chars[i] != sortedChars[i]) {
                char targetChar = sortedChars[i]; // 我们想要在这个位置放的字符（比如 'a'）

                // 3. 在原字符串后面找到这个 targetChar，注意要找最后一次出现的位置
                // 从后往前遍历，找到的第一个就是最后出现的位置
                int swapIndex = -1;
                for (int j = chars.length - 1; j > i; j--) {
                    if (chars[j] == targetChar) {
                        swapIndex = j;
                        break;
                    }
                }

                // 4. 执行交换
                if (swapIndex != -1) {
                    char temp = chars[i];
                    chars[i] = chars[swapIndex];
                    chars[swapIndex] = temp;
                }
                break; // 题目限制只能变换一次，交换完直接跳出
            }
        }

        return new String(chars);
    }
}
