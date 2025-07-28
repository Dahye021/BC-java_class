package 정올.연산자;

import java.util.Scanner;

public class 연습문제2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("5개의 수를 입력하시오.");
        int num = sc.nextInt();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();

        int sum1 = num + 3;
        int sum2 = num1 - 3;
        int sum3 = num2 * 3;
        int sum4 = num3 / 3;
        int sum5 = num4 % 3;

        System.out.printf("%d %d %d %d %d", sum1, sum2, sum3, sum4, sum5);
    }
}
