package pukmooc;

import java.util.Scanner;

/**
 * @author zhengLiang
 * @description  一些相续正整数的立方和正好等于另一个整数的立方。
 * @date 2020/2/28 15:49
 *
 */
public class Week2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入第一个正整数：");
        int num1= input.nextInt();
        System.out.print("请输入最后一个正整数：");
        int num2 = input.nextInt();
        System.out.print("请输入要验证的正整数：");
        int num3 = input.nextInt();
        int sum = 0;
        for (int i = num1;i <= num2;i ++){
            sum += i*i*i;
        }
        if(sum == num3*num3*num3){
            System.out.println("等式成立");
        }else{
            System.out.println("等式不成立");
        }
    }
}
