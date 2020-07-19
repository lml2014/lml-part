package com.lml.part.leetcode.sword;

/**
 * @author shuishan
 * @date 2020/4/9
 */
public class XiangQiDemo {

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i % 3 != j % 3) {
                    System.out.print(String.format("A=%d, B=%d \t", i, j));
                }
            }
            System.out.println();
        }
    }
}
