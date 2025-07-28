package 정올.선택제어문;

import java.util.Scanner;

public class 연습문제5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println("주사위를 두 번 던진 결과를 입력하세요.");

        if ((n1 >= 4) == (n2 >= 4)) {
            System.out.println("이겼습니다.");
        }
    }
}
