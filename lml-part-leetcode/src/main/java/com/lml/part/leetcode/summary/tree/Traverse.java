package com.lml.part.leetcode.summary.tree;

import com.alibaba.fastjson.JSON;
import com.lml.part.leetcode.TreeNode;
import com.lml.part.leetcode.TreeNodeUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author shuishan
 * @date 2020/6/26
 */
public class Traverse {

    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 2, 3, 4, 5, null, 6, null, null, 7, 8};
        TreeNode root = TreeNodeUtils.createBinaryTreeByArray(array, 0);

        List<Integer> data = new ArrayList<>();

        preTraverse(data, root);
        System.out.println(data);

        List<Integer> midData = new ArrayList<>();
        midTraverse(midData, root);
        System.out.println(midData);

        List<Integer> afterData = new ArrayList<>();
        afterTraverse(afterData, root);
        System.out.println(afterData);
    }

    private static void preTraverse(List<Integer> data, TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (node != null || !stack.isEmpty()) {

            while (node != null) {
                data.add(node.val);
                stack.push(node);
                node = node.left;
            }

            if (!stack.isEmpty()) {
                node = stack.pop();
                node = node.right;
            }
        }
    }

    private static void midTraverse(List<Integer> data, TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (node != null || !stack.isEmpty()) {

            while (node != null) {
                stack.push(node);
                node = node.left;
            }

            if (!stack.isEmpty()) {
                node = stack.pop();
                data.add(node.val);
                node = node.right;
            }
        }
    }

    private static void afterTraverse(List<Integer> data, TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        TreeNode lastVisit = root;

        while (node != null || !stack.isEmpty()) {

            while (node != null) {
                stack.push(node);
                node = node.left;
            }

            node = stack.peek();
            if (node.right == null || node.right == lastVisit) {
                data.add(node.val);
                stack.pop();
                lastVisit = node;
                node = null;
            }else {
                node = node.right;
            }

        }
    }

}
