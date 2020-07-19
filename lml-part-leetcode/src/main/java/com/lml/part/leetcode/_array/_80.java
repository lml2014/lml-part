package com.lml.part.leetcode._array;

import org.junit.Assert;

/**
 * @author shuishan
 * @date 2020/3/23
 */
public class _80 {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        Assert.assertEquals(5, removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums) {
            if (i < 2 || n > nums[i - 2]) {
                nums[i++] = n;
            }
        }
        return i;
    }
}
