package day01.leetcode.editor.cn;

import linkedList.ListNode;

import java.util.Arrays;

/**
 * 剑指 Offer 06. 从尾到头打印链表
 * <p>
 * 分类：栈, 链表, 递归, 双指针
 * 难度：简单
 * 链接：<a href="https://leetcode.cn/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/">...</a>
 */
public class CongWeiDaoTouDaYinLianBiaoLcof {
    public static void main(String[] args) {
        Solution solution = new CongWeiDaoTouDaYinLianBiaoLcof().new Solution();

        // 创建链表
        ListNode head = new ListNode(new int[]{1, 2, 3, 4, 5});

        int[] ans = solution.reversePrint(head);
        System.out.println(Arrays.toString(ans));

        ans = solution.reversePrint(null);
        System.out.println(Arrays.toString(ans));
    }

    //leetcode submit region begin(Prohibit modification and deletion)

    class Solution {
        public int[] reversePrint(ListNode head) {
            ListNode n = head;

            // 1. 遍历链表计算链表长度
            int len = 0;
            while (n != null) {
                len++;
                n = n.next;
            }

            // 2. 根据长度新建数组
            int[] ans = new int[len];

            // 3. 重新遍历链表，反向填充数组
            n = head;
            for (int i = len - 1; i >= 0; i--) {
                ans[i] = n.val;
                n = n.next;
            }

            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}