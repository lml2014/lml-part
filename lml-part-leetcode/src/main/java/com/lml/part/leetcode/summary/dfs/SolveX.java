package com.lml.part.leetcode.summary.dfs;

import com.alibaba.fastjson.JSON;

/**
 * @author shuishan
 * @date 2020/6/27
 */
public class SolveX {

    public static void main(String[] args) {
        char[][] board = new char[][]{
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}
        };
        System.out.println(JSON.toJSONString(board));
        solve(board);
        System.out.println(JSON.toJSONString(board));

        board = new char[][]{
                {'O','O','O'},
                {'O','O','O'},
                {'O','O','O'}
        };
        System.out.println(JSON.toJSONString(board));
        solve(board);
        System.out.println(JSON.toJSONString(board));
    }

    public static void solve(char[][] board) {
        int nr = board.length;
        int nc = board[0].length;

        int[][] visited = new int[nr][nc];

        for (int i = 0; i < nr; i++) {
            for (int j = 0; j < nc; j++) {
                if (board[i][j] == 'O') {
                    dfs(i, j, visited, board);
                }
                visited[i][j] = 1;
            }
        }
    }

    private static void dfs(int i, int j, int[][] visited, char[][] board) {
        int nr = board.length;
        int nc = board.length;

        if (i < 0 || j < 0 || i > nr - 1 || j > nc - 1) {
            return;
        }
        if (i - 1 < 0 || i + 1 > nr - 1 || j - 1 < 0 || j + 1 > nc - 1) {
            visited[i][j] = 1;
        }
        if (visited[i][j] == 1) {
            return;
        }
        board[i][j] = 'X';
        visited[i][j] = 1;
        dfs(i - 1, j, visited, board);
        dfs(i + 1, j, visited, board);
        dfs(i, j - 1, visited, board);
        dfs(i, j + 1, visited, board);
    }
}
