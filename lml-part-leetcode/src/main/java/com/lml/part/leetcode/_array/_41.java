package com.lml.part.leetcode._array;

import org.junit.Assert;

/**
 * 遍历一次数组把大于等于1的和小于数组大小的值放到原数组对应位置，
 * 然后再遍历一次数组查当前下标是否和值对应，如果不对应那这个下标就是答案，否则遍历完都没出现那么答案就是数组长度加1。
 *
 * @author shuishan
 * @date 2020/3/23
 */
public class _41 {

    public static void main(String[] args) {
        Assert.assertEquals(3, firstMissingPositive(new int[]{1, 2, 0}));
        Assert.assertEquals(2, firstMissingPositive(new int[]{3, 4, -1, 1}));
    }

    public static int firstMissingPositive(int[] nums) {
        return 0;
    }
}
