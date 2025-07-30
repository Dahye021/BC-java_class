package 정올.배열1.연습문제;

import java.util.Scanner;

public class 연습문제1 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr1 = new int[5];

        System.out.println("==itar방식 입력==");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = in.nextInt();
        }
        System.out.println("==iter 방식 출력==");
        for (int i : arr1) {
            System.out.println(i);
        }
        System.out.println("==itar 방식 출력==");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);

        }
    }
}
