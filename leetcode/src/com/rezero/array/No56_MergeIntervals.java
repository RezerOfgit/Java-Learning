package com.rezero.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Re-zero
 * @version 1.0
 * 给你一个由若干个区间组成的数组 intervals，其中 intervals[i] = [starti, endi]。
 * 请你合并所有重叠的区间，并返回一个不重叠的区间数组。
 * 输入: intervals = [[1,3], [2,6], [8,10], [15,18]]
 * 输出: [[1,6], [8,10], [15,18]] (因为 [1,3] 和 [2,6] 重叠了，合并成 [1,6])
 */
public class No56_MergeIntervals {

    public int[][] merge(int[][] intervals) {
        // 如果数组为空，直接返回
        if (intervals == null || intervals.length == 0) {
            return new int[0][0];
        }

        // 1. 极其关键的一步：按照区间的“左边界（开始时间）”从小到大排序！
        // (a, b) -> Integer.compare(a[0], b[0]) 是 Java 的 Lambda 表达式写法
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // 准备一个本子（List）来装合并后的区间
        List<int[]> merged = new ArrayList<>();

        // 2. 遍历每一个区间
        for (int[] interval : intervals) {
            int currentStart = interval[0];
            int currentEnd = interval[1];

            // 3. 核心判断逻辑：
            // 如果 merged 是空的，或者 merged 里面最后一个区间的“结束时间” < 当前区间的“开始时间” (currentStart)
            // 说明它们俩没有重叠，各自安好。
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < currentStart) {
                merged.add(interval);
            } else {
                // 说明发生重叠了！我们需要合并！
                // 找到 merged 里面的最后一个区间
                int[] lastMergedInterval = merged.get(merged.size() - 1);
                lastMergedInterval[1] = Math.max(lastMergedInterval[1], currentEnd);
            }
        }

        // 4. 把 List 转回二维数组并返回（Java 常用写法）
        return merged.toArray(new int[merged.size()][]);
    }
}