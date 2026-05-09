package com.gemini.day02;

import java.util.Scanner;

/**
 * @author Re-zero
 * @version 1.0
 * 题目描述： 给定一个由 0 和 1 组成的数组，以及一个整数 K。你可以把最多 K 个 0 变成 1。
 * 求翻转后，最长的连续 1 的长度。
 * 输入： nums = [1,1,1,0,0,0,1,1,1,1,0], K = 2
 * 输出： 6 (把中间两个 0 变成 1，得到 6 个连续的 1)
 */
public class No01 {
    public static void main(String[] args) {
        // --- Day 1 练过的 I/O 模板 ---
        Scanner in = new Scanner(System.in);
        if (!in.hasNext()) return;

        // 假设输入格式是先读数组，再读 K
        String[] strArr = in.nextLine().split(",");
        int[] nums = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            nums[i] = Integer.parseInt(strArr[i]);
        }
        int k = Integer.parseInt(in.nextLine());

        // --- 开始套用滑动窗口模板 ---
        int left = 0, right = 0;
        int maxLen = 0;
        int zeroCount = 0; // 记录窗口内 0 的个数

        while (right < nums.length) {
            // 1. 右指针扩张：遇到 0，记录下来
            if (nums[right] == 0) {
                zeroCount++;
            }

            // 2. 判断违规：如果窗口里的 0 超过了 K 个，说明不能全翻转了，违规！
            while (zeroCount > k) {
                // 3. 左指针收缩：把左边的元素移出去
                if (nums[left] == 0) {
                    zeroCount--; // 移出去的是 0，那么窗口内的 0 数量减少
                }
                left++; // 左指针往前走
            }

            // 4. 此时窗口内 0 的个数一定 <= K，是合法状态，更新最大长度
            maxLen = Math.max(maxLen, right - left + 1);

            // 5. 右指针继续前进
            right++;
        }
        System.out.println(maxLen);
    }
}
