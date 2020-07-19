package com.lml.part.leetcode._array;

import org.junit.Assert;

/**
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * <p>
 * 如果你最多只允许完成一笔交易（即买入和卖出一支股票一次），设计一个算法来计算你所能获取的最大利润。
 * <p>
 * 注意：你不能在买入股票前卖出股票。
 * <p>
 *  
 * <p>
 * 示例 1:
 * <p>
 * 输入: [7,1,5,3,6,4]
 * 输出: 5
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 * 注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author shuishan
 * @date 2020/3/30
 */
public class _121 {

    public static void main(String[] args) {
        Assert.assertEquals(5, maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        Assert.assertEquals(2, maxProfit(new int[]{2, 4, 1}));
    }

    /**
     * 前i天的最大收益 = max{前i-1天的最大收益，第i天的价格-前i-1天中的最小价格}
     *
     * 记录【今天之前买入的最小值】
     * 计算【今天之前最小值买入，今天卖出的获利】，也即【今天卖出的最大获利】
     * 比较【每天的最大获利】，取最大值即可
     */
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }
        int min = prices[0], max = 0;
        for (int i = 1; i < prices.length; i++) {
            max = Math.max(max, prices[i] - min);
            min = Math.min(min, prices[i]);
        }
        return max;
    }

    private static int maxProfits(int[] prices) {
        int beg = 0;//买入点
        int end = 0;//卖出点
        int pro = 0;//利润初始化为0应付价格一直下跌
        int record = 0;//记录当日卖出的最大利润
        for (end = 0; end < prices.length; end++) {
            if (prices[beg] > prices[end])//遇到价格更低时直接重置买入价格
                beg = end;
            record = prices[end] - prices[beg];
            pro = record > pro ? record : pro;
            //取买入价格重置后的利润与不重置买入价格利润的最大值，排除买入价下降但后续没有较高卖出价导致的利润下降。
        }
        return pro;
    }
}
