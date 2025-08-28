package 개인.나홀로_연습.연산자.연습문제;

import java.util.Scanner;

public class 연습문제4 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int a = in.nextInt();
        int b = in.nextInt();

        int c = ++a + b--;

        System.out.printf("a = %d, b = %d, c = %d", a, b, c);
    }
}
