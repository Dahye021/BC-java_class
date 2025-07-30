package 나홀로_연습.연산자.연습문제;

import java.util.Scanner;

public class 연습문제6 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int a1 = (a > b) ? 1 : 0;
        int a2 = (b >= c) ? 1 : 0;
        int a3 = (a <= b) ? 1 : 0;
        int a4 = (b < c) ? 1 : 0;

        System.out.printf("%d %d %d %d", a1, a2, a3, a4);
    }
}
