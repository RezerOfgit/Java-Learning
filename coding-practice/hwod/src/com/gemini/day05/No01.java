package com.gemini.day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Re-zero
 * @version 1.0
 * 给定一系列会议的开始时间和结束时间，格式为 [[s1,e1], [s2,e2], ...]。
 * 请你计算出这些会议实际占用了多少个时间段（如果有重叠的会议，需要合并成一个长的时间段）。
 * 输入： [[1,4], [2,5], [7,9], [14,18]]
 * 输出： [[1,5], [7,9], [14,18]] （解释：[1,4] 和 [2,5] 有重叠，合并为 [1,5]）
 */
public class No01 {
    public static void main(String[] args) {
        // --- 假设从控制台读入了二维数组 intervals ---
        int[][] intervals = {
                {1, 4}, {2, 5}, {7, 9}, {14, 18}
        };

        // 1. 极其核心：按照区间的“起点”从小到大排序！
        // 如果起点一样，按终点排。贪心的基础就是有序。
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            return a[1] - b[1];
        });

        // 用来存放合并后的区间
        List<int[]> merged = new ArrayList<>();

        for (int[] interval : intervals) {
            // 2. 如果合并列表是空的，或者当前区间的起点 > 上一个区间的终点
            // 说明完全没有交集，直接加入列表
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(new int[]{interval[0], interval[1]}); // ⚠️ 最好重新 new 一个，防止引用污染
            } else {
                // 3. 否则，说明有交集（重叠了）！
                // 把上一个区间的终点，更新为“上一个终点”和“当前终点”中较大的那个
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }

        // 打印结果
        for (int[] m : merged) {
            System.out.print(Arrays.toString(m) + " ");
        }
    }
}
