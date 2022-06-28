package day01.leetcode.editor.cn;

import java.util.Stack;

/**
 * 剑指 Offer 30. 包含min函数的栈
 * <p>
 * 分类：栈, 设计
 * 难度：简单
 * 链接：<a href="https://leetcode.cn/problems/bao-han-minhan-shu-de-zhan-lcof/">...</a>
 */
public class BaoHanMinhanShuDeZhanLcof {
    public static void main(String[] args) {
        MinStack obj = new BaoHanMinhanShuDeZhanLcof().new MinStack();

        obj.push(-2);
        obj.push(0);
        obj.push(-3);
        System.out.println(obj.min());
        obj.pop();
        System.out.println(obj.top());
        System.out.println(obj.min());
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class MinStack {

        // 数据栈
        private final Stack<Integer> dataStack;
        // 最小栈
        private final Stack<Integer> minStack;

        public MinStack() {
            dataStack = new Stack<>();
            minStack = new Stack<>();
            minStack.push(Integer.MAX_VALUE);
        }

        public void push(int x) {
            // 数据栈压入 x
            dataStack.push(x);
            // 最小栈压入栈顶和 x 的最小值
            minStack.push(Math.min(minStack.peek(), x));
        }

        public void pop() {
            // 数据栈和最小栈直接出栈
            dataStack.pop();
            minStack.pop();
        }

        public int top() {
            return dataStack.peek();
        }

        public int min() {
            return minStack.peek();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}