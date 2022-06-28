package day01.leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 剑指 Offer 09. 用两个栈实现队列
 * <p>
 * 分类：栈, 队列, 设计
 * 难度：简单
 * 链接：https://leetcode.cn/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/
 */
public class YongLiangGeZhanShiXianDuiLieLcof {
    public static void main(String[] args) {
        CQueue queue = new YongLiangGeZhanShiXianDuiLieLcof().new CQueue();

        System.out.println(queue.deleteHead());
        queue.appendTail(1);
        queue.appendTail(2);
        queue.appendTail(3);
        System.out.println(queue.deleteHead());
        System.out.println(queue.deleteHead());
        System.out.println(queue.deleteHead());
        System.out.println(queue.deleteHead());
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class CQueue {

        private final Deque<Integer> inStack;
        private final Deque<Integer> outStack;

        public CQueue() {
            inStack = new ArrayDeque<>();
            outStack = new ArrayDeque<>();
        }

        public void appendTail(int value) {
            inStack.push(value);
        }

        public int deleteHead() {
            // 如果 inStack 和 outStack 为空，返回 -1
            if (inStack.isEmpty() && outStack.isEmpty()) {
                return -1;
            }

            // 如果 outStack 为空，先把 inStack 数据出栈并压入 outStack
            if (outStack.isEmpty()) {
                while (!inStack.isEmpty()) {
                    outStack.push(inStack.pop());
                }
            }

            // outStack 有数据直接出栈
            return outStack.pop();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)
}