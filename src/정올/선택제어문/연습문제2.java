package 정올.선택제어문;

import java.util.Scanner;

public class 연습문제2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if (n1 > n2){
            System.out.printf("입력받은 수 중 큰 수는 %d 이고 작은수는 %d입니다.", n1, n2);
        }
        if (n1 < n2) {
            System.out.printf("입력받은 수 중 큰 수는 %d 이고 작은수는 %d입니다.", n2, n1);

        }
    }
}
