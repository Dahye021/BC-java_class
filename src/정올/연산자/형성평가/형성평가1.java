package java01.day.정올.연산자.형성평가;

import java.util.Scanner;

public class 형성평가1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score1 = sc.nextInt();
        int score2 = sc.nextInt();
        int score3 = sc.nextInt();
        int score4 = sc.nextInt();

        int sum = score1 + score2 + score3 + score4;

        int avg = sum / 4;

        System.out.printf("sum %d\n", sum);
        System.out.printf("avg %d", avg);


    }
}
