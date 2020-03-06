package leetcode;

/**
 * @author zhengLiang
 * @description 给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。
 * @date 2020/3/6 14:23
 */
public class ProductReduceSum {
    public static int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while (n > 0) {
            int num = n % 10;
            sum += num;
            product *= num;
            n /= 10;
        }
        return product - sum;
    }

    public static void main(String[] args) {
        int num = ProductReduceSum.subtractProductAndSum(1);
        System.out.println(num);
    }
}
