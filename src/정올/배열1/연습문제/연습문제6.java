package 정올.배열1.연습문제;

import java.util.Scanner;

public class 연습문제6 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int[] num = new int[10];
        int max = 0;

        for (int i  = 0; i < 10; i++) {
            num[i] = in.nextInt();
            if (num[i] > max){
                max = num[i];
            }
        }
        System.out.println(max);

    }
}
