package com.rezero.tree;

import com.rezero.common.TreeNode;

/**
 * @author Re-zero
 * @version 1.0
 * 给你一棵二叉树的根节点 root ，翻转这棵二叉树，并返回其根节点。
 * 也就是说，把每个节点的左孩子和右孩子互换。
 */
public class No226_InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        // 1. 递归终止条件：如果是空树，直接返回 null
        if (root == null) {
            return null;
        }

        // 2. 当老板下发任务：让左孩子和右孩子分别去翻转它们自己的队伍
        TreeNode invertedLeft = invertTree(root.left);
        TreeNode invertedRight = invertTree(root.right);

        // 3. 孩子们都翻转完了，现在老板自己动手：
        // 交换当前 root 的 left 和 right 指针
        // （提示：非常像之前学的交换两个数字，需要一个 temp 临时变量帮忙！）
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // 4. 返回翻转后的根节点
        return root;
    }
}
