package day01.leetcode.editor.cn;

import linkedList.ListNode;

/**
 * 剑指 Offer 18. 删除链表的节点
 * <p>
 * 分类：链表
 * 难度：简单
 * 链接：<a href="https://leetcode.cn/problems/shan-chu-lian-biao-de-jie-dian-lcof/">...</a>
 */
public class ShanChuLianBiaoDeJieDianLcof {
    public static void main(String[] args) {
        Solution solution = new ShanChuLianBiaoDeJieDianLcof().new Solution();

        ListNode head = new ListNode(new int[]{1, 2, 3, 4, 5});

        System.out.println(solution.deleteNode(head, 3));
    }

    //leetcode submit region begin(Prohibit modification and deletion)

    class Solution {
        public ListNode deleteNode(ListNode head, int val) {
            ListNode dummy = new ListNode(-1);
            dummy.next = head;

            ListNode cur = dummy;
            while (cur.next != null) {
                if (cur.next.val == val) {
                    cur.next = cur.next.next;
                    break;
                }
                cur = cur.next;
            }

            return dummy.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}