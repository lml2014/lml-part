package com.lml.part.leetcode._array;

import org.junit.Assert;

/**
 * @author shuishan
 * @date 2020/3/22
 */
public class _26 {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2};
        Assert.assertEquals(2, removeDuplicates(nums));
        nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        Assert.assertEquals(5, removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        int temp = nums[0];
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != temp) {
                temp = nums[i];
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
