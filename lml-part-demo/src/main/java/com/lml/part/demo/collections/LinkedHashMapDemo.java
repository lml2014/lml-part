package com.lml.part.demo.collections;

import java.util.LinkedHashMap;

/**
 * @author shuishan
 * @date 2020/4/4
 */
public class LinkedHashMapDemo {

    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<>(10, 10, true);
        map.put("a", "1");
        map.put("b", "2");
        System.out.println(map);
        map.remove("a");
        map.get("a");
    }
}
