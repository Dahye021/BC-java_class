package java01.day.정올.반복제어문1.연습문제;

import java.util.Scanner;

public class 연습문제5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int count = 0;
        int sum = 0;

        while (true) {
            num = sc.nextInt();

            if (num == 0){
                break;
            }
            if (num % 2 != 0){
                sum += num;
                count++;
            }
        }
        if (count > 0){
            int avg = sum / count;
            System.out.println("홀수의 합 = " + sum);
            System.out.println("홀수의 평균 = " + avg);
        }else {
            System.out.println("입력된 홀수가 없습니다.");
        }
    }
}
