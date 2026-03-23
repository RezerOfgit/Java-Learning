package com.rezero.tree;

import com.rezero.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Re-zero
 * @version 1.0
 * 给你二叉树的根节点 root ，返回其节点值的 层序遍历 。 （即逐层地，从左到右访问所有节点）。
 */
public class No102_BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        // 1. 如果树是空的，直接返回空集合
        if (root == null) {
            return res;
        }

        // 2. 准备一个排队通道 Queue
        // 注意：Java 中 Queue 是接口，通常用 LinkedList 来实例化它
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        // 3. 只要队伍里还有人，奶茶店就不关门！
        while (!queue.isEmpty()) {
            // 一次性弄清楚：当前这一层，队伍里到底有几个人？
            // 这个数字 size 极其关键！它决定了我们这波要放几个人出队结账！
            int levelSize = queue.size();

            // 准备一个小本本，记录这一层的人的名字
            List<Integer> levelList = new ArrayList<>();

            // 4. 让当前这一层的 levelSize 个人依次结账出队
            for (int i = 0; i < levelSize; i++) {
                // 出队拿出来
                TreeNode currentNode = queue.poll();
                // 登记名字
                levelList.add(currentNode.val);

                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }

            }

            // 5. 这波人全结完账了，把这一层的小本本收进大账本里
            res.add(levelList);
        }

        return res;
    }
}
