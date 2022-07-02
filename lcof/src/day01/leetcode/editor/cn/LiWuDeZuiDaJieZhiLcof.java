package day01.leetcode.editor.cn;

/**
 * 剑指 Offer 47. 礼物的最大价值
 * <p>
 * 分类：数组, 矩阵, 动态规划
 * 难度：中等
 * 链接：<a href="https://leetcode.cn/problems/li-wu-de-zui-da-jie-zhi-lcof/">...</a>
 */
public class LiWuDeZuiDaJieZhiLcof {
    public static void main(String[] args) {
        Solution solution = new LiWuDeZuiDaJieZhiLcof().new Solution();

        int[][] grid = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };
        System.out.println(solution.maxValue(grid));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxValue(int[][] grid) {
            return dpWithNewArray(grid);
        }

        /**
         * 方法 2：使用前缀和数组，不修改 grid 数据
         */
        private int dpWithNewArray(int[][] grid) {
            int height = grid.length;
            int width = grid[0].length;
            // 每一行的前缀和数组
            int[] values = grid[0];

            for (int c = 1; c < width; c++) {
                values[c] += values[c - 1];
            }

            for (int r = 1; r < height; r++) {
                values[0] += grid[r][0];

                for (int c = 1; c < width; c++) {
                    values[c] = grid[r][c] + (Math.max(values[c], values[c - 1]));
                }
            }

            return values[width - 1];
        }

        /**
         * 方法 1：直接修改 grid 数据
         */
        private int dpWithModifyGrid(int[][] grid) {
            int height = grid.length;
            int width = grid[0].length;

            // 从左至右，从上至下累加矩阵，取最大值
            for (int c = 0; c < width; c++) {
                for (int r = 0; r < height; r++) {
                    if (r == 0 && c > 0) {
                        grid[r][c] = grid[r][c] + grid[r][c - 1];
                    }
                    if (c == 0 && r > 0) {
                        grid[r][c] = grid[r][c] + grid[r - 1][c];
                    }
                    if (r > 0 && c > 0) {
                        grid[r][c] = grid[r][c] + Math.max(grid[r - 1][c], grid[r][c - 1]);
                    }
                }
            }

            return grid[height - 1][width - 1];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}