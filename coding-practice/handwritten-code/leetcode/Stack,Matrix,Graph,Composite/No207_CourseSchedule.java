/**
 * LeetCode 207. 课程表
 * 你这个学期必须选修 numCourses 门课程，记为 0 到 numCourses - 1。
 * 在选修某些课程之前需要一些先修课程。先修课程按数组 prerequisites 给出，
 * 其中 prerequisites[i] = [ai, bi] ，表示如果要学习课程 ai 则必须先学习课程 bi。
 * 请你判断是否可能完成所有课程的学习？如果可以，返回 true；否则，返回 false。
 */
public class No207_CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // 邻接表存储图结构
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        // 入度数组
        int[] indegrees = new int[numCourses];

        // 构建图和入度
        for (int[] pre : prerequisites) {
            int course = pre[0];
            int prereq = pre[1];
            graph.get(prereq).add(course); // prereq -> course
            indegrees[course]++;
        }

        // BFS 队列，初始化将所有入度为 0 的课程入队
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegrees[i] == 0) {
                queue.offer(i);
            }
        }

        int learned = 0; // 已学完的课程数
        while (!queue.isEmpty()) {
            int course = queue.poll();
            learned++;
            // 遍历当前课程的后续课程，将它们的入度减 1
            for (int next : graph.get(course)) {
                indegrees[next]--;
                if (indegrees[next] == 0) {
                    queue.offer(next);
                }
            }
        }

        // 如果学完的课程数等于总课程数，说明无环，可以完成
        return learned == numCourses;
    }
}