/**
 * LeetCode 104. 二叉树的最大深度
 * 给定一个二叉树，找出其最大深度。
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 */
public class No104_MaximumDepthOfBinaryTree {
    // 方法一：递归（DFS）
    public int maxDepth(TreeNode root) {
        // 空节点深度为 0
        if (root == null) {
            return 0;
        }
        // 最大深度 = max(左子树深度, 右子树深度) + 1
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
    
    // 方法二：BFS（层序遍历，展示用）
    public int maxDepthBFS(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 0;
        
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            depth++;
        }
        
        return depth;
    }
}