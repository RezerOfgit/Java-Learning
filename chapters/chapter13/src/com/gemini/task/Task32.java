package com.gemini.task;

import java.util.Arrays;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task32 {
    public static void main(String[] args) {
        int[] src = {10, 20, 30, 40, 50}; // 源数组
        int[] dest = {1, 2, 3, 4, 5};     // 目标数组

        // 参数解读：
        // src: 源数组
        // 1:   从源数组的索引 1 开始拿 (即拿到 20)
        // dest:目标数组
        // 2:   贴到目标数组的索引 2 的位置 (覆盖掉 3)
        // 2:   一共拷贝 2 个元素 (即拷贝 20, 30)
        System.arraycopy(src, 1, dest, 2, 2);
        System.out.println(Arrays.toString(dest));
        // 此时打印 dest，结果是？
        //int[] dest = {1, 2, 20, 30, 5};
        // 格式：{_, _, _, _, _}
    }
}
