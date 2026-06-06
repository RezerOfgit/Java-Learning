/**
 * LeetCode 322. 零钱兑换
 * 给你一个整数数组 coins，表示不同面额的硬币；以及一个整数 amount，表示总金额。
 * 计算并返回可以凑成总金额所需的最少的硬币个数。
 * 如果没有任何一种硬币组合能组成总金额，返回 -1。
 * 你可以认为每种硬币的数量是无限的。
 */
public class No322_CoinChange {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }

        // dp[i] 表示凑出金额 i 所需的最少硬币数
        int[] dp = new int[amount + 1];
        // 初始化为 amount+1 表示不可达（因为最多也就用 amount 个 1 元硬币）
        Arrays.fill(dp, amount + 1);
        dp[0] = 0; // 凑出 0 元需要 0 个硬币

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        // 如果 dp[amount] 仍然是 amount+1 说明无法凑出
        return dp[amount] > amount ? -1 : dp[amount];
    }
}