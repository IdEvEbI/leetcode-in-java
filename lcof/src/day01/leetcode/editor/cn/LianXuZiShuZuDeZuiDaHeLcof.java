package day01.leetcode.editor.cn;

/**
 * 剑指 Offer 42. 连续子数组的最大和
 * <p>
 * 分类：数组, 分治, 动态规划
 * 难度：简单
 * 链接：<a href="https://leetcode.cn/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof/">...</a>
 */
public class LianXuZiShuZuDeZuiDaHeLcof {
    public static void main(String[] args) {
        Solution solution = new LianXuZiShuZuDeZuiDaHeLcof().new Solution();

        System.out.println(solution.maxSubArray(new int[]{1}));
        System.out.println(solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxSubArray(int[] nums) {
            int max = nums[0];

            for (int i = 1; i < nums.length; i++) {
                // 如果前一个数字 > 0，累加
                if (nums[i - 1] > 0) {
                    // 计算累加和
                    nums[i] += nums[i - 1];
                }
                max = Math.max(max, nums[i]);
            }

            return max;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}