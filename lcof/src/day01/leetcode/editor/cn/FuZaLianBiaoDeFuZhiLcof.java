package day01.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * 剑指 Offer 35. 复杂链表的复制
 * <p>
 * 分类：链表, 哈希表
 * 难度：中等
 * 链接：<a href="https://leetcode.cn/problems/fu-za-lian-biao-de-fu-zhi-lcof/">...</a>
 */
public class FuZaLianBiaoDeFuZhiLcof {
    public static void main(String[] args) {
        FuZaLianBiaoDeFuZhiLcof my = new FuZaLianBiaoDeFuZhiLcof();

        Solution solution = my.new Solution();

        // 创建链表
        Node head = my.new Node(1);
        head.next = my.new Node(2);
        head.next.next = my.new Node(3);

        head.next.random = head;
        head.random = null;
        head.next.next.random = head.next.next;

        Node ans = solution.copyRandomList(head);
        System.out.println(ans.val);
    }

    private class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public Node copyRandomList(Node head) {
            if (head == null) {
                return head;
            }

            // 1. 遍历链表完成链表的复制，利用 HashMap 记录新旧节点关系
            Node cur = head;

            Node newHead = new Node(cur.val);
            Node newCur = newHead;

            Map<Node, Node> map = new HashMap<>();
            map.put(cur, newCur);

            while (cur.next != null) {
                newCur.next = new Node(cur.next.val);

                cur = cur.next;
                newCur = newCur.next;

                map.put(cur, newCur);
            }

            // 2. 再次遍历链表，利用 HashMap 填充 random 指针
            cur = head;
            newCur = newHead;

            while (cur != null) {
                newCur.random = map.get(cur.random);

                cur = cur.next;
                newCur = newCur.next;
            }

            return newHead;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}