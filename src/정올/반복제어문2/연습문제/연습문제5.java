package 정올.반복제어문2.연습문제;

import java.util.Scanner;

public class 연습문제5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evenCount = 0;

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                evenCount++;
            }
        }

        System.out.println("입력받은 짝수는 " + evenCount + "개입니다.");
    }
}
