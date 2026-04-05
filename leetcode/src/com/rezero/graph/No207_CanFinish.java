package com.rezero.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Re-zero
 * @version 1.0
 * 你这个学期必须选修 numCourses 门课程，记为 0 到 numCourses - 1 。
 * 在选修某些课程之前需要一些先修课程。 先修课程按数组 prerequisites 给出，
 * 其中 prerequisites[i] = [ai, bi] ，表示如果要学习课程 ai 则 必须先学习课程 bi。
 * 例如，先修课程对 [0, 1] 表示：想要学习课程 0 ，你需要先完成课程 1 。
 * 请你判断是否可能完成所有课程的学习？如果可以，返回 true ；否则，返回 false 。
 */
public class No207_CanFinish {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegrees = new int[numCourses];
        List<List<Integer>> adjacency = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < numCourses; i++) adjacency.add(new ArrayList<>());

        // 1. 构建邻接表和入度表
        for (int[] cp : prerequisites) {
            indegrees[cp[0]]++;
            adjacency.get(cp[1]).add(cp[0]);
        }

        // 2. 将所有入度为 0 的节点入队
        for (int i = 0; i < numCourses; i++) {
            if (indegrees[i] == 0) queue.add(i);
        }

        // 3. BFS 拓扑排序
        int count = 0;
        while (!queue.isEmpty()) {
            int pre = queue.poll();
            count++;
            for (int cur : adjacency.get(pre)) {
                if (--indegrees[cur] == 0) {
                    queue.add(cur);
                }

            }
        }
        return count == numCourses;
    }
}
