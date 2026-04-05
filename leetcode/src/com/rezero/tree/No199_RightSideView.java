package com.rezero.tree;

import com.rezero.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Re-zero
 * @version 1.0
 * 给定一个二叉树的 根节点 root，想象自己站在它的右侧，按照从顶部到底部的顺序，
 * 返回从右侧所能看到的节点值。
 */
public class No199_RightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            // 遍历当前层的所有节点
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                // 【核心逻辑：判断是不是这一层的最后一个元素】
                if (i == size - 1) {
                    // 是最后一个，加入结果集
                    res.add(node.val);
                }

                // 常规 BFS 加入左右子节点
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
        }
        return res;
    }
}
