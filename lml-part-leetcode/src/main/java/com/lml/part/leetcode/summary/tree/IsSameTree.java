package com.lml.part.leetcode.summary.tree;

import com.lml.part.leetcode.TreeNode;
import com.lml.part.leetcode.TreeNodeUtils;

/**
 * @author shuishan
 * @date 2020/6/26
 */
public class IsSameTree {

    public static void main(String[] args) {
        TreeNode p = TreeNodeUtils.createBinaryTreeByArray(new Integer[]{1, 2, 3}, 0);
        TreeNode q = TreeNodeUtils.createBinaryTreeByArray(new Integer[]{1, 2, 3}, 0);
        System.out.println(isSameTree(p, q));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null && q != null) {
            return false;
        }
        if (p != null && q == null) {
            return false;
        }
        if (p.left == null && p.right == null && q.left == null && q.right == null) {
            return p.val == q.val;
        }
        boolean left = isSameTree(p.left, q.left);
        boolean right = isSameTree(p.right, q.right);
        return left && right;
    }
}
