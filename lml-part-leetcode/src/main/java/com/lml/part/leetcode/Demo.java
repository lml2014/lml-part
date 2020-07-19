package com.lml.part.leetcode;

import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author shuishan
 * @date 2020/2/25
 */
public class Demo {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("A");
        names.add("B");
        names.add("C");
        Iterator<String> iterator = names.iterator();
        iterator.next();
        iterator.remove();
        System.out.println(names);
    }

}
