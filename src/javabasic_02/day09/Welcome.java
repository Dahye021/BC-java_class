package javabasic_03.day09;

import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("당신의 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("연락처를 입력하세요 : ");
        String phone = sc.nextLine();

        CartService service = new CartService(name, phone);

        while (true) {
            printMenu();
            System.out.print("메뉴 번호를 선택해주세요 : ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1: service.menuGuestInfo(); break;
                case 2: service.menuCartItemList(); break;
                case 3: service.menuCartClear(); break;
                case 4: service.menuCartAddItem(sc); break;
                case 5: service.menuCartRemoveItemCount(sc); break;
                case 6: service.menuCartRemoveItem(sc); break;
                case 7: service.menuCartBill(); break;
                case 8:
                    service.menuExit();
                    return;
                default:
                    System.out.println("잘못된 번호입니다.");
            }
        }
    }

    public static void printMenu() {
        System.out.println("*******************************************************************");
        System.out.println("\t      Welcome to Shopping Mall");
        System.out.println("\t       Welcome to Book Market!");
        System.out.println("*******************************************************************");
        System.out.println("1. 고객 정보 확인하기\t4. 바구니에 항목 추가하기");
        System.out.println("2. 장바구니 상품 목록 보기\t5. 장바구니의 항목 수량 줄이기");
        System.out.println("3. 장바구니 비우기\t\t6. 장바구니의 항목 삭제하기");
        System.out.println("7. 영수증 표시하기\t\t8. 종료");
        System.out.println("*******************************************************************");
    }
}

