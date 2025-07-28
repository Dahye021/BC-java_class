package 정올.연산자.연습문제;

import java.util.Scanner;

public class 연습문제5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result1 = (a == b) ? 1 : 0;
        int result2 = (b == c) ? 1 : 0; //?= 삼항연산자로 값을 비교한다

        int result3 = (a != b) ? 1 : 0;
        int result4 = (b != c) ? 1 : 0;

        System.out.printf("%d %d %d %d", result1, result2, result3, result4);
    }
}
