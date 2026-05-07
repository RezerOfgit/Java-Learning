package com.rezero.array;

/**
 * @author Re-zero
 * @version 1.0
 * 给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
 * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。
 * 设计一个算法来计算你所能获取的最大利润。
 * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
 */
public class No121_BestTimeToBuyAndSellStock {

    public int maxProfit_aiModify(int[] prices) {
        int maxProfit = 0;
        // 准备一个小本本，记录遍历过程中遇到的最低价格
        // 初始设为一个极其大的数字，保证第一天的价格一定能写进本子里
        int minPrice = Integer.MAX_VALUE;

        // 只用一层循环！遍历每一天的价格
        for (int i = 0; i < prices.length; i++) {
            // 1. 如果今天的价格比历史最低价还要低，赶紧更新历史最低价
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            // 2. 如果今天不是最低价，那我就算算：如果今天卖出，能赚多少钱？
            // 并把这个赚的钱和之前的 maxProfit 打擂台
            else {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }
        }

        return maxProfit;

    }
    public int maxProfit_my(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
            }
        }
        return maxProfit;//暴力破解,但是超时了
    }

    public int maxProfit(int[] prices) {
        // 1. 记录历史最低价，一开始设为一个极大的数（方便第一天直接更新）
        int minPrice = Integer.MAX_VALUE;
        // 2. 记录最大利润，一开始是 0（因为最差也是不买不卖，赚 0 元）
        int maxProfit = 0;

        // 3. 开始乘坐时光机，遍历每一天的股票价格
        for (int i = 0; i < prices.length; i++) {
            int currentPrice = prices[i];

            // 4. 判断：今天的价格，是不是比我之前记下的历史最低价还要低？
            // 如果是，赶紧更新小本本上的历史最低价！
            if (currentPrice < minPrice) {
                minPrice = currentPrice;
            }

            // 5. 如果不是最低价，那如果在今天卖出，利润是多少？会不会比之前的 maxProfit 更高？
            // 提示：利润 = currentPrice - minPrice。用 Math.max 更新 maxProfit。
            int currentProfit = currentPrice - minPrice;
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
            }
        }

        // 6. 返回能赚到的最大利润
        return maxProfit;
    }
}