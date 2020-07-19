package com.lml.part.leetcode._array;

import java.util.Arrays;

/**
 * @author shuishan
 * @date 2020/3/23
 */
public class _274 {

    public static void main(String[] args) {

    }

    public int hIndex(int[] citations) {
        // 排序（注意这里是升序排序，因此下面需要倒序扫描）
        Arrays.sort(citations);
        // 线性扫描找出最大的 i
        int i = 0;
        while (i < citations.length && citations[citations.length - 1 - i] > i) {
            i++;
        }
        return i;
    }
}
