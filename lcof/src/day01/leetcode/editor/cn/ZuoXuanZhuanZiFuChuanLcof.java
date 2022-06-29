package day01.leetcode.editor.cn;

/**
 * 剑指 Offer 58 - II. 左旋转字符串
 * <p>
 * 分类：字符串, 数学, 双指针
 * 难度：简单
 * 链接：<a href="https://leetcode.cn/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/">...</a>
 */
public class ZuoXuanZhuanZiFuChuanLcof {
    public static void main(String[] args) {
        Solution solution = new ZuoXuanZhuanZiFuChuanLcof().new Solution();

        System.out.println(solution.reverseLeftWords("abcdefg", 2));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String reverseLeftWords(String s, int n) {
            return s.substring(n) + s.substring(0, n);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}