package day01.leetcode.editor.cn;

/**
 * 剑指 Offer 53 - II. 0～n-1中缺失的数字
 * <p>
 * 分类：数组, 哈希表, 位运算, 数学
 * 难度：简单
 * 链接：<a href="https://leetcode.cn/problems/que-shi-de-shu-zi-lcof/">...</a>
 */
public class QueShiDeShuZiLcof {
    public static void main(String[] args) {
        Solution solution = new QueShiDeShuZiLcof().new Solution();

        System.out.println(solution.missingNumber(new int[]{0}));
        System.out.println(solution.missingNumber(new int[]{1}));
        System.out.println(solution.missingNumber(new int[]{0, 1}));
        System.out.println(solution.missingNumber(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 9}));
        System.out.println(solution.missingNumber(new int[]{0, 1, 3, 4, 5, 6, 7, 8}));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int missingNumber(int[] nums) {
            int n = nums.length + 1;

            for (int i = 0; i < n - 1; i++) {
                if (nums[i] != i) {
                    return i;
                }
            }

            return n - 1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}