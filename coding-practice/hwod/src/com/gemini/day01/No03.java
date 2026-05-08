package com.gemini.day01;

/**
 * @author Re-zero
 * @version 1.0
 * 题目 3：考勤信息（纯业务逻辑模拟）
 * 题目描述： 公司用一个字符串来表示员工的出勤信息：
 * absent：缺勤
 * late：迟到
 * leaveearly：早退
 * present：正常上班 要求判断员工是否能获得出勤奖。能获得奖的条件：
 * 缺勤不超过 1 次；
 * 没有连续的 迟到/早退；
 * 任意连续 7 次考勤，缺勤/迟到/早退不超过 3 次。
 * 输入： present present absent present present leaveearly present
 * 输出： true
 * 破题核心思路： 这题没有任何算法，纯靠你平时写后端业务校验代码的基本功。
 * 遍历字符串数组，用计数器记录 absent 次数，用下标判断相邻状态，
 * 再加一个大小为 7 的滑动窗口判断条件 3。
 */
public class No03 {
    public static boolean checkAward(String input) {
        if (input == null || input.isEmpty()) return true; // 边界情况

        // 1. 拆分字符串
        String[] records = input.split("\\s+");
        int n = records.length;

        int absentCount = 0;

        // 2. 第一遍遍历：检查条件 1 和 条件 2
        for (int i = 0; i < n; i++) {
            String status = records[i];

            // 条件 1：缺勤不超过 1 次
            if ("absent".equals(status)) {
                absentCount++;
                if (absentCount > 1) {
                    return false;
                }
            }

            // 条件 2：没有连续的 迟到/早退
            // 只要当前不是第一个，且当前和上一个都是 (late 或 leaveearly)，则失败
            if (i > 0) {
                boolean isLateOrLeave = "late".equals(status) || "leaveearly".equals(status);
                boolean prevIsLateOrLeave = "late".equals(records[i - 1]) || "leaveearly".equals(records[i - 1]);

                if (isLateOrLeave && prevIsLateOrLeave) {
                    return false;
                }
            }
        }

        // 3. 第二遍遍历：检查条件 3 (任意连续 7 次考勤)
        // 只需要遍历到 n-7 即可，因为要检查以 i 开头的长度为 7 的窗口
        for (int i = 0; i <= n - 7; i++) {
            int badCount = 0; // 统计窗口内 缺勤/迟到/早退 的次数
            for (int j = i; j < i + 7; j++) {
                if (!"present".equals(records[j])) {
                    badCount++;
                }
            }
            if (badCount > 3) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String input1 = "present present absent present present leaveearly present";
        System.out.println(checkAward(input1)); // 输出: true

        String input2 = "present late late present present present present present";
        System.out.println(checkAward(input2)); // 输出: false (连续迟到)

        String input3 = "absent absent present present present present present";
        System.out.println(checkAward(input3)); // 输出: false (缺勤>1)
    }
}
