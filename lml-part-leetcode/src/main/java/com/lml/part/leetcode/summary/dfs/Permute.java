package com.lml.part.leetcode.summary.dfs;

import com.alibaba.fastjson.JSON;

import java.util.LinkedList;
import java.util.List;

/**
 * @author shuishan
 * @date 2020/6/26
 */
public class Permute {


    public static void main(String[] args) {
        List<List<Integer>> result = permute(new int[]{1, 2, 3});
        System.out.println(JSON.toJSONString(result));
    }

    /* 主函数，输入一组不重复的数字，返回它们的全排列 */
    private static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        // 记录「路径」
        LinkedList<Integer> track = new LinkedList<>();
        backtrack(res, nums, track);
        return res;
    }

    private static void backtrack(List<List<Integer>> res, int[] nums, LinkedList<Integer> track) {
        if (track.size() == nums.length) {
            res.add(new LinkedList<>(track));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (track.contains(nums[i])) {
                continue;
            }
            track.add(nums[i]);
            backtrack(res, nums, track);
            track.removeLast();
        }
    }

}
