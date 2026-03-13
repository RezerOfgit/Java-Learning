package com.rezero.tree;

import com.rezero.common.TreeNode;

/**
 * @author Re-zero
 * @version 1.0
 * 给定一个二叉树，找出其最大深度。
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * （说明：叶子节点是指没有子节点的节点。）
 */
public class No104_MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        // 1. 递归终止条件：如果是空树，高度是几？
        if (root == null) {
            return 0;
        }

        // 2. 老板下发任务：分别去问左孩子和右孩子的最大深度
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        // 3. 老板做总结：比较左右孩子的深度，取最大值，再加上自己的 1 层
        // 提示：Java 中求两个数的最大值可以使用 Math.max(a, b)
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
