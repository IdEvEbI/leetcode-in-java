package day01.leetcode.editor.cn;

import java.util.HashSet;
import java.util.Set;

/**
 * 剑指 Offer 03. 数组中重复的数字
 * <p>
 * 分类：数组, 哈希表, 排序
 * 难度：简单
 * 链接：<a href="https://leetcode.cn/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/">...</a>
 */
public class ShuZuZhongZhongFuDeShuZiLcof {
    public static void main(String[] args) {
        Solution solution = new ShuZuZhongZhongFuDeShuZiLcof().new Solution();

        System.out.println(solution.findRepeatNumber(new int[]{2, 3, 1, 0, 2, 5, 3}));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findRepeatNumber(int[] nums) {
            int i = 0;

            while (i < nums.length) {
                // 1. 如果 i 与 nums[i] 相等，继续
                if (i == nums[i]) {
                    i++;
                    continue;
                }

                // 2. 如果两个数相等，直接返回
                if (nums[nums[i]] == nums[i]) {
                    return nums[i];
                }

                // 3. 交换数字
                int tmp = nums[i];
                nums[i] = nums[tmp];
                nums[tmp] = tmp;
            }

            return -1;
        }

        /**
         * 方法 1：使用 HashSet 查找
         */
        private int findWithHasSet(int[] nums) {
            Set<Integer> set = new HashSet<>();

            for (int n : nums) {
                if (!set.add(n)) {
                    return n;
                }
            }
            return -1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}