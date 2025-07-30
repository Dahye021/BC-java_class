package java01.day.정올.연산자.형성평가;

import java.util.Scanner;

public class 형성평가4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(++a + " " + b--);
        System.out.println(a + " " + b);
    }
}
