package com.lml.part.leetcode.summary.dp;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/**
 * @author shuishan
 * @date 2020/6/23
 */
public class FibDemo {

    public static void main(String[] args) {
        for (int i = 1; i < 9; i++) {
            System.out.print(fib(i) + "\t");
        }
        System.out.println();
        for (int i = 1; i < 9; i++) {
            System.out.print(fibMemo(i) + "\t");
        }
        System.out.println();
    }

    private static int fib(int n) {
        if (n < 3) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    private static int fibMemo(int n) {
        if (n < 3) return 1;
        int[] dp = new int[n + 1];
        dp[1] = dp[2] = 1;
        for (int i = 3; i <= n; i++)
            dp[i] = dp[i - 1] + dp[i - 2];
        System.out.println();
        System.out.println("dp:[" + n + "]" + JSON.toJSONString(dp));
        return dp[n];
    }
}
