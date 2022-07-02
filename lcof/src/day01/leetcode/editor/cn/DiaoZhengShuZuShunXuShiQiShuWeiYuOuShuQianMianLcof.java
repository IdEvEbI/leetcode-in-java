package day01.leetcode.editor.cn;

import java.util.Arrays;

/**
 * 剑指 Offer 21. 调整数组顺序使奇数位于偶数前面
 * <p>
 * 分类：数组, 双指针, 排序
 * 难度：简单
 * 链接：<a href="https://leetcode.cn/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof/">...</a>
 */
public class DiaoZhengShuZuShunXuShiQiShuWeiYuOuShuQianMianLcof {
    public static void main(String[] args) {
        Solution solution = new DiaoZhengShuZuShunXuShiQiShuWeiYuOuShuQianMianLcof().new Solution();

        int[] ans = solution.exchange(new int[]{1, 3, 5});
        System.out.println(Arrays.toString(ans));

        ans = solution.exchange(new int[]{1, 2, 3, 5, 7});
        System.out.println(Arrays.toString(ans));

        ans = solution.exchange(new int[]{2, 4, 8});
        System.out.println(Arrays.toString(ans));

        ans = solution.exchange(new int[]{});
        System.out.println(Arrays.toString(ans));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] exchange(int[] nums) {
            int left = 0;
            int right = nums.length - 1;

            while (left < right) {
                while (left < right && nums[left] % 2 == 1) {
                    left++;
                }
                while (left < right && nums[right] % 2 == 0) {
                    right--;
                }

                // 左边奇数，右边偶数，交换
                int tmp = nums[left];
                nums[left] = nums[right];
                nums[right] = tmp;
            }

            return nums;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}