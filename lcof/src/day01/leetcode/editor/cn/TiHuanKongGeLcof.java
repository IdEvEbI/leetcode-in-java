package day01.leetcode.editor.cn;

/**
 * 剑指 Offer 05. 替换空格
 * <p>
 * 分类：字符串
 * 难度：简单
 * 链接：<a href="https://leetcode.cn/problems/ti-huan-kong-ge-lcof/">...</a>
 */
public class TiHuanKongGeLcof {
    public static void main(String[] args) {
        Solution solution = new TiHuanKongGeLcof().new Solution();

        System.out.println(solution.replaceSpace("We are happy."));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String replaceSpace(String s) {
            StringBuilder sb = new StringBuilder();

            char[] chars = s.toCharArray();

            for (char c : chars) {
                if (c == ' ') {
                    sb.append("%20");
                } else {
                    sb.append(c);
                }
            }

            return sb.toString();
        }

        /**
         * 方法 1：使用 API 替换
         */
        private String replaceWithAPI(String s) {
            return s.replaceAll(" ", "%20");
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}