/**
 * LeetCode 98. 验证二叉搜索树
 * 给你一个二叉树的根节点 root，判断其是否是一个有效的二叉搜索树。
 * 有效二叉搜索树定义如下：
 * - 节点的左子树只包含小于当前节点的数。
 * - 节点的右子树只包含大于当前节点的数。
 * - 所有左子树和右子树自身必须也是二叉搜索树。
 */
public class No98_ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        // 用 long 避免节点值为 Integer.MIN_VALUE 或 MAX_VALUE 时的边界问题
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValidBST(TreeNode node, long lower, long upper) {
        if (node == null) {
            return true; // 空树是 BST
        }

        // 当前节点值必须在 (lower, upper) 开区间内
        if (node.val <= lower || node.val >= upper) {
            return false;
        }

        // 递归检查左右子树，更新上下界
        return isValidBST(node.left, lower, node.val) &&
               isValidBST(node.right, node.val, upper);
    }
}