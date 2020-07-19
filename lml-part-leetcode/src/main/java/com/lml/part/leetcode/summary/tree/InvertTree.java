package com.lml.part.leetcode.summary.tree;

import com.lml.part.leetcode.TreeNode;
import com.lml.part.leetcode.TreeNodeUtils;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author shuishan
 * @date 2020/6/26
 */
public class InvertTree {

    public static void main(String[] args) {
        TreeNode root = TreeNodeUtils.createBinaryTreeByArray(new Integer[]{4, 2, 7, 1, 3, 6, 9}, 0);
        TreeNode result = invertTree(root);
        System.out.println(result.val);
    }

    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            root = queue.poll();
            TreeNode tmp = root.left;
            root.left = root.right;
            root.right = tmp;
            if (root.left != null) {
                queue.offer(root.left);
            }
            if (root.right != null) {
                queue.offer(root.right);
            }
        }
        return root;
    }
}
