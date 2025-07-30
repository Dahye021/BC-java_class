package 나홀로_연습.연산자.연습문제;

import java.util.Scanner;

public class 연습문제2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("5개의 수를 입력하시오. ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int e = in.nextInt();

        int result1 = a + 3;
        int result2 = b - 3;
        int result3 = c * 3;
        int result4 = d / 3;
        int result5 = e % 3;

        String str1 = String.valueOf(a);
        String str2 = String.valueOf(b);
        String str3 = String.valueOf(c);
        String str4 = String.valueOf(d);
        String str5 = String.valueOf(e);

        System.out.print(a + 3 + " ");
        System.out.print(b - 3 + " ");
        System.out.print(c * 3 + " ");
        System.out.print(d / 3 + " ");
        System.out.print(e % 3 + " ");

        System.out.println();
        System.out.printf("%d %d %d %d %d", result1, result2, result3, result4, result5 );


    }
}
