package day01.leetcode.editor.cn;

/**
 * 剑指 Offer 13. 机器人的运动范围
 * <p>
 * 分类：深度优先搜索, 广度优先搜索
 * 难度：中等
 * 链接：<a href="https://leetcode.cn/problems/ji-qi-ren-de-yun-dong-fan-wei-lcof/">...</a>
 */
public class JiQiRenDeYunDongFanWeiLcof {
    public static void main(String[] args) {
        Solution solution = new JiQiRenDeYunDongFanWeiLcof().new Solution();

        System.out.println(solution.movingCount(3, 4, 2));
        System.out.println(solution.movingCount(2, 3, 1));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int movingCount(int m, int n, int k) {
            if (k == 0) {
                return 1;
            }
            Boolean[][] visited = new Boolean[m][n];

            return dfs(visited, 0, 0, m, n, k);
        }

        private int dfs(Boolean[][] visited, int r, int c, int m, int n, int k) {
            if (r > m - 1 || c > n - 1 || get(r) + get(c) > k || visited[r][c] != null) {
                return 0;
            }

            visited[r][c] = true;

            return 1 + dfs(visited, r + 1, c, m, n, k) + dfs(visited, r, c + 1, m, n, k);
        }

        private int get(int i) {
            int res = 0;
            while (i != 0) {
                res += i % 10;
                i /= 10;
            }

            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}