package com.lml.part.leetcode.summary.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * @author shuishan
 * @date 2020/6/16
 */
public class BFSDemo {

    int n = 10, m = 10;                   //地图宽高

    public static void main(String[] args) {

    }

//    public static void BFS() {
//        Queue<Integer> que = new LinkedBlockingDeque<>();              //用队列来保存路口
//        int[][] graph = new int[n][m];          //地图
//        int px[] = {-1, 0, 1, 0};   //移动方向的数组
//        int py[] = {0, -1, 0, 1};
//        que.offer(1);
//        que.push(起点入队);      //将起点入队
//        while (!que.empty()) {    //只要队列不为空
//            auto temp = que.pop();          //得到队列中的元素
//            for (int i = 0; i != 4; ++i) {
//                if (//可以走) {
//                //标记当前格子
//                //将当前状态入队列，等待下次提取
//            }
//        }
//    }
}
