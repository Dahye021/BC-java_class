package 정올.배열1.연습문제;

import java.util.Scanner;

public class 연습문제3 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr1 = new int[10];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = in.nextInt();
        }
        for (int i = 0 ; i < arr1.length; i++) {
            if (i == 2 || i == 4 || i == 9) {
                System.out.printf("%d", arr1[i]);
            }

        }
    }
}
