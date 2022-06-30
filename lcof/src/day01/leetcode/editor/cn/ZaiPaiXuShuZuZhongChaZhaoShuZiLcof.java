package day01.leetcode.editor.cn;

/**
 * 剑指 Offer 53 - I. 在排序数组中查找数字 I
 * <p>
 * 分类：数组, 二分查找
 * 难度：简单
 * 链接：<a href="https://leetcode.cn/problems/zai-pai-xu-shu-zu-zhong-cha-zhao-shu-zi-lcof/">...</a>
 */
public class ZaiPaiXuShuZuZhongChaZhaoShuZiLcof {
    public static void main(String[] args) {
        Solution solution = new ZaiPaiXuShuZuZhongChaZhaoShuZiLcof().new Solution();

        System.out.println(solution.search(new int[]{}, 8));
        System.out.println(solution.search(new int[]{1, 3}, 1));
        System.out.println(solution.search(new int[]{2, 2}, 2));
        System.out.println(solution.search(new int[]{5, 7, 7, 8, 8, 10}, 8));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int search(int[] nums, int target) {

            int left = 0;
            int right = nums.length - 1;
            int mid = -1;

            // 1. 二分查找找到 target 出现的位置
            while (left <= right) {
                mid = left + (right - left) / 2;

                if (nums[mid] == target) {
                    break;
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            int count = 0;
            // 2. 向前统计
            for (int i = mid; i >= left && nums[i] == target; i--) {
                count++;
            }
            // 3. 向后统计
            for (int i = mid + 1; i <= right && nums[i] == target; i++) {
                count++;
            }

            return count;
        }

        /**
         * 方法 1：暴力解法
         */
        private int searchWithBruteForce(int[] nums, int target) {
            int count = 0;

            for (int n : nums) {
                if (n == target) {
                    count++;
                }
                if (n > target) {
                    break;
                }
            }

            return count;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}