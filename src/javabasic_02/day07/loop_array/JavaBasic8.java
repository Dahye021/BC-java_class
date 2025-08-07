package javabasic_02.day07.loop_array;

import java.util.Scanner;

public class JavaBasic8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;
        boolean run = true;

        while (run) {
            System.out.println("----------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("----------------------------------");
            System.out.print("선택> ");

            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    System.out.print("예금액> ");
                    try {
                        int deposit = Integer.parseInt(scanner.nextLine());
                        if (deposit > 0) {
                            balance += deposit;
                        } else {
                            System.out.println("0보다 큰 금액을 입력하세요.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("숫자를 입력하세요.");
                    }
                    break;

                case "2":
                    System.out.print("출금액> ");
                    try {
                        int withdraw = Integer.parseInt(scanner.nextLine());
                        if (withdraw > balance) {
                            System.out.println("잔액 부족!");
                        } else if (withdraw <= 0) {
                            System.out.println("0보다 큰 금액을 입력하세요.");
                        } else {
                            balance -= withdraw;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("숫자를 입력하세요.");
                    }
                    break;

                case "3":
                    System.out.println("잔고> " + balance);
                    break;

                case "4":
                    System.out.println("프로그램을 종료합니다.");
                    run = false;
                    break;

                default:
                    System.out.println("올바른 메뉴를 선택하세요.");
            }

            System.out.println();
        }
    }
}