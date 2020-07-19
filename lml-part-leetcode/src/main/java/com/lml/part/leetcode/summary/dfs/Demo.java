package com.lml.part.leetcode.summary.dfs;

import com.alibaba.fastjson.JSON;

/**
 * @author shuishan
 * @date 2020/6/16
 */
public class Demo {

    public static void main(String[] args) {
        int[][] direct = new int[][]{
                {0, -1}, {0, 1}, {-1, 0}, {1, 0}
        };
        System.out.println("length:" + direct.length + ";en length:" + direct[0].length);
        System.out.println(direct[0][0]);
        System.out.println(direct[0][1]);
        int px = 3;
        int py = 4;
        for (int i = 0; i < 4; i++) {
            System.out.println("px=" + (px + direct[i][0]) + "; py=" + (py + direct[i][1]));
        }
    }
}
