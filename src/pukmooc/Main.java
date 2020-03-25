package pukmooc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {

            for (int j = i + 1; j < 1000; j++) {

                int tmpAnswer = judge(mySum(i, j));

                if (tmpAnswer >= 0) {

                    printAnswer(i, j, tmpAnswer);

                }

            }

        }


    }


    static int mySum(int start, int end) {

        int tmp = start * (start - 1) / 2;

        tmp *= tmp;

        int t2 = end * (end + 1) / 2;

        t2 *= t2;

        return t2 - tmp;

    }

    static int judge(int sum) {

        int tmp = (int) Math.pow(sum, 0.3333334);

        if (tmp * tmp * tmp == sum) {
            return tmp;
        } else {
            return -1;
        }


    }

    static void printAnswer(int i, int j, int ans) {

        System.out.println(i + "^3" + "+...+" + j + "^3 = " + ans + "^3");


    }

}
