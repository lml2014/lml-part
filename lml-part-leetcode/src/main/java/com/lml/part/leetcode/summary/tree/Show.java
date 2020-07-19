package com.lml.part.leetcode.summary.tree;

import com.alibaba.fastjson.JSON;
import com.lml.part.leetcode.TreeNode;
import com.lml.part.leetcode.TreeNodeUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shuishan
 * @date 2020/6/25
 */
public class Show {

    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 2, 3, 4, 5, null, 6, null, null, 7, 8};
        TreeNode root = TreeNodeUtils.createBinaryTreeByArray(array, 0);

        List<Integer> preData = new ArrayList<>();
        preTraverse(preData, root);
        System.out.println("pre data:" + JSON.toJSONString(preData));

        List<Integer> midData = new ArrayList<>();
        midTraverse(midData, root);
        System.out.println("mid data:" + JSON.toJSONString(midData));

        List<Integer> afterData = new ArrayList<>();
        afterTraverse(afterData, root);
        System.out.println("mid data:" + JSON.toJSONString(afterData));
    }


    private static void preTraverse(List<Integer> data, TreeNode root) {
        if (root == null) {
            return;
        }
        data.add(root.val);
        preTraverse(data, root.left);
        preTraverse(data, root.right);
    }

    private static void midTraverse(List<Integer> data, TreeNode root) {
        if (root == null) {
            return;
        }
        midTraverse(data, root.left);
        data.add(root.val);
        midTraverse(data, root.right);
    }

    private static void afterTraverse(List<Integer> data, TreeNode root) {
        if (root == null) {
            return;
        }
        afterTraverse(data, root.left);
        afterTraverse(data, root.right);
        data.add(root.val);
    }
}
