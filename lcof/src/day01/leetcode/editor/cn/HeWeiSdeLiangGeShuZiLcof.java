package day01.leetcode.editor.cn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 剑指 Offer 57. 和为s的两个数字
 * <p>
 * 分类：数组, 双指针, 二分查找
 * 难度：简单
 * 链接：<a href="https://leetcode.cn/problems/he-wei-sde-liang-ge-shu-zi-lcof/">...</a>
 */
public class HeWeiSdeLiangGeShuZiLcof {
    public static void main(String[] args) {
        Solution solution = new HeWeiSdeLiangGeShuZiLcof().new Solution();

        System.out.println(Arrays.toString(solution.twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(solution.twoSum(new int[]{10, 26, 30, 31, 47, 60}, 40)));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            return twoSumWithTwoPointer(nums, target);
        }

        /**
         * 方法 2：双指针
         */
        private int[] twoSumWithTwoPointer(int[] nums, int target) {
            int l = 0;
            int r = nums.length - 1;

            while (l < r) {
                int sum = nums[l] + nums[r];

                if (sum == target) {
                    return new int[]{nums[l], nums[r]};
                } else if (sum > target) {
                    r--;
                } else {
                    l++;
                }
            }

            return null;
        }

        /**
         * 方法 1：使用 HashMap 查找两数之和
         */
        private int[] twoSumWithHashMap(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(target - nums[i])) {
                    return new int[]{target - nums[i], nums[i]};
                }

                map.put(nums[i], i);
            }

            return null;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}