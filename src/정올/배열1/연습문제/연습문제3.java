package 정올.배열1.연습문제;

import java.util.Scanner;

public class 연습문제3 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr1 = new int[10];

        for (int i = 0; i < 10; i++) {
            arr1[i] = in.nextInt();
        }
        System.out.println(arr1[2] + " " + arr1[4] + " " + arr1[9]);
    }
}
