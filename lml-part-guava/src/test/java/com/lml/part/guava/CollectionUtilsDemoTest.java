package com.lml.part.guava;

import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author shuishan
 * @date 2020/2/16
 */
public class CollectionUtilsDemoTest {

    @Test
    public void testUnion(){
        String[] arrayA = new String[] { "A", "B", "C", "D", "E", "F" };
        String[] arrayB = new String[] { "B", "D", "F", "G", "H", "K" };
        List<String> listA = Arrays.asList(arrayA);
        List<String> listB = Arrays.asList(arrayB);
        //2个数组取并集
        System.out.println(ArrayUtils.toString(CollectionUtils.union(listA, listB)));
        //[A, B, C, D, E, F, G, H, K]
    }

}