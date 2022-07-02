package day01.leetcode.editor.cn;

import linkedList.ListNode;

/**
 * 剑指 Offer 25. 合并两个排序的链表
 * <p>
 * 分类：链表, 递归
 * 难度：简单
 * 链接：<a href="https://leetcode.cn/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof/">...</a>
 */
public class HeBingLiangGePaiXuDeLianBiaoLcof {
    public static void main(String[] args) {
        Solution solution = new HeBingLiangGePaiXuDeLianBiaoLcof().new Solution();

        ListNode h1 = new ListNode(new int[]{1, 2, 3, 4, 5});
        ListNode h2 = new ListNode(new int[]{1, 3, 4});

        System.out.println(solution.mergeTwoLists(h1, h2));
    }

    //leetcode submit region begin(Prohibit modification and deletion)

    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode dummy = new ListNode(-1);

            ListNode cur = dummy;

            while (l1 != null & l2 != null) {
                if (l1.val < l2.val) {
                    cur.next = l1;
                    l1 = l1.next;
                } else {
                    cur.next = l2;
                    l2 = l2.next;
                }

                cur = cur.next;
            }

            // 合并剩余链表
            cur.next = l1 != null ? l1 : l2;

            return dummy.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}