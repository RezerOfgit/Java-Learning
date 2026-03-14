package com.rezero.tree;

import com.rezero.common.TreeNode;

/**
 * @author Re-zero
 * @version 1.0
 * 给你一个二叉树的根节点 root ，检查它是否轴对称。
 * （就像你在根节点中间放了一面镜子，左半边树和右半边树必须是完全镜像对称的。）
 */
public class No101_SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return check(root.left, root.right);
    }

    private boolean check(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        } else if (left == null || right == null) {
            return false;
        } else if (left.val != right.val) {
            return false;
        }
        return check(left.left, right.right) && check(left.right, right.left);
    }
}
