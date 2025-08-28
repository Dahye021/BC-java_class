package 개인.나홀로_연습.정올연습.반복제어문2.형성평가;

import java.util.Scanner;

public class 형성평가2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int start = Math.min(a, b); //두 숫자 중 작은 값을 start(변수)에 저장 (min)
        int end = Math.max(a, b); // 두 숫자중 큰 값을 end(변수)에 저장 (max)

        for (int i = start; i <= end; i++){
            System.out.print(i + " ");
        }
    }
}
