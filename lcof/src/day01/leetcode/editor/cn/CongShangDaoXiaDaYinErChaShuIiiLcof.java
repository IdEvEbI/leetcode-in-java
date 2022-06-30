package day01.leetcode.editor.cn;

import java.util.*;

/**
 * 剑指 Offer 32 - III. 从上到下打印二叉树 III
 * <p>
 * 分类：树, 二叉树, 广度优先搜索
 * 难度：中等
 * 链接：<a href="https://leetcode.cn/problems/cong-shang-dao-xia-da-yin-er-cha-shu-iii-lcof/">...</a>
 */
public class CongShangDaoXiaDaYinErChaShuIiiLcof {
    public static void main(String[] args) {
        CongShangDaoXiaDaYinErChaShuIiiLcof my = new CongShangDaoXiaDaYinErChaShuIiiLcof();
        Solution solution = my.new Solution();

        // 创建二叉树
        TreeNode root = my.new TreeNode(3);
        root.left = my.new TreeNode(9);
        root.right = my.new TreeNode(20);
        root.right.left = my.new TreeNode(15);
        root.right.right = my.new TreeNode(7);

        List<List<Integer>> list = solution.levelOrder(root);
        System.out.println(list);
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
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> list = new ArrayList<>();

            if (root == null) {
                return list;
            }

            Queue<TreeNode> queue = new LinkedList<>();

            // 头节点入队
            queue.offer(root);
            boolean toLeft = true;

            while (!queue.isEmpty()) {
                int size = queue.size();

                Deque<Integer> level = new ArrayDeque<>();

                for (int i = 0; i < size; i++) {
                    TreeNode n = queue.poll();

                    if (toLeft) {
                        level.offerLast(n.val);
                    } else {
                        level.offerFirst(n.val);
                    }

                    if (n.left != null) {
                        queue.offer(n.left);
                    }
                    if (n.right != null) {
                        queue.offer(n.right);
                    }
                }

                list.add(new ArrayList<>(level));
                toLeft = !toLeft;
            }

            return list;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}