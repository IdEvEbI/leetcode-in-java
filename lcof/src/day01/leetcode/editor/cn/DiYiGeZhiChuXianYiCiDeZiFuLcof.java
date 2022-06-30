package day01.leetcode.editor.cn;

import java.util.Objects;

/**
 * 剑指 Offer 50. 第一个只出现一次的字符
 * <p>
 * 分类：字符串, 队列, 哈希表, 计数
 * 难度：简单
 * 链接：<a href="https://leetcode.cn/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof/">...</a>
 */
public class DiYiGeZhiChuXianYiCiDeZiFuLcof {
    public static void main(String[] args) {
        Solution solution = new DiYiGeZhiChuXianYiCiDeZiFuLcof().new Solution();

        System.out.println(solution.firstUniqChar("abaccdeff"));
        System.out.println(solution.firstUniqChar("adaccbeff"));
        System.out.println(solution.firstUniqChar(""));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public char firstUniqChar(String s) {
            char ans = ' ';
            int ansIndex = Integer.MAX_VALUE;

            for (char c = 'a'; c <= 'z'; c++) {
                // 判断字符是否在字符串中出现
                int index = s.indexOf(c);
                if (index == -1) {
                    continue;
                }
                // 判断字符是否在字符串中重复出现
                if (index != s.lastIndexOf(c)) {
                    continue;
                }

                // 不重复字符的出现位置
                if (index < ansIndex) {
                    ansIndex = index;
                    ans = c;
                }
            }

            return ans;
        }

        /**
         * 方法 1：两次扫描
         */
        private char findWithTraverseTwice(String s) {
            // 判断空串
            if (Objects.equals(s, "")) {
                return ' ';
            }

            int[] count = new int[26];
            char[] chars = s.toCharArray();
            int len = s.length();

            // 第 1 次遍历扫描字符出现的次数
            for (int i = 0; i < len; i++) {
                count[chars[i] - 'a']++;
            }

            // 第 2 次遍历扫描第一个只出现一次的字符
            for (int i = 0; i < len; i++) {
                if (count[chars[i] - 'a'] == 1) {
                    return chars[i];
                }
            }

            return ' ';
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}