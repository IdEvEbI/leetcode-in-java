package day01.leetcode.editor.cn;

/**
 * 剑指 Offer 10- I. 斐波那契数列
 * <p>
 * 分类：记忆化搜索, 动态规划, 数学
 * 难度：简单
 * 链接：<a href="https://leetcode.cn/problems/fei-bo-na-qi-shu-lie-lcof/">...</a>
 */
public class FeiBoNaQiShuLieLcof {
    public static void main(String[] args) {
        Solution solution = new FeiBoNaQiShuLieLcof().new Solution();

        System.out.println(solution.fib(0));
        System.out.println(solution.fib(1));
        System.out.println(solution.fib(2));
        System.out.println(solution.fib(3));
        System.out.println(solution.fib(4));
        System.out.println(solution.fib(5));
        System.out.println(solution.fib(6));
        System.out.println(solution.fib(45));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int fib(int n) {
            if (n < 2) {
                return n;
            }

            int fn2 = 0;
            int fn1 = 1;
            int fn = 1;

            for (int i = 2; i <= n; i++) {
                fn = (fn1 + fn2) % 1000000007;

                fn2 = fn1;
                fn1 = fn;
            }

            return fn;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}