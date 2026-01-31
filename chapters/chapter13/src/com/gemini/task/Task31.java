package com.gemini.task;
import java.util.Arrays;
/**
 * @author Re-zero
 * @version 1.0
 */
public class Task31 {
    public static void main(String[] args) {
        // 注意：这是一个无序的数组
        int[] arr = {1, 9, 20, 5, 100};

        // 程序员想查找数字 5 在哪里
        // ❌ 错误操作：没有排序直接查
        int index = Arrays.binarySearch(arr, 5);
        System.out.println(index);
        // 请问：index 能准确返回 3 吗？
        // A. 能，二分查找很智能
        // B. 不能，结果是不可预测的（可能是负数）
    }
}