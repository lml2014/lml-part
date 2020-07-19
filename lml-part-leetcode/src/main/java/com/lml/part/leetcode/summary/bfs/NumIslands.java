package com.lml.part.leetcode.summary.bfs;

import org.apache.commons.lang3.tuple.Pair;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * @author shuishan
 * @date 2020/6/26
 */
public class NumIslands {

    public static void main(String[] args) {

    }

    public static int numIslands(char[][] grid) {
        int result = 0;
        bfs(result, grid);
        return result;
    }

    private static void bfs(int result, char[][] grid) {
        if (grid == null) {
            return;
        }

        Queue<Pair<Integer, Integer>> queue = new LinkedList<>();
        Set<Pair<Integer, Integer>> visted = new HashSet<>();

        queue.add(Pair.of(0, 0));
        visted.add(Pair.of(0, 0));

        while (!queue.isEmpty()) {
            Pair<Integer, Integer> node = queue.poll();

        }

    }

    private static boolean check(Pair<Integer, Integer> node, char[][] grid) {
        int x = node.getLeft();
        int y = node.getRight();

        return false;
    }

}
