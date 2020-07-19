package com.lml.part.leetcode._binarySearch;

import com.alibaba.fastjson.JSON;

/**
 * @author shuishan
 * @date 2020/6/30
 */
public class FastSortDemo {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 5, 3, 6, 8, 2};
        quickSort(nums, 0, nums.length - 1);
        System.out.println(JSON.toJSONString(nums));
    }

    private static void quickSort(int[] nums, int left, int right) {
        if (nums == null || nums.length <= 1 || left >= right) {
            return;
        }
        int mid = partition(nums, left, right);
        quickSort(nums, left, mid);
        quickSort(nums, mid + 1, right);
    }

    private static int partition(int[] nums, int left, int right) {
        int temp = nums[left];
        while (right > left) {
            while (temp <= nums[right] && left < right) {
                right--;
            }
            if (left < right) {
                nums[left] = nums[right];
                ++left;
            }

            while (temp >= nums[left] && left < right) {
                ++left;
            }

            if (left < right) {
                nums[right] = nums[left];
                --right;
            }
        }
        nums[left] = temp;
        return left;
    }
}
