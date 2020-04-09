package pukmooc.week6;

import java.util.Scanner;

/**
 * @author zhengLiang
 * @description
 * @date 2020/4/9 14:01
 */
public class TestMain {
    public static void main(String[] args) {
        System.out.print("请输入检查的年龄:");
        Scanner input =new Scanner(System.in);
        int age = input.nextInt();
        try {
            Age.checkAge(age);
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
