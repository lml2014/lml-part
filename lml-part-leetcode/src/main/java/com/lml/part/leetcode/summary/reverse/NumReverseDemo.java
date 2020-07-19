package com.lml.part.leetcode.summary.reverse;

import org.junit.Assert;

/**
 * @author shuishan
 * @date 2020/6/18
 */
public class NumReverseDemo implements Reverse {

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        Assert.assertEquals(321, reverse(123));
        Assert.assertEquals(-321, reverse(-123));
    }

    public static int reverse(int num) {
        int result = 0;
        while (num != 0) {
            int n = num % 10;
            num = num / 10;
            if ((result > Integer.MAX_VALUE / 10) || (result == Integer.MAX_VALUE / 10 && n > 7)) {
                return 0;
            }
            if ((result < Integer.MIN_VALUE / 10) || (result == Integer.MIN_VALUE / 10 && n < -8)) {
                return 0;
            }
            result = result * 10 + n;
        }
        return result;
    }
}
