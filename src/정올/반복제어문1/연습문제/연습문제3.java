package java01.day.정올.반복제어문1.연습문제;

import java.util.Scanner;

public class 연습문제3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score;
        
        while (true) {
            System.out.print("점수를 입력하세요. ");
            score = sc.nextInt();
            
            // score 값이 100이외의 값이면 종료
            if (score < 0 || score > 100) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            
            // 합격 여부 판단
            if (score >= 80) {
                System.out.println("축하합니다. 합격입니다.");
            } else {
                System.out.println("죄송합니다. 불합격입니다.");
            }
        }
    }
}
