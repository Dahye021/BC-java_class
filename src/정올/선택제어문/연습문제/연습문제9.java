package 정올.선택제어문.연습문제;

import java.util.Scanner;

public class 연습문제9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        int max = (a > b) ? a : b;

        System.out.println(max);
    }
}
