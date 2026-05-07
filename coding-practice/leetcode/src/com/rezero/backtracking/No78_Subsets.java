package com.rezero.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Re-zero
 * @version 1.0
 * 题目大意： 给你一个整数数组 nums ，数组中的元素互不相同 。返回该数组所有可能的子集（幂集）。
 * 不能包含重复的子集。
 * 输入: nums = [1,2,3]
 * 输出: [[], [1], [2], [1,2], [3], [1,3], [2,3], [1,2,3]]
 */
public class No78_Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        // 初始时，从第 0 个索引开始选
        backtrack(nums, 0, path, res);
        return res;
    }

    private void backtrack(int[] nums, int startIndex, List<Integer> path, List<List<Integer>> res) {
        // 1. 雁过拔毛：不用判断长度，每次进来直接把当前的 path 收集进 res 里！
        res.add(new ArrayList<>(path));

        // 2. 遍历选择列表：注意！这里的 for 循环不再从 0 开始，而是从 startIndex 开始！
        // 这样就能保证不走回头路，避免出现 [1,2] 和 [2,1] 的重复
        for (int i = startIndex; i < nums.length; i++) {

            // 3. 做选择：把 nums[i] 加进 path
            path.add(nums[i]);

            // 4. 进入下一层：调用 backtrack，注意下一个起始位置应该是 i + 1
            // (因为不能重复选当前的数字)
            backtrack(nums, i + 1, path, res);

            // 5. 撤销选择：把 path 最后加进去的数字移除
            path.remove(path.size() - 1);
        }
    }
}
