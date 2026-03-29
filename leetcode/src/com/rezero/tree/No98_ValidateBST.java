package com.rezero.tree;

import com.rezero.common.TreeNode;

/**
 * @author Re-zero
 * @version 1.0
 * 给你一个二叉树的根节点 root ，判断其是否是一个有效的二叉搜索树。
 * 有效 二叉搜索树定义如下：
 * 节点的左子树只包含 严格小于 当前节点的数。
 * 节点的右子树只包含 严格大于 当前节点的数。
 * 所有左子树和右子树自身必须也是二叉搜索树。
 */
public class No98_ValidateBST {
    public boolean isValidBST(TreeNode root) {
        // 为了防止节点值本身就是 Integer.MAX_VALUE，我们初始上下界用 Long
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    // 辅助验证函数，携带上下界
    private boolean validate(TreeNode node, long min, long max) {
        // 空树也是合法的 BST
        if (node == null) {
            return true;
        }

        // 1. 如果当前节点的值打破了上下界限制，立刻返回 false
        if (node.val <= min || node.val >= max) return false;

        // 2. 递归验证左子树：左子树的所有节点必须严格小于当前节点 node.val
        // 3. 递归验证右子树：右子树的所有节点必须严格大于当前节点 node.val
        // 只有左右都合法，才是真正的合法
        return validate(node.left, min, node.val) && validate(node.right, node.val, max);
    }
}
