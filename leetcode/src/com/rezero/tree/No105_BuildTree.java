package com.rezero.tree;

import com.rezero.common.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Re-zero
 * @version 1.0
 * 给定两个整数数组 preorder 和 inorder ，其中 preorder 是二叉树的先序遍历，
 * inorder 是同一棵树的中序遍历，请构造二叉树并返回其根节点。
 */
public class No105_BuildTree {
    private Map<Integer, Integer> indexMap;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        // 1. 预存中序索引，提升查找速度
        indexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            indexMap.put(inorder[i], i);
        }
        return helper(preorder, 0, n - 1, inorder, 0, n - 1);
    }

    private TreeNode helper(int[] preorder, int preL, int preR, int[] inorder, int inL, int inR) {
        // 1. 终止条件
        if (preL > preR) return null;

        // 2. 根节点就是前序遍历的第一个
        int rootVal = preorder[preL];
        TreeNode root = new TreeNode(rootVal);

        // 3. 在中序中找到根节点位置
        int iIdx = indexMap.get(rootVal);
        // 4. 计算左子树节点个数
        int leftSize = iIdx - inL;

        // 提示：左子树的前序范围是 preL+1 到 preL+leftSize
        root.left = helper(preorder, preL + 1, preL + leftSize, inorder, inL, iIdx - 1);
        root.right = helper(preorder, preL + leftSize + 1, preR, inorder, iIdx + 1, inR);

        return root;
    }
}
