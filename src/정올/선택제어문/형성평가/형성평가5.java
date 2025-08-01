package 정올.선택제어문.형성평가;

import java.util.Scanner;

public class 형성평가5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println(31);
                break;
            case 4: case 6: case 9: case 11:
                System.out.println(30);
                break;
            case 2:
                System.out.println(28);
                break;
            default:
                System.out.println("잘못된 입력입니다.");  // 1~12 범위 외 처리
                break;
        }
    }
}
