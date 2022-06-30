package day01.leetcode.editor.cn;

/**
 * 剑指 Offer 04. 二维数组中的查找
 * <p>
 * 分类：数组, 矩阵, 二分查找, 分治
 * 难度：中等
 * 链接：<a href="https://leetcode.cn/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/">...</a>
 */
public class ErWeiShuZuZhongDeChaZhaoLcof {
    public static void main(String[] args) {
        Solution solution = new ErWeiShuZuZhongDeChaZhaoLcof().new Solution();

        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };

        System.out.println(solution.findNumberIn2DArray(matrix, 5));
        System.out.println(solution.findNumberIn2DArray(matrix, 21));
        System.out.println(solution.findNumberIn2DArray(new int[][]{}, 0));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean findNumberIn2DArray(int[][] matrix, int target) {
            int height = matrix.length;
            if (height == 0) {
                return false;
            }

            int width = matrix[0].length;
            if (width == 0) {
                return false;
            }

            // 1. 二分查找确定行
            int low = 0;
            int high = height - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (matrix[mid][0] == target) {
                    return true;
                } else if (matrix[mid][0] < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            // 2. 在 0 ~ low 行中遍历查找 target
            for (int r = 0; r < low; r++) {
                int left = 0;
                int right = width - 1;

                while (left <= right) {
                    int mid = left + (right - left) / 2;

                    if (matrix[r][mid] == target) {
                        return true;
                    } else if (matrix[r][mid] < target) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
            }

            return false;
        }

        private boolean findBruteForce(int[][] matrix, int target) {
            int height = matrix.length;
            if (height == 0) {
                return false;
            }

            int width = matrix[0].length;

            for (int c = 0; c < width; c++) {
                for (int[] row : matrix) {
                    if (row[c] == target) {
                        return true;
                    }
                }
            }

            return false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}