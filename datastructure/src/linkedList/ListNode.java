package linkedList;

/**
 * 链表节点
 */
public class ListNode {
    /**
     * 值
     */
    public int val;
    /**
     * 下一节点
     */
    public ListNode next;

    /**
     * 构造器
     *
     * @param val 值
     */
    public ListNode(int val) {
        this.val = val;
    }

    /**
     * 构造器
     *
     * @param val  值
     * @param next 下一节点
     */
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode(int[] values) {
        if (values.length == 0) {
            return;
        }
        val = values[0];

        ListNode cur = this;
        for (int i = 1; i < values.length; i++) {
            cur.next = new ListNode(values[i]);
            cur = cur.next;
        }
    }

    @Override
    public String toString() {
        ListNode cur = this;
        StringBuilder sb = new StringBuilder();

        while (cur != null) {
            sb.append("(").append(cur.val).append(")->");

            cur = cur.next;
        }
        sb.append("(null)");

        return sb.toString();
    }
}
