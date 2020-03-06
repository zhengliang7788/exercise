package leetcode;


/**
 * @author zhengLiang
 * @description 给你一个整数数组 nums，请你返回其中位数为 偶数 的数字的个数。
 * @date 2020/3/6 14:43
 */
public class EvenNumber {
    public static int findNumber(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = 0;
            int n = nums[i];
            while (n > 0) {
                n /= 10;
                num++;
            }
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7896};
        int num = EvenNumber.findNumber(arr);
        System.out.println(num);
    }

}
