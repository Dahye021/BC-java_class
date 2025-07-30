package java01.day.day05;

import java.util.Scanner;

public class 종합실습문제 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pick;

        System.out.print("당신의 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("연락처를 입력하세요 : ");
        String number = sc.nextLine();
        System.out.println("*********************************************************");

        while (true) {
            System.out.println("                Welcome to Shopping Mall");
            System.out.println("                Welcome to book Market!");
            System.out.println("*********************************************************");
            System.out.println("1. 고객 정보 확인하기               4. 바구니에 항목 추가하기");
            System.out.println("2. 장바구니 상품 목록 보기           5. 장바구니의 항목 수량 줄이기");
            System.out.println("3. 장바구니 비우기                  6. 장바구니의 항목 삭제하기");
            System.out.println("7. 영수증 표시하기                  8. 종료");

            System.out.println("*********************************************************");
            System.out.println("                메뉴 번호를 선택해주세요 : ");

            pick = sc.nextInt();

            switch (pick) {
                case 1:
                    System.out.println("*********************************************************");
                    System.out.println("[고객 정보 확인]");
                    System.out.println("이름 : " + name);
                    System.out.println("  연락처 " + number);
                    System.out.println("*********************************************************");

                case 8:
                    System.out.println("프로그램 종료");
                    return;
            }
        }
    }
}
