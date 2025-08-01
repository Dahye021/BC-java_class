package javabasic_01.day.정올.반복제어문2.형성평가;

import java.util.Scanner;

public class 형성평가10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number1 = in.nextInt();
        int number2 = in.nextInt();

        if (number1 >= number2) {
            for (int i = 1; i <= 9; i++) {
                for (int j = number1; j >= number2; j--) {
                    System.out.printf("%d * %d = %2d   ", j, i, j * i);
                }
                System.out.println();
            }
        } else {
            for (int i = 1; i <= 9; i++) {
                for (int j = number1; j <= number2; j++) {
                    System.out.printf("%d * %d = %2d   ", j, i, j * i);

                }
                System.out.println();
            }
        }
    }
}