package com.lml.part.leetcode._binarySearch;

import com.alibaba.fastjson.JSON;

/**
 * @author shuishan
 * @date 2020/6/30
 */
public class FastSortDemo2 {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 5, 3, 6, 8, 2};
        quickSort(nums, 0, nums.length - 1);
        System.out.println(JSON.toJSONString(nums));
    }

    private static void quickSort(int[] nums, int left, int right) {
        if (left < right) {
            int i = left;
            int j = right;
            int temp = nums[left];
            while (i < j) {
                while (i < j && nums[j] > temp) {
                    j--;
                }
                if (i < j) {
                    nums[i++] = nums[j];
                }
                while (i < j && nums[i] < temp) {
                    i++;
                }
                if (i < j) {
                    nums[j--] = nums[i];
                }
            }
            nums[i] = temp;
            quickSort(nums, left, i - 1);
            quickSort(nums, i + 1, right);
        }
    }
}
