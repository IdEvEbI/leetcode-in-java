package day01.leetcode.editor.cn;

import linkedList.ListNode;

/**
 * 剑指 Offer 22. 链表中倒数第k个节点
 * <p>
 * 分类：链表, 双指针
 * 难度：简单
 * 链接：<a href="https://leetcode.cn/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/">...</a>
 */
public class LianBiaoZhongDaoShuDiKgeJieDianLcof {
    public static void main(String[] args) {
        Solution solution = new LianBiaoZhongDaoShuDiKgeJieDianLcof().new Solution();

        ListNode head = new ListNode(new int[]{1, 2, 3, 4, 5});
        System.out.println(solution.getKthFromEnd(head, 2));
    }

    //leetcode submit region begin(Prohibit modification and deletion)

    class Solution {
        public ListNode getKthFromEnd(ListNode head, int k) {
            // 快慢指针
            ListNode fast = head;
            ListNode slow = head;

            // 先移动快指针 k 步
            for (int i = 0; i < k; i++) {
                fast = fast.next;
            }

            // 同时移动两个指针，直到快指针走到链表尾部
            while (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }

            return slow;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}