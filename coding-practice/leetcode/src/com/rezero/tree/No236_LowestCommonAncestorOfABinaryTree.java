package com.rezero.tree;

import com.rezero.common.TreeNode;

/**
 * @author Re-zero
 * @version 1.0
 * 给定一个二叉树，找到该树中两个指定节点 p 和 q 的最近公共祖先 (Lowest Common Ancestor, LCA)。
 */
public class No236_LowestCommonAncestorOfABinaryTree {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // 1. 递归的终止条件：遇到空树，或者恰好找到了 p 或 q，直接把当前节点汇报上去
        if (root == null || root == p || root == q) {
            return root;
        }

        // 2. 老板下发任务：去左子树和右子树里给我找！
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // 3. 老板汇总情报时间：

        // ① 如果 left 和 right 都不是 null，说明 p 和 q 分别在我的左右两边，我是谁？我该返回谁？
        if (left != null && right != null) {
            return root;
        }

        // ② 如果 left 是 null，说明左边什么也没找到，那就把 right 的结果原封不动返回上去
        if (left == null) {
            return right;
        }

        // ③ 如果 right 是 null，说明右边没找到，那就把 left 的结果返回上去
        return left;
    }
}
