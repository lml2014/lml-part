package com.lml.part.leetcode._math;

import org.junit.Assert;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

/**
 * @author shuishan
 * @date 2020/4/26
 */
public class _66 {

    public static void main(String[] args) {
        Assert.assertTrue(Objects.deepEquals(new int[]{1, 0}, plusOne(new int[]{9})));
        Assert.assertTrue(Objects.deepEquals(new int[]{1, 2, 4}, plusOne(new int[]{1, 2, 3})));
        Assert.assertTrue(Objects.deepEquals(new int[]{4, 3, 2, 2}, plusOne(new int[]{4, 3, 2, 1})));

        Assert.assertTrue(Objects.deepEquals(new int[]{1, 0}, plusOneOfficial(new int[]{9})));
        Assert.assertTrue(Objects.deepEquals(new int[]{1, 2, 4}, plusOneOfficial(new int[]{1, 2, 3})));
        Assert.assertTrue(Objects.deepEquals(new int[]{4, 3, 2, 2}, plusOneOfficial(new int[]{4, 3, 2, 1})));
    }

    public static int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0) {
            return digits;
        }
        int jw = 0;
        int[] result = new int[digits.length];
        for (int i = digits.length - 1; i >= 0; i--) {
            int num = digits[i] + jw;
            if (i == digits.length - 1) {
                num++;
            }
            jw = num / 10;
            result[i] = num % 10;
        }
        if (jw != 0) {
            int[] data = new int[result.length + 1];
            System.arraycopy(result, 0, data, 1, result.length);
            data[0] = jw;
            result = data;
        }
        return result;
    }

    public static int[] plusOneOfficial(int[] digits) {
        if (digits == null || digits.length == 0) {
            return digits;
        }
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

}
