package leetcode;

/**
 * @author zhengLiang
 * @description 给你一个仅由数字 6 和 9 组成的正整数 num。
 * 你最多只能翻转一位数字，将 6 变成 9，或者把 9 变成 6 。
 * 请返回你可以得到的最大数字。
 * 输入：num = 9669
 * 输出：9969
 * @date 2020/3/7 14:15
 */
public class MaxNumber {
    public static int maximum69Number(int num) {
        String str = String.valueOf(num);
        char[] charArr = str.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == '6') {
                charArr[i] = '9';
                break;
            }
        }
        String str2 = String.valueOf(charArr);
        return Integer.parseInt(str2);
    }

    public static void main(String[] args) {
        int num = MaxNumber.maximum69Number(69);
        System.out.println(num);
    }
}
