/**
 * LeetCode 102. 二叉树的层序遍历
 * 给你二叉树的根节点 root，返回其节点值的层序遍历（即逐层地，从左到右访问所有节点）。
 */
public class No102_BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result; // 空树返回空列表
        }

        // BFS 核心队列
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size(); // 当前层的节点数
            List<Integer> currentLevel = new ArrayList<>();

            // 逐节点处理当前层
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                currentLevel.add(node.val);

                // 将下一层节点入队
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            result.add(currentLevel);
        }

        return result;
    }
}