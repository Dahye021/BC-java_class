package java01.day.정올.연산자.형성평가;

import java.util.Scanner;

public class 형성평가3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int w = a+=5;
        int h = b*=2;

        int area = w * h;

        System.out.printf("width = %d\n", w);
        System.out.printf("length = %d\n", h);
        System.out.printf("area = %d\n", area);
    }
}
