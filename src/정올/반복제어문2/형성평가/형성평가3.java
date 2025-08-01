package javabasic_01.day.정올.반복제어문2.형성평가;

import java.util.Scanner;

public class 형성평가3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= a; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);

    }
}
