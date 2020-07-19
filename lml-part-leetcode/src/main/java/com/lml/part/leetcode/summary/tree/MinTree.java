package com.lml.part.leetcode.summary.tree;

import com.lml.part.leetcode.TreeNode;

import java.util.*;

/**
 * @author shuishan
 * @date 2020/6/26
 */
public class MinTree {

    public static void main(String[] args) {
        TreeNode root = createBinary(new Integer[]{3, 9, 20, null, null, 15, 7}, 0);
        show(root);
        System.out.println(minTree(root));
    }

    private static int minTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        Set<TreeNode> visited = new HashSet<>();

        q.offer(root);
        visited.add(root);
        int step = 1;

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                TreeNode cur = q.poll();
                if (cur.left == null && cur.right == null) {
                    return step;
                }
                if (cur.left != null) {
                    if (!visited.contains(cur.left)) {
                        q.offer(cur.left);
                        visited.add(cur.left);
                    }
                }
                if (cur.right != null) {
                    if (!visited.contains(cur.right)) {
                        q.offer(cur.right);
                        visited.add(cur.right);
                    }
                }
            }
            step++;
        }
        return step;
    }

    private static void show(TreeNode root) {
        List<Integer> data = new ArrayList<>();

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
        System.out.println(data);
    }

    private static TreeNode createBinary(Integer[] array, int index) {
        if (index < array.length) {
            Integer value = array[index];
            if (value == null) {
                return null;
            }
            TreeNode root = new TreeNode(value);
            root.left = createBinary(array, 2 * index + 1);
            root.right = createBinary(array, 2 * index + 2);
            return root;
        }
        return null;
    }

}
