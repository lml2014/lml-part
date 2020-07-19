package com.lml.part.leetcode._binarySearch;

import com.alibaba.fastjson.JSON;

/**
 * @author shuishan
 * @date 2020/6/30
 */
public class FastSortDemo3 {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 5, 3, 7, 8};
        fastSort(nums, 0, nums.length - 1);
        System.out.println(JSON.toJSONString(nums));
    }


    private static void fastSort(int[] arr, int left, int right) {
        if (left < right) {
            int temp = arr[left];
            int i = left, j = right;
            while (i < j) {
                while (i < j && arr[j] > temp) {
                    j--;
                }
                if (i < j) {
                    arr[i++] = arr[j];
                }
                while (i < j && arr[i] < temp) {
                    i++;
                }
                if (i < j) {
                    arr[i] = arr[j--];
                }
            }
            arr[i] = temp;
            fastSort(arr, left, i - 1);
            fastSort(arr, i + 1, right);
        }
    }
}
