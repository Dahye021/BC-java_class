package 나홀로_연습.연산자.연습문제;

import javax.swing.text.Style;
import java.util.Scanner;

public class 연습문제5 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int a1 = (a == b) ? 1 : 0;
        int a2 = (b == c) ? 1 : 0;
        int b1 = (a != b) ? 1 : 0;
        int b2 = (b != c) ? 1 : 0;

        System.out.printf("%d %d %d %d", a1, a2, b1, b2);
    }
}
