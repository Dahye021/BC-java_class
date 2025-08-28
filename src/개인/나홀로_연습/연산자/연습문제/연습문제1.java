package javabasic_01.day.정올.연산자;

import java.util.Scanner;

public class 연습문제1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("두 개의 수를 입력하시오.");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;
        int sum1 = a - b;
        int sum2 = a * b;
        int sum3 = a / b;
        int sum4 = a % b;

        System.out.printf("%d + %d = %d \n", a, b, sum);
        System.out.printf("%d - %d = %d \n", a, b, sum1);
        System.out.printf("%d * %d = %d \n", a, b, sum2);
        System.out.printf("%d / %d = %d \n", a, b, sum3);
        System.out.printf("%d %% %d = %d \n", a, b, sum4);

    }
}
