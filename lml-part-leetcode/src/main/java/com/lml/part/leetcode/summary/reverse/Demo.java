package com.lml.part.leetcode.summary.reverse;

import java.util.*;

/**
 * @author shuishan
 * @date 2020/6/24
 */
public class Demo {

    public static void main(String[] args) {
        Set<Reverse> set = new HashSet<>();
        NumReverseDemo numReverseDemo = new NumReverseDemo();
        System.out.println(set.add(numReverseDemo));
        ReverseSolution reverseSolution = new ReverseSolution();
        System.out.println(set.add(reverseSolution));
        System.out.println(set.add(numReverseDemo));
        System.out.println(set.add(new NumReverseDemo()));
    }
}
