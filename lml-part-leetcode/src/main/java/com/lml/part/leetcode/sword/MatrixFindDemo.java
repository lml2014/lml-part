package com.lml.part.leetcode.sword;

import org.junit.Assert;

/**
 * @author shuishan
 * @date 2020/3/24
 */
public class MatrixFindDemo {

    public static void main(String[] args) {
        int[][] matrix = build();
        Assert.assertTrue(find(matrix, 4));
    }

    private static boolean find(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        int r = 0, c = col - 1;
        while (r < row && c >= 0) {
            if (target == matrix[r][c]) {
                return true;
            } else if (target < matrix[r][c]) {
                c--;
            } else {
                r++;
            }
        }
        return false;
    }

    private static int[][] build() {
        int[][] matrix = new int[3][];
        matrix[0] = new int[]{1, 2};
        matrix[1] = new int[]{2, 3};
        matrix[2] = new int[]{4, 6};
        return matrix;
    }
}
