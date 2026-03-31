package com.rezero.dp;

import java.util.Arrays;

/**
 * @author Re-zero
 * @version 1.0
 * 给你一个整数数组 coins ，表示不同面额的硬币；以及一个整数 amount ，表示总金额。
 * 计算并返回可以凑成总金额所需的 最少的硬币个数 。如果没有任何一种硬币组合能组成总金额，
 * 返回 -1 。
 * 你可以认为每种硬币的数量是无限的。
 */
public class No322_CoinChange {
    public int coinChange(int[] coins, int amount) {
        // 1. 初始化 dp 数组，长度为 amount + 1
        int[] dp = new int[amount + 1];

        // 2. 将数组填充为一个“极大值” (因为最多只需要 amount 个 1 元硬币，所以 amount + 1 绝对不可能达到)
        // 这样在求 Math.min 时才不会被初始值 0 干扰
        Arrays.fill(dp, amount + 1);

        // 3. Base case：凑齐金额 0 需要 0 个硬币
        dp[0] = 0;

        // 4. 外层循环：遍历从 1 到 amount 的每一个金额 i
        for (int i = 1; i <= amount; i++) {
            // 内层循环：遍历你可以选择的每一枚硬币 coin
            for (int coin : coins) {
                // 只有当当前金额 i 大于等于 硬币面值 coin 时，这枚硬币才能被使用
                if (i >= coin) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        // 5. 如果 dp[amount] 还是最初的极大值，说明没有任何组合能凑出这个金额，返回 -1
        return dp[amount] > amount ? -1 : dp[amount];
    }
}