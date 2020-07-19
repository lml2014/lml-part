package com.lml.part.leetcode._backtracking;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shuishan
 * @date 2020/6/27
 */
public class _78 {

    public static void main(String[] args) {
        System.out.println(JSON.toJSONString(subsets(new int[]{1, 2, 3})));
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> visited = new ArrayList<>();
        sets(result, visited, nums);
        return result;
    }

    private static void sets(List<List<Integer>> result, List<Integer> visited, int[] nums) {
        if (!visited.isEmpty() && !result.contains(visited)) {
            result.add(new ArrayList<>(visited));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            visited.add(nums[i]);
            sets(result, visited, nums);
            visited.remove(nums[i]);
        }
    }
}
