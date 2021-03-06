package com.lml.part.leetcode.summary.dfs;

/**
 * 1.递归下去
 * 2.回溯上来。
 * 顾名思义，深度优先，则是以深度为准则，先一条路走到底，直到达到目标。这里称之为递归下去。
 * <p>
 * 否则既没有达到目标又无路可走了，那么则退回到上一步的状态，走其他路。这便是回溯上来。
 * 重点：状态回溯
 *
 * @author shuishan
 * @date 2020/6/16
 */
public class DFSDemo {

    public static int n = 10, m = 10;               //地图的宽高，设置为10 * 10的表格
    public static int goal_x = 9, goal_y = 9;     //目标的坐标，暂时设置为右下角
    public static int px[] = {-1, 0, 1, 0};   //通过px 和 py数组来实现左下右上的移动顺序
    public static int py[] = {0, -1, 0, 1};
    public static boolean flag = false;           //是否能达到终点的标志

    public static void main(String[] args) {
        int[][] graph = new int[n][m];        //地图
        int[][] used = new int[n][m];         //用来标记地图上那些点是走过的
        DFS(graph, used, 0, 0);
    }

    public static void DFS(int[][] graph, int[][] used, int x, int y) {
        // 如果与目标坐标相同，则成功
        if (graph[x][y] == graph[goal_x][goal_y]) {
            System.out.println("success!");
            flag = true;
            return;
        }
        // 遍历四个方向
        for (int i = 0; i != 4; ++i) {
            //如果没有走过这个格子
            int new_x = x + px[i];
            int new_y = y + py[i];
            if (new_x >= 0 && new_x < n && new_y >= 0
                    && new_y < m && used[new_x][new_y] == 0 && !flag) {

                used[new_x][new_y] = 1;     //将该格子设为走过

                DFS(graph, used, new_x, new_y);      //递归下去

                used[new_x][new_y] = 0;//状态回溯，退回来，将格子设置为未走过
            }
        }
    }
}
