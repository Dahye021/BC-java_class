package 정올.배열1.연습문제;

import java.util.Scanner;

public class 연습문제8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr1 = new int[10];
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            arr1[i] = in.nextInt();
            sum += arr1[i];
        }

        double avg = (double) sum / 10;

        System.out.println("총점 = " + sum);
        System.out.printf("평균 = %.1f\n", avg);
    }
}