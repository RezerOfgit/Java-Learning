/**
 * LeetCode 236. 二叉树的最近公共祖先
 * 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
 * 最近公共祖先的定义为：“对于有根树 T 的两个节点 p、q，
 * 最近公共祖先表示为一个节点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大
 * （一个节点也可以是它自己的祖先）。”
 */
public class No236_LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // 递归终止条件：到达 null 或找到 p 或 q 之一
        if (root == null || root == p || root == q) {
            return root;
        }

        // 在左子树中查找 p 和 q
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        // 在右子树中查找 p 和 q
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // 如果左子树返回 null，说明 p 和 q 都在右子树中，返回右子树的查找结果
        if (left == null) {
            return right;
        }
        // 如果右子树返回 null，说明 p 和 q 都在左子树中，返回左子树的查找结果
        if (right == null) {
            return left;
        }
        // 左右子树各返回一个非 null，说明 p 和 q 分布在当前节点两侧，当前节点即 LCA
        return root;
    }
}