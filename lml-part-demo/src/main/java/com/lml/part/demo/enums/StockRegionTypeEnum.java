package com.lml.part.demo.enums;

public enum StockRegionTypeEnum {

    STOCK_REGION_TYPE_0(0, "未分配"),

    STOCK_REGION_TYPE_1(1, "拣货区"),

    STOCK_REGION_TYPE_2(2, "备货区"),

    STOCK_REGION_TYPE_3(3, "次品区");

    public Integer key;

    public String name;

    StockRegionTypeEnum(Integer key, String name) {
        this.key = key;
        this.name = name;
    }

    public static StockRegionTypeEnum getKey(Integer key) {
        if (key == null) {
            return null;
        }
        for (StockRegionTypeEnum typeEnum : StockRegionTypeEnum.values()) {
            if (typeEnum.key.equals(key)) {
                return typeEnum;
            }
        }
        return null;
    }
}
