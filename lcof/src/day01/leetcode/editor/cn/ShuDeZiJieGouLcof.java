package day01.leetcode.editor.cn;

import tree.BinaryTree;
import tree.TreeNode;

/**
 * 树的子结构
 * <p>
 * 分类：树, 二叉树, 深度优先搜索
 * 难度：中等
 * 链接：<a href="https://leetcode.cn/problems/shu-de-zi-jie-gou-lcof/">...</a>
 */
public class ShuDeZiJieGouLcof {
    public static void main(String[] args) {
        Solution solution = new ShuDeZiJieGouLcof().new Solution();

        TreeNode A = new BinaryTree(new Integer[]{3, 4, 5, 1, 2}).root;
        TreeNode B = new BinaryTree(new Integer[]{3, 4, 5}).root;

        System.out.println(solution.isSubStructure(A, B));
    }

    //leetcode submit region begin(Prohibit modification and deletion)

    class Solution {
        public boolean isSubStructure(TreeNode A, TreeNode B) {
            return (A != null && B != null) &&
                    (recur(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B));
        }

        private boolean recur(TreeNode A, TreeNode B) {
            if (B == null) {
                return true;
            }
            if (A == null || A.val != B.val) {
                return false;
            }

            return recur(A.left, B.left) && recur(A.right, B.right);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}