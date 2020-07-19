package com.lml.part.leetcode;

/**
 * @author shuishan
 * @date 2020/6/25
 */
public class TreeNodeUtils {

    public static TreeNode createBinaryTreeByArray(Integer[] array, int index) {
        if (index < array.length) {
            Integer value = array[index];
            if (value == null) {
                return null;
            }
            TreeNode root = new TreeNode(value);
            root.left = createBinaryTreeByArray(array, 2 * index + 1);
            root.right = createBinaryTreeByArray(array, 2 * index + 2);
            return root;
        }
        return null;
    }
}
