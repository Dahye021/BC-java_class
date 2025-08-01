package 정올.반복제어문1.연습문제;

import java.util.Scanner;

public class 연습문제6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            // 메뉴 출력
            System.out.println("1. 입력하기");
            System.out.println("2. 출력하기");
            System.out.println("3. 삭제하기");
            System.out.println("4. 끝내기");
            System.out.print("작업할 번호를 선택하세요. ");

            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("입력을 선택하였습니다.\n");
            } else if (choice == 2) {
                System.out.println("출력을 선택하였습니다.\n");
            } else if (choice == 3) {
                System.out.println("삭제를 선택하였습니다.\n");
            } else if (choice == 4) {
                System.out.println("끝내기를 선택하였습니다.");
                break;  // 반복 종료
            } else {
                System.out.println("잘못 입력하였습니다.\n");
            }
        }
    }
}
