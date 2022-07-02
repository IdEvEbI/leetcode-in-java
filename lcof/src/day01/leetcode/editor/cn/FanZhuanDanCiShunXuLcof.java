package day01.leetcode.editor.cn;

/**
 * 剑指 Offer 58 - I. 翻转单词顺序
 * <p>
 * 分类：字符串, 双指针
 * 难度：简单
 * 链接：<a href="https://leetcode.cn/problems/fan-zhuan-dan-ci-shun-xu-lcof/">...</a>
 */
public class FanZhuanDanCiShunXuLcof {
    public static void main(String[] args) {
        Solution solution = new FanZhuanDanCiShunXuLcof().new Solution();

        System.out.println(solution.reverseWords("the sky is blue"));
        System.out.println(solution.reverseWords("  hello world!  "));
        System.out.println(solution.reverseWords("a good   example"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String reverseWords(String s) {
            String[] strs = s.split(" ");

            StringBuilder sb = new StringBuilder();

            for (int i = strs.length - 1; i >= 0; i--) {
                if (strs[i].length() == 0) {
                    continue;
                }

                sb.append(strs[i]).append(" ");
            }

            if (sb.length() == 0) {
                return "";
            }

            sb.deleteCharAt(sb.length() - 1);

            return sb.toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}