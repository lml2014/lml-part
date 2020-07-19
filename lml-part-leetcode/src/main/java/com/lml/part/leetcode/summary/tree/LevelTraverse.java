package com.lml.part.leetcode.summary.tree;

import com.lml.part.leetcode.TreeNode;
import com.lml.part.leetcode.TreeNodeUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author shuishan
 * @date 2020/6/26
 */
public class LevelTraverse {

    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 2, 3, 4, 5, null, 6, null, null, 7, 8};
        TreeNode root = TreeNodeUtils.createBinaryTreeByArray(array, 0);

        List<Integer> data = new ArrayList<>();
        levelTraverse(data, root);
        System.out.println(data);
    }

    private static void levelTraverse(List<Integer> data, TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            data.add(node.val);
            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }
    }
}
