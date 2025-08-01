package javabasic_01.day.정올.반복제어문1.연습문제;

import java.util.Scanner;

public class 연습문제4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int sum = 0;

        while (true){
            int a = sc.nextInt();

            if (a == 0) {
                break;
            }
            sum += a;
            count++;
        }
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("입력된 자료의 개수 = " + count);
            System.out.println("입력된 자료의 합계 = " + sum);
            System.out.printf("입력된 자료의 평균 = %.2f\n", average);
        }else System.out.println("입력된 자료가 없습니다.");
    }
}
