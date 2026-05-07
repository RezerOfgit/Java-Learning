package com.rezero.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Re-zero
 * @version 1.0
 * 题目大意： 给定一个不含重复数字的数组 nums ，返回其所有可能的全排列。
 * 输入: nums = [1,2,3]
 * 输出: [[1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], [3,2,1]] (共 6 种)
 */
public class No46_Permutations {

    public List<List<Integer>> permute(int[] nums) {
        // 准备一个"结果集"，用来装所有的排列
        List<List<Integer>> res = new ArrayList<>();
        // 准备一个"路径"，记录当前走到哪了
        List<Integer> path = new ArrayList<>();
        // 开启回溯之旅！
        backtrack(nums, path, res);
        return res;
    }

    private void backtrack(int[] nums, List<Integer> path, List<List<Integer>> res) {
        // 1. 结束条件：如果 path 的大小等于 nums 的长度
        if (path.size() == nums.length) {
            // 注意！这里必须 new 一个新的 ArrayList 把 path 装进去。
            // 因为 path 是个随叫随到的公共变量，后面还会被修改，不 new 的话最后全变成空的了！
            res.add(new ArrayList<>(path));
            return;
        }

        // 2. 遍历选择列表（遍历 nums 数组里的每一个数字）
        for (int i = 0; i < nums.length; i++) {
            // 排除不合法的选择：如果 path 里已经包含了当前数字 nums[i]，跳过它！(用 continue)
            if (path.contains(nums[i])) continue;

            // 3. 做选择：把 nums[i] 加进 path
            path.add(nums[i]);

            // 4. 进入下一层递归：调用 backtrack 自己
            backtrack(nums, path, res);

            // 5. 撤销选择（回溯）：把 path 里的最后一个元素删掉，腾出位置给下一个！
            path.remove(path.size() - 1);
        }
    }
}