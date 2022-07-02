package day01.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * 剑指 Offer 48. 最长不含重复字符的子字符串
 * <p>
 * 分类：字符串, 哈希表, 滑动窗口
 * 难度：中等
 * 链接：<a href="https://leetcode.cn/problems/zui-chang-bu-han-zhong-fu-zi-fu-de-zi-zi-fu-chuan-lcof/">...</a>
 */
public class ZuiChangBuHanZhongFuZiFuDeZiZiFuChuanLcof {
    public static void main(String[] args) {
        Solution solution = new ZuiChangBuHanZhongFuZiFuDeZiZiFuChuanLcof().new Solution();

        System.out.println(solution.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(solution.lengthOfLongestSubstring("bbbbb"));
        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            Map<Character, Integer> map = new HashMap<>();

            int ans = 0;
            int idx = -1;

            for (int i = 0; i < s.length(); i++) {
                if (map.containsKey(s.charAt(i))) {
                    idx = Math.max(idx, map.get(s.charAt(i)));
                }

                map.put(s.charAt(i), i);

                ans = Math.max(ans, i - idx);
            }

            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}