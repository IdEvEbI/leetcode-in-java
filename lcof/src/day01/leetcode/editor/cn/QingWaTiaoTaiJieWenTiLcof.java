package day01.leetcode.editor.cn;

/**
 * 剑指 Offer 10- II. 青蛙跳台阶问题
 * <p>
 * 分类：记忆化搜索, 动态规划, 数学
 * 难度：简单
 * 链接：<a href="https://leetcode.cn/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/">...</a>
 */
public class QingWaTiaoTaiJieWenTiLcof {
    public static void main(String[] args) {
        Solution solution = new QingWaTiaoTaiJieWenTiLcof().new Solution();

        System.out.println(solution.numWays(0));
        System.out.println(solution.numWays(1));
        System.out.println(solution.numWays(2));
        System.out.println(solution.numWays(3));
        System.out.println(solution.numWays(4));
        System.out.println(solution.numWays(5));
        System.out.println(solution.numWays(6));
        System.out.println(solution.numWays(7));
        System.out.println(solution.numWays(8));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int numWays(int n) {
            if (n == 0) {
                return 1;
            }

            int[] dp = new int[n + 1];
            dp[0] = 1;
            dp[1] = 1;
            for (int i = 2; i <= n; i++) {
                dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007;
            }

            return dp[n];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}