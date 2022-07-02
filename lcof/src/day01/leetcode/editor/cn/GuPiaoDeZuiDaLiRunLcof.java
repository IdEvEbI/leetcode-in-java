package day01.leetcode.editor.cn;

/**
 * 剑指 Offer 63. 股票的最大利润
 * <p>
 * 分类：数组, 动态规划
 * 难度：中等
 * 链接：<a href="https://leetcode.cn/problems/gu-piao-de-zui-da-li-run-lcof/">...</a>
 */
public class GuPiaoDeZuiDaLiRunLcof {
    public static void main(String[] args) {
        Solution solution = new GuPiaoDeZuiDaLiRunLcof().new Solution();

        System.out.println(solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(solution.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxProfit(int[] prices) {
            int cost = Integer.MAX_VALUE;
            int profit = 0;

            for (int price : prices) {
                cost = Math.min(cost, price);
                profit = Math.max(profit, price - cost);
            }

            return profit;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}