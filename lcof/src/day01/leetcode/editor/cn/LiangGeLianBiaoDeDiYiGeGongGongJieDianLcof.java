package day01.leetcode.editor.cn;

import linkedList.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * 剑指 Offer 52. 两个链表的第一个公共节点
 * <p>
 * 分类：链表, 哈希表, 双指针
 * 难度：简单
 * 链接：<a href="https://leetcode.cn/problems/liang-ge-lian-biao-de-di-yi-ge-gong-gong-jie-dian-lcof/">...</a>
 */
public class LiangGeLianBiaoDeDiYiGeGongGongJieDianLcof {
    public static void main(String[] args) {
        Solution solution = new LiangGeLianBiaoDeDiYiGeGongGongJieDianLcof().new Solution();

        ListNode n1 = new ListNode(new int[]{1, 2, 3});
        ListNode n2 = new ListNode(9);
        ListNode n3 = new ListNode(new int[]{99, 98, 97, 96});

        n1.next.next.next = n3;
        n2.next = n3;

        System.out.println(solution.getIntersectionNode(n1, n2));

        n1 = new ListNode(new int[]{1, 2, 3});
        n2 = new ListNode(new int[]{5, 6, 7});
        System.out.println(solution.getIntersectionNode(n1, n2));
    }

    //leetcode submit region begin(Prohibit modification and deletion)

    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            return getIntersectionWithTwoPoint(headA, headB);
        }

        /**
         * 方法 2：使用双指针查找
         * <p>
         * list1 = a + c
         * list2 = b + c
         * <p>
         * p1 = a + c + b （先扫描 A，再扫描 B，相遇就是相较点）
         * p2 = b + c + a （先扫描 B，早扫描 A，相遇就是相较点）
         */
        private ListNode getIntersectionWithTwoPoint(ListNode headA, ListNode headB) {
            ListNode p1 = headA;
            ListNode p2 = headB;

            while (p1 != p2) {
                p1 = (p1 == null) ? headB : p1.next;
                p2 = (p2 == null) ? headA : p2.next;
            }

            return p1;
        }

        /**
         * 方法 1：使用 HashSet 查找
         */
        private ListNode getIntersectionWithHashSet(ListNode headA, ListNode headB) {
            Set<ListNode> set = new HashSet<>();

            // 1. 扫描 headA
            ListNode n = headA;
            while (n != null) {
                set.add(n);
                n = n.next;
            }

            // 2. 扫描 headB
            n = headB;
            while (n != null) {
                if (set.contains(n)) {
                    return n;
                }
                n = n.next;
            }

            return null;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}