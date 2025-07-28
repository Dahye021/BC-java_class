package 나홀로_연습.정올연습.반복제어문2.형성평가;

import java.util.Scanner;

public class 형성평가3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        for (int i =1; i <= n; i++) {
            if (i % 5 == 0) //%(나머지) 연산자로 5의 배수인지 확인 나머지가 0 이면 5의 배수로 진실이 됨
                sum += i;
        }
        System.out.print(sum);
    }
}
