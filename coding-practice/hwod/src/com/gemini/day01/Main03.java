package com.gemini.day01;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 3. 逗号分隔的动态数组（极其高频）
 * @author Re-zero
 * @version 1.0
 */
public class Main03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 输入格式：1,2,3,4,5
        String input = in.nextLine();
        // 快速转为 int 数组（利用 Java 8 Stream，省去 for 循环写的代码量）
        int[] nums = Arrays.stream(input.split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
        System.out.println(Arrays.toString(nums));
    }
}
