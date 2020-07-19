package com.lml.part.leetcode._array;

/**
 * @author shuishan
 * @date 2020/4/2
 */
public class _28 {

    public static void main(String[] args) {
        String name;
    }

    public static int strStr(String haystack, String needle) {
        if (haystack == null || haystack.length() == 0) {
            return -1;
        }
        if (needle == null || needle.length() == 0) {
            return -1;
        }
        char[] source = haystack.toCharArray();
        char[] need = needle.toCharArray();
        for (int i = 0; i < source.length; i++) {
            if (source[i] != need[0]) {
                while (++i < source.length && source[i] != need[0]) ;
            }
            if (i == source.length - 1) {
                return -1;
            }
            int j = i + 1;
            for (int k = 1; k < need.length; k++, j++) {
                if (source[j] != need[k]) {
                    break;
                }
            }
            if (j==need.length-1){
                return j;
            }

        }
        return -1;
    }
}
