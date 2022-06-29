package day01.leetcode.editor.cn;

/**
 * 剑指 Offer 24. 反转链表
 * <p>
 * 分类：链表, 递归
 * 难度：简单
 * 链接：<a href="https://leetcode.cn/problems/fan-zhuan-lian-biao-lcof/">...</a>
 */
public class FanZhuanLianBiaoLcof {
    public static void main(String[] args) {
        FanZhuanLianBiaoLcof my = new FanZhuanLianBiaoLcof();

        Solution solution = my.new Solution();

        // 创建链表
        ListNode head = my.new ListNode(1);
        head.next = my.new ListNode(2);
        head.next.next = my.new ListNode(3);
        head.next.next.next = my.new ListNode(4);
        head.next.next.next.next = my.new ListNode(5);

        ListNode ans = solution.reverseList(head);
        System.out.println(ans.val);
    }

    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    //leetcode submit region begin(Prohibit modification and deletion)

    class Solution {
        public ListNode reverseList(ListNode head) {

            // 前置节点
            ListNode pre = null;
            // 当前节点
            ListNode cur = head;

            while (cur != null) {
                // 1. 记录下一节点
                ListNode next = cur.next;

                // 2. 当前节点的 next 指向 pre
                cur.next = pre;

                // 3. 调整指针变量
                // pre 指向 cur
                pre = cur;

                // cur 指向 next
                cur = next;
            }

            return pre;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}