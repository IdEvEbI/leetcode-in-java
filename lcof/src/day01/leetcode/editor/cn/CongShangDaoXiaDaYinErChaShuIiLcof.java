package day01.leetcode.editor.cn;

import tree.BinaryTree;
import tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 剑指 Offer 32 - II. 从上到下打印二叉树 II
 * <p>
 * 分类：树, 二叉树, 广度优先搜索
 * 难度：简单
 * 链接：<a href="https://leetcode.cn/problems/cong-shang-dao-xia-da-yin-er-cha-shu-ii-lcof/">...</a>
 */
public class CongShangDaoXiaDaYinErChaShuIiLcof {
    public static void main(String[] args) {
        Solution solution = new CongShangDaoXiaDaYinErChaShuIiLcof().new Solution();

        TreeNode root = new BinaryTree(new Integer[]{3, 9, 20, null, null, 15, 7}).root;

        List<List<Integer>> list = solution.levelOrder(root);
        System.out.println(list);
    }

    //leetcode submit region begin(Prohibit modification and deletion)

    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> list = new ArrayList<>();

            if (root == null) {
                return list;
            }

            Queue<TreeNode> queue = new LinkedList<>();

            // 头节点入队
            queue.offer(root);

            while (!queue.isEmpty()) {
                int size = queue.size();

                List<Integer> level = new ArrayList<>();

                for (int i = 0; i < size; i++) {
                    TreeNode n = queue.poll();

                    level.add(n.val);

                    if (n.left != null) {
                        queue.offer(n.left);
                    }
                    if (n.right != null) {
                        queue.offer(n.right);
                    }
                }

                list.add(level);
            }

            return list;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}