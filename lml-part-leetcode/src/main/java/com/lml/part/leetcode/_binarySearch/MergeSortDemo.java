package com.lml.part.leetcode._binarySearch;

import com.alibaba.fastjson.JSON;

/**
 * @author shuishan
 * @date 2020/7/3
 */
public class MergeSortDemo {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 5, 3, 6, 8, 2};
        mergeSort(nums);
        System.out.println(JSON.toJSONString(nums));
    }

    public static void mergeSort(int[] nums) {
        int[] temp = new int[nums.length];
        sort(nums, 0, nums.length - 1, temp);

    }

    public static void sort(int[] nums, int left, int right, int[] temp) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            sort(nums, left, mid, temp);
            sort(nums, mid + 1, right, temp);
            merge(nums, left, mid, right, temp);
        }
    }

    public static void merge(int[] nums, int left, int mid, int right, int[] temp) {
        int i = left;
        int j = mid;
        int t = 0;
        while (i < mid && j < right) {
            if (nums[i] <= nums[j]) {
                temp[t++] = nums[i++];
            } else {
                temp[t++] = nums[j++];
            }
        }
        while (i < mid) {
            temp[t++] = nums[i++];
        }
        while (j < right) {
            temp[t++] = nums[j++];
        }
        t = 0;
        //将temp中的元素全部拷贝到原数组中
        while (left <= right) {
            nums[left++] = temp[t++];
        }
    }

}
