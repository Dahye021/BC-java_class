package java01.day.정올.선택제어문;

import java.util.Scanner;

public class 연습문제3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("점수를 입력하세요. ");
        int score = sc.nextInt();

        if (score >= 80) {
            System.out.println("축하합니다. 합격입니다.");
        }
        else {
            System.out.println("불합격입니다. ");
        }
    }
}
