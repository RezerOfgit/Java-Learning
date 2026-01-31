package com.gemini.task;

/**
 * @author Re-zero
 * @version 1.0
 */
import java.util.Arrays;
import java.util.Comparator;

public class Task09 {
    public static void main(String[] args) {
        Integer[] arr = {10, -5, 88, 20};

        // 目标：从大到小排序 -> {88, 20, 10, -5}
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // 请填空：
                return o2 - o1;
            }
        });

        System.out.println(Arrays.toString(arr));
    }
}
