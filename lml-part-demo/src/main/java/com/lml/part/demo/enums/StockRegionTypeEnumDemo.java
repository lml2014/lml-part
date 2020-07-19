package com.lml.part.demo.enums;

/**
 * @author shuishan
 * @date 2020/2/27
 */
public class StockRegionTypeEnumDemo {

    public static void main(String[] args) {
        StockRegionTypeEnum s = StockRegionTypeEnum.getKey(123);
        System.out.println(s);

    }
}
