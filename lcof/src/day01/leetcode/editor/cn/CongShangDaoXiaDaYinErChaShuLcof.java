package day01.leetcode.editor.cn;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 剑指 Offer 32 - I. 从上到下打印二叉树
 * <p>
 * 分类：树, 二叉树, 广度优先搜索
 * 难度：中等
 * 链接：<a href="https://leetcode.cn/problems/cong-shang-dao-xia-da-yin-er-cha-shu-lcof/">...</a>
 */
public class CongShangDaoXiaDaYinErChaShuLcof {
    public static void main(String[] args) {
        CongShangDaoXiaDaYinErChaShuLcof my = new CongShangDaoXiaDaYinErChaShuLcof();
        Solution solution = my.new Solution();

        // 创建二叉树
        TreeNode root = my.new TreeNode(3);
        root.left = my.new TreeNode(9);
        root.right = my.new TreeNode(20);
        root.right.left = my.new TreeNode(15);
        root.right.right = my.new TreeNode(7);

        int[] ans = solution.levelOrder(root);
        System.out.println(Arrays.toString(ans));
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    //leetcode submit region begin(Prohibit modification and deletion)

    class Solution {
        public int[] levelOrder(TreeNode root) {
            if (root == null) {
                return new int[0];
            }

            Queue<TreeNode> queue = new LinkedList<>();
            int[] ans = new int[1000];
            int i = 0;

            // 头节点入队
            queue.offer(root);

            while (!queue.isEmpty()) {
                TreeNode n = queue.poll();

                ans[i++] = n.val;

                if (n.left != null) {
                    queue.offer(n.left);
                }
                if (n.right != null) {
                    queue.offer(n.right);
                }
            }

            // 创建返回数组
            return Arrays.copyOf(ans, i);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}