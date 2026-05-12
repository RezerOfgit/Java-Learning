package com.gemini.day02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Re-zero
 * @version 1.0
 * 题目描述： 小明（身高 H）想找小朋友和他一起玩。输入小明的身高 H 和 N 个小朋友的身高。
 * 排序规则：
 * 优先按照与小明身高的差值绝对值从小到大排序。
 * 如果差值绝对值相同，则按小朋友的真实身高从小到大排序。
 * 输入：
 * 第一行：100 (小明身高 H), 10 (N 个小朋友)
 * 第二行：95 96 97 98 99 101 102 103 104 105
 * 输出： 99 101 98 102 97 103 96 104 95 105
 */
public class No02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (!in.hasNext()) return;

        int h = in.nextInt(); // 小明身高
        int n = in.nextInt(); // 小朋友数量

        // 用 List 存起来，方便调用 Collections.sort
        List<Integer> heights = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            heights.add(in.nextInt());
        }

        // --- 核心模板：自定义比较器 Comparator ---
        heights.sort((a, b) -> {
            int diffA = Math.abs(a - h);
            int diffB = Math.abs(b - h);

            // 规则 1：如果差值不同，按差值从小到大排
            if (diffA != diffB) {
                return diffA - diffB; // 升序用 A - B，降序用 B - A
            } else {
                // 规则 2：差值相同，按真实身高从小到大排
                return a - b;
            }
        });

        // 输出结果拼接
        StringBuilder sb = new StringBuilder();
        for (int height : heights) {
            sb.append(height).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
