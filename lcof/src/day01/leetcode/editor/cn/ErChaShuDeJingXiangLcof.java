package day01.leetcode.editor.cn;

import tree.BinaryTree;
import tree.TreeNode;

/**
 * 剑指 Offer 27. 二叉树的镜像
 * <p>
 * 分类：树, 深度优先搜索, 广度优先搜索
 * 难度：简单
 * 链接：<a href="https://leetcode.cn/problems/er-cha-shu-de-jing-xiang-lcof/">...</a>
 */
public class ErChaShuDeJingXiangLcof {
    public static void main(String[] args) {
        Solution solution = new ErChaShuDeJingXiangLcof().new Solution();

        TreeNode root = new BinaryTree(new Integer[]{4, 2, 7, 1, 3, 6, 9}).root;

        System.out.println(solution.mirrorTree(root));
    }

    //leetcode submit region begin(Prohibit modification and deletion)

    class Solution {
        public TreeNode mirrorTree(TreeNode root) {
            if (root == null) {
                return null;
            }

            TreeNode left = mirrorTree(root.left);
            TreeNode right = mirrorTree(root.right);

            root.left = right;
            root.right = left;

            return root;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}