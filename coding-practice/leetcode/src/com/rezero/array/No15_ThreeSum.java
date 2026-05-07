package com.rezero.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Re-zero
 * @version 1.0
 * 给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]]
 * 满足 i != j、i != k 且 j != k ，同时还满足 nums[i] + nums[j] + nums[k] == 0 。
 * 请你返回所有和为 0 且不重复的三元组。
 * 注意：答案中不可以包含重复的三元组。
 */
public class No15_ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        // 1. 灵魂第一步：必须先排序！
        Arrays.sort(nums);

        // 2. 遍历大哥 i (注意：因为后面还要留两个位置给 left 和 right，所以 i 走到 length - 2 就可以了)
        for (int i = 0; i < nums.length - 2; i++) {
            // 【极其重要的剪枝】：如果排好序后，连最小的大哥 nums[i] 都大于 0，那后面的人全是正数，加起来绝对不可能等于 0，直接结束战斗！
            if (nums[i] > 0) {
                break;
            }

            // 【大哥去重】：如果当前大哥和上一个大哥长得一样，跳过他！(注意 i > 0 的边界保护)
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // 3. 定义两个小弟的初始位置
            int left = i + 1;
            int right = nums.length - 1;

            // 4. 左右夹击，直到两人相遇
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    // 找到了！把这三个人打包加入结果集
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // 如果 left 的下一个数字和当前 left 一样，left 就一直往右走跳过重复项
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    // 如果 right 的前一个数字和当前 right 一样，right 就一直往左走跳过重复项
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    // 去重完毕后，两人各自往前走一步，寻找下一组可能的组合
                    left++;
                    right--;

                } else if (sum < 0) {
                    // 战力太小，左边的小弟往右走换个更强的
                    left++;


                } else {
                    // 战力太大，右边的小弟往左走换个更弱的
                    right--;
                }
            }
        }
        return res;
    }
}
