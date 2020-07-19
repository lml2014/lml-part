package com.lml.part.leetcode._array;

import org.junit.Assert;

/**
 * @author shuishan
 * @date 2020/3/22
 */
public class _27 {

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 2, 3};
        int size = removeElement(nums, 3);
        Assert.assertEquals(2, size);
        nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        size = removeElement(nums, 2);
        Assert.assertEquals(5, size);
    }

    public static int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

}
