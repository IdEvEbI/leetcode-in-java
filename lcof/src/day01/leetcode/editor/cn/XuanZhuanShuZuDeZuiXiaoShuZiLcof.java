package day01.leetcode.editor.cn;

/**
 * 剑指 Offer 11. 旋转数组的最小数字
 * <p>
 * 分类：数组, 二分查找
 * 难度：简单
 * 链接：<a href="https://leetcode.cn/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/">...</a>
 */
public class XuanZhuanShuZuDeZuiXiaoShuZiLcof {
    public static void main(String[] args) {
        Solution solution = new XuanZhuanShuZuDeZuiXiaoShuZiLcof().new Solution();

        System.out.println(solution.minArray(new int[]{3, 4, 5, 1, 2}));
        System.out.println(solution.minArray(new int[]{2, 2, 2, 0, 1}));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int minArray(int[] numbers) {
            int left = 0;
            int right = numbers.length - 1;

            while (left < right) {
                int mid = left + (right - left) / 2;

                if (numbers[mid] < numbers[right]) {
                    right = mid;
                } else if (numbers[mid] > numbers[right]) {
                    left = mid + 1;
                } else {
                    right--;
                }
            }

            return numbers[left];
        }

        /**
         * 方法 2：遍历
         */
        private int findWithTraverse(int[] numbers) {
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] < numbers[i - 1]) {
                    return numbers[i];
                }
            }

            return numbers[0];
        }

        /**
         * 方法 1：暴力解法
         */
        private int findBruteForce(int[] numbers) {
            int min = Integer.MAX_VALUE;

            for (int n : numbers) {
                min = Math.min(min, n);
            }

            return min;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}