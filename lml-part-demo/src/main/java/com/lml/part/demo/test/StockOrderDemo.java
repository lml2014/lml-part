package com.lml.part.demo.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * @author shuishan
 * @date 2020/5/7
 */
public class StockOrderDemo {

    public static void main(String[] args) {
        StockOrderParams demo = JSONObject.parseObject("{\"id\":1,\"orderbyId\":true,\"orderbyCreated\":true}",StockOrderParams.class);
        System.out.println(JSON.toJSONString(demo));
    }
}
