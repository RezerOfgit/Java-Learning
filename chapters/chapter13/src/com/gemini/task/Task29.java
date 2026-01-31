package com.gemini.task;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Re-zero
 * @version 1.0
 */

public class Task29 {
    public static void main(String[] args) {
        Integer[] arr = {1, -2, 8, 100, 20};

        // 目标：使用匿名内部类，实现降序排序 (100, 20, 8, 1, -2)
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // 请填空：返回什么可以实现“从大到小”？
                return o2 - o1;
            }
        });

        System.out.println(Arrays.toString(arr));
    }
}
