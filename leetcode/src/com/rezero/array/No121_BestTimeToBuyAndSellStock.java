package com.rezero.array;

/**
 * @author Re-zero
 * @version 1.0
 */
public class No121_BestTimeToBuyAndSellStock {

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