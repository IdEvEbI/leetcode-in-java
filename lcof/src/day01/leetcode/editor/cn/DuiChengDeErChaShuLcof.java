package day01.leetcode.editor.cn;

import tree.BinaryTree;
import tree.TreeNode;

/**
 * 剑指 Offer 28. 对称的二叉树
 * <p>
 * 分类：树, 深度优先搜索, 广度优先搜索
 * 难度：简单
 * 链接：<a href="https://leetcode.cn/problems/dui-cheng-de-er-cha-shu-lcof/">...</a>
 */
public class DuiChengDeErChaShuLcof {
    public static void main(String[] args) {
        Solution solution = new DuiChengDeErChaShuLcof().new Solution();

        TreeNode root = new BinaryTree(new Integer[]{1, 2, 2, 3, 4, 4, 3}).root;

        System.out.println(solution.isSymmetric(root));
    }

    //leetcode submit region begin(Prohibit modification and deletion)

    class Solution {
        public boolean isSymmetric(TreeNode root) {
            return isSymmetric(root, root);
        }

        private boolean isSymmetric(TreeNode left, TreeNode right) {
            if (left == null && right == null) {
                return true;
            }
            if (left == null || right == null) {
                return false;
            }

            return left.val == right.val &&
                    isSymmetric(left.left, right.right) &&
                    isSymmetric(left.right, right.left);
        }


    }
//leetcode submit region end(Prohibit modification and deletion)

}