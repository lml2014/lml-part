package com.lml.part.leetcode.summary.sort;

import com.alibaba.fastjson.JSON;

/**
 * @author shuishan
 * @date 2020/3/17
 */
public class MaoPaoDemo {

    public static void main(String[] args) {
        int[] data = new int[]{3, 4, 7, 6, 1, 8, 9, 4};
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i; j < data.length; j++) {
                if (data[i] > data[j]) {
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
        System.out.println(JSON.toJSONString(data));
    }

}

