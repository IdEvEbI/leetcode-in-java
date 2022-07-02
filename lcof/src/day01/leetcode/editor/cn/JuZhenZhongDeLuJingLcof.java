package day01.leetcode.editor.cn;

/**
 * 剑指 Offer 12. 矩阵中的路径
 * <p>
 * 分类：数组, 矩阵, 回溯
 * 难度：中等
 * 链接：<a href="https://leetcode.cn/problems/ju-zhen-zhong-de-lu-jing-lcof/">...</a>
 */
public class JuZhenZhongDeLuJingLcof {
    public static void main(String[] args) {
        Solution solution = new JuZhenZhongDeLuJingLcof().new Solution();

        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        System.out.println(solution.exist(board, "ABCCEDAS"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean exist(char[][] board, String word) {
            char[] words = word.toCharArray();

            int height = board.length;
            int width = board[0].length;

            for (int r = 0; r < height; r++) {
                for (int c = 0; c < width; c++) {
                    if (dfs(board, words, r, c, 0)) {
                        return true;
                    }
                }
            }

            return false;
        }

        private boolean dfs(char[][] board, char[] word, int r, int c, int idx) {
            int height = board.length;
            int width = board[0].length;

            if (r >= height || r < 0 || c >= width || c < 0 || board[r][c] != word[idx]) {
                return false;
            }

            if (idx == word.length - 1) {
                return true;
            }

            board[r][c] = '\0';
            boolean res = dfs(board, word, r + 1, c, idx + 1) ||
                    dfs(board, word, r - 1, c, idx + 1) ||
                    dfs(board, word, r, c + 1, idx + 1) ||
                    dfs(board, word, r, c - 1, idx + 1);

            board[r][c] = word[idx];

            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}