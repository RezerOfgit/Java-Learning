/**
 * LeetCode 101. 对称二叉树
 * 给你一个二叉树的根节点 root，检查它是否轴对称。
 */
public class No101_SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true; // 空树视为对称
        }
        // 比较左子树和右子树是否镜像对称
        return isMirror(root.left, root.right);
    }
    
    private boolean isMirror(TreeNode left, TreeNode right) {
        // 两个节点都为空，对称
        if (left == null && right == null) {
            return true;
        }
        // 一个为空一个非空，或值不相等，则不对称
        if (left == null || right == null) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        }
        // 递归比较：左子树的左 vs 右子树的右，左子树的右 vs 右子树的左
        return isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }
}