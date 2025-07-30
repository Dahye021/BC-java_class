package java01.day.정올.입력;

import java.util.Scanner;

public class 입력연습문제7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("두 수를 입력하시오.");
        int num = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum = (num + num2);
        int sum1 = (num * num2);

        System.out.println(num + "+" + num2 + "=" + sum);
        System.out.println(num + "*" + num2 + "=" + sum1);

        scanner.close();
    }
}
