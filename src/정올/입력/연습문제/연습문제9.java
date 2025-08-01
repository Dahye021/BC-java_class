package javabasic_01.day.정올.입력;

import java.util.Scanner;

public class 연습문제9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("두 개의 실수를 입력하시오.");
        double num = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        System.out.println("x =" + num);
        System.out.println("y =" + num2);

        scanner.close();
    }
}
