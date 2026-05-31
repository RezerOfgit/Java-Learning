/**
 * LeetCode 199. 二叉树的右视图
 * 给定一个二叉树的根节点 root，想象自己站在它的右侧，
 * 按照从顶部到底部的顺序，返回从右侧所能看到的节点值。
 */
public class No199_BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();

                // 每一层的最后一个节点就是右视图看到的节点
                if (i == levelSize - 1) {
                    result.add(node.val);
                }

                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }

        return result;
    }
}