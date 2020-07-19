package com.lml.part.leetcode._binarySearch;

/**
 * @author shuishan
 * @date 2020/7/14
 */
public class Demo {

    public static void main(String[] args) {
        System.out.println("alter table stock_product_good  modify column `bom_detail` varchar(4096) DEFAULT NULL COMMENT 'bom明细';");
        for (int i = 0; i < 20; i++) {
            System.out.println("alter table stock_product_good_" + i + " modify column `bom_detail` varchar(4096) DEFAULT NULL COMMENT 'bom明细';");
        }
    }
}
