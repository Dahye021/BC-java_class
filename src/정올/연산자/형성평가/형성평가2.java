package java01.day.정올.연산자.형성평가;

import java.util.Scanner;

public class 형성평가2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int a1 = a / b;
        int b2 = a % b;

        System.out.printf("%d / %d = %d . . . %d \n", a, b, a1, b2);
        System.out.println(a + " / " + b + " = " + a1 + "..." + b2);
    }
}
