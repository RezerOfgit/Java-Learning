/**
 * LeetCode 121. 买卖股票的最佳时机
 * 给定一个数组 prices，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
 * 你只能选择某一天买入这只股票，并选择在未来的某一个不同的日子卖出该股票。
 * 设计一个算法来计算你所能获取的最大利润。
 * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0。
 */
public class No121_BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int minPrice = prices[0]; // 到当前天为止的最低价格
        int maxProfit = 0;        // 当前能获得的最大利润

        for (int i = 1; i < prices.length; i++) {
            // 如果今天卖出，利润 = 今天价格 - 之前最低价格
            int profit = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, profit);
            // 更新最低价格
            minPrice = Math.min(minPrice, prices[i]);
        }

        return maxProfit;
    }
}