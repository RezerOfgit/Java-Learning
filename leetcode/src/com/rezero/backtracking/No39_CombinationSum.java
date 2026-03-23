package com.rezero.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Re-zero
 * @version 1.0
 * 给你一个 无重复元素 的整数数组 candidates 和一个目标整数 target ，找出 candidates
 * 中可以使数字和为目标数 target 的 所有 不同组合 ，并以列表形式返回。你可以按 任意顺序
 * 返回这些组合。
 * candidates 中的 同一个 数字可以 无限制重复被选取 。如果至少一个数字的被选数量不同，
 * 则两种组合是不同的。
 * 对于给定的输入，保证和为 target 的不同组合数少于 150 个。
 */
public class No39_CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, path, res);
        return res;
    }

    private void backtrack(int[] candidates, int target, int startIndex, List<Integer> path, List<List<Integer>> res) {
        if (target < 0) {
            return;
        }

        if (target == 0) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = startIndex; i < candidates.length; i++) {
            if (candidates[i] > target) {
                break;
            }

            path.add(candidates[i]);

            backtrack(candidates, target - candidates[i], i, path, res);

            path.remove(path.size() - 1);
        }
    }
}
