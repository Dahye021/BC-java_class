package java01.day.정올.입력.형성평가;

import java.util.Scanner;

public class 입력형성평가4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("입력하시오.\n");

        int n = scanner.nextInt();
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        int s = n + n1 + n2;

        System.out.printf("sum = %d", s);
        scanner.close();

    }
}
