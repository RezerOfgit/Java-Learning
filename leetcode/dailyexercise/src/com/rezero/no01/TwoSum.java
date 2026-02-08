package com.rezero.no01;

/**
 * @author Re-zero
 * @version 1.0
 */
public class TwoSum {
    /*
    题目描述： 给定一个整数数组 nums 和一个目标值 target，
    请你在该数组中找出和为目标值的那 两个 整数，并返回它们的数组下标。
    输入：nums = [2, 7, 11, 15], target = 9
    因为 nums[0] + nums[1] = 2 + 7 = 9
    所以返回 [0, 1]
     */
    public static void main(String[] args) {
         int[] nums = {2, 7, 11, 15};
         int target = 9;
        new Solution().twoSum(nums, target);
    }
}
//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        int a = 0;
//        int b = 0;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target){
//                    System.out.println(i + " " + j);
//                    a = i;
//                    b = j;
//                    return new int[]{a,b};
//                }
//            }
//        }
//        return null;
//    }
//}
