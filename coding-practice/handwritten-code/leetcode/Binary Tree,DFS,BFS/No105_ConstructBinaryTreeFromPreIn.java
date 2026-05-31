/**
 * LeetCode 105. 从前序与中序遍历序列构造二叉树
 * 给定两个整数数组 preorder 和 inorder，
 * 其中 preorder 是二叉树的先序遍历，inorder 是同一棵树的中序遍历，
 * 请构造二叉树并返回其根节点。
 */
public class No105_ConstructBinaryTreeFromPreIn {
    // 用于快速定位中序数组中根节点的位置
    private Map<Integer, Integer> inMap = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // 构建中序值到索引的映射
        for (int i = 0; i < inorder.length; i++) {
            inMap.put(inorder[i], i);
        }
        return build(preorder, 0, preorder.length - 1,
                     inorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] preorder, int preStart, int preEnd,
                           int[] inorder, int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd) {
            return null; // 空区间
        }

        // 前序遍历的第一个节点就是当前子树的根
        int rootVal = preorder[preStart];
        TreeNode root = new TreeNode(rootVal);

        // 在中序遍历中找到根的位置，划分左右子树
        int inRootIndex = inMap.get(rootVal);
        int leftSize = inRootIndex - inStart; // 左子树节点个数

        // 递归构造左子树
        root.left = build(preorder, preStart + 1, preStart + leftSize,
                         inorder, inStart, inRootIndex - 1);
        // 递归构造右子树
        root.right = build(preorder, preStart + leftSize + 1, preEnd,
                          inorder, inRootIndex + 1, inEnd);

        return root;
    }
}