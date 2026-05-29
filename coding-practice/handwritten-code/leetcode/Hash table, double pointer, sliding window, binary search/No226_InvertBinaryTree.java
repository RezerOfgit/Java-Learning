/**
 * LeetCode 226. 翻转二叉树
 * 给你一棵二叉树的根节点 root，翻转这棵二叉树，并返回其根节点。
 * 翻转二叉树是指将每个节点的左右子树进行交换。
 */
public class No226_InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        // 递归终止条件：空节点直接返回 null
        if (root == null) {
            return null;
        }

        // 递归翻转左右子树
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        // 交换当前节点的左右子树
        root.left = right;
        root.right = left;

        return root;
    }
}