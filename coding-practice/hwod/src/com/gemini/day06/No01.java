package com.gemini.day06;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Re-zero
 * @version 1.0
 * 用数组代表每个人的能力。一个团队可以由 1 个人或者 2 个人组成，且团队的总能力值必须大于等于给定的最低能力值 target。请问最多可以派出多少支团队？
 * 输入格式：
 * 第一行：人员能力值数组（逗号分隔，如 3,1,5,7,9）
 * 第二行：最低能力值 target（如 8）
 * 输出格式：
 * 最多可以派出的团队数量。
 */
public class No01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (!in.hasNextLine()) return;

        // 1. 读取输入
        String[] strs = in.nextLine().split(",");
        int[] nums = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            nums[i] = Integer.parseInt(strs[i]);
        }
        int target = Integer.parseInt(in.nextLine());

        // 2. 贪心核心：先排序
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;
        int teams = 0;

        // 3. 双指针匹配
        while (left <= right) {
            // 如果单人能力就已经达标，直接自己组队，右指针左移
            if (nums[right] >= target) {
                teams++;
                right--;
            }
            // 否则，让最弱的和当前最强的尝试组队
            else if (left < right && nums[left] + nums[right] >= target) {
                teams++;
                left++;
                right--;
            }
            // 如果最弱的和最强的加起来都不达标，最弱的只能被淘汰，左指针右移
            else {
                left++;
            }
        }

        System.out.println(teams);
    }
}
