package day01.leetcode.editor.cn;

/**
 * 剑指 Offer 46. 把数字翻译成字符串
 * <p>
 * 分类：字符串, 动态规划
 * 难度：中等
 * 链接：<a href="https://leetcode.cn/problems/ba-shu-zi-fan-yi-cheng-zi-fu-chuan-lcof/">...</a>
 */
public class BaShuZiFanYiChengZiFuChuanLcof {
    public static void main(String[] args) {
        Solution solution = new BaShuZiFanYiChengZiFuChuanLcof().new Solution();

        System.out.println(solution.translateNum(12258));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int translateNum(int num) {
            return translateWithDP(num);
        }

        private int translateWithDP(int num) {
            String s = String.valueOf(num);
            int[] dp = new int[s.length() + 1];

            dp[0] = 1;
            dp[1] = 1;

            for (int i = 2; i <= s.length(); i++) {
                if (s.charAt(i - 2) == '1' || (s.charAt(i - 2) == '2' && s.charAt(i - 1) <= '5')) {
                    dp[i] = dp[i - 1] + dp[i - 2];
                } else {
                    dp[i] = dp[i - 1];
                }
            }

            return dp[s.length()];
        }


        private int translateWithRecursion(int num) {
            if (num == 0) {
                return 1;
            }

            return f(num);
        }

        private int f(int num) {
            if (num < 10) {
                return 1;
            }
            if (num % 100 < 26 && num % 100 > 9) {
                return f(num / 10) + f(num / 100);
            } else {
                return f(num / 10);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}