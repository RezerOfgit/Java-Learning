package com.gemini.day02;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Template01 {
    /**
    // 假设数组是 nums
    int left = 0, right = 0;
    int maxLen = 0; // 记录最长/最短的结果
// 这里根据题目要求，可能需要一些变量记录窗口内的状态，比如 sum, count 等

    while (right < nums.length) {
        // 1. 右指针主动扩张：把 nums[right] 加入窗口，更新状态
        // ...

        // 2. 判断窗口状态是否“违规”（即不满足题目条件了）
        while (// 违规条件 //) {
            // 3. 左指针被迫收缩：把 nums[left] 移出窗口，更新状态
            // ...
            left++; // 左指针向右移动
        }

        // 4. 到这里，窗口一定是“合法”的，更新我们的最大/最小长度记录
        maxLen = Math.max(maxLen, right - left + 1);

        // 5. 右指针继续前进
        right++;
    }
    */
}
