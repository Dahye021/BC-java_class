package 정올.선택제어문;

import java.util.Scanner;

public class 연습문제6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("세 수를 입력하세요.");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int temp1 = Math.max(n1,n2);
        int temp2 = Math.max(n2,n3);

        int max = Math.max(temp1,temp2);

        System.out.printf("입력받은 수 중 가장 큰 수는 %d 입니다.", max);
    }
}
