package com.lml.part.leetcode._array;

import org.junit.Assert;

import java.util.Arrays;

/**
 * @author shuishan
 * @date 2020/3/27
 */
public class _217 {

    public static void main(String[] args) {
        Assert.assertTrue(containsDuplicate(new int[]{1, 2, 3, 1}));
        Assert.assertFalse(containsDuplicate(new int[]{1, 2, 3, 4}));
    }

    public static boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length == 1) {
            return false;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
