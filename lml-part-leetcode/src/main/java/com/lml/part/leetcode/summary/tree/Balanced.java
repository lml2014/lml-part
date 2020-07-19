package com.lml.part.leetcode.summary.tree;

import com.lml.part.leetcode.TreeNode;

/**
 * @author shuishan
 * @date 2020/6/23
 */
public class Balanced {

    public static void main(String[] args) {
        TreeNode root = build(1, 2, 3);
        left(root);
        System.out.println();
        System.out.println("-----------");
        middle(root);
        System.out.println();
        System.out.println("-----------");
        right(root);
        System.out.println();
        System.out.println("-----------");

    }

    public static TreeNode build(int... args) {
        if (args == null) {
            return null;
        }
        TreeNode root = new TreeNode(args[0]);
        if (args.length == 1) {
            return root;
        }
        if (args.length > 2) {
            root.left = new TreeNode(args[1]);
        }
        if (args.length >= 3) {
            root.right = new TreeNode(args[2]);
        }
        return root;
    }

    private static void left(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + "\t");
        left(root.left);
        left(root.right);
    }

    private static void middle(TreeNode root) {
        if (root == null) {
            return;
        }
        middle(root.left);
        System.out.print(root.val + "\t");
        middle(root.right);
    }

    private static void right(TreeNode root) {
        if (root == null) {
            return;
        }
        right(root.left);
        right(root.right);
        System.out.print(root.val + "\t");
    }


}
