package javabasic_03.day09;

import java.util.Scanner;

public class Example06 {
    static Scanner in = new Scanner(System.in);

    public static int adder (int a, int b){
        return a + b;
    }

    public static int minus (int a, int b){
        return a - b;
    }

    public static int multi (int a, int b){
        return a * b;
    }

    public static double divide (int a, int b){
        return (double) a / b;
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("========================================");
            System.out.println("             사칙연산 계산기");
            System.out.println("========================================");
            System.out.println(" 1.덧셈 2.뺄셈 3.곱셈 4.나눗셈 5.프로그램종료");

            System.out.println("두 수를 차례로 입력하고 수행할 사칙연산의 메뉴 숫자를 입력해주세요.");
            int n1 = in.nextInt();
            int n2 = in.nextInt();
            int menu = in.nextInt();

            if(menu == 5){
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            double result = 0;

            switch (menu) {
                case 1:
                    int sum = adder(n1, n2);
                    System.out.printf("결과 : %d + %d = %d\n\n", n1, n2, sum);
                    break;
                case 2:
                    int diff = minus(n1, n2);
                    System.out.printf("%d - %d = %d\n\n", n1, n2, diff);
                    break;
                case 3:
                    int product = multi(n1, n2);
                    System.out.printf("%d * %d = %d\n\n", n1, n2, product);
                    break;
                case 4:
                    if (n2 == 0) {
                        System.out.println("0으로 나눌 수 없습니다.\n");
                    }else {
                        double quotient = divide (n1, n2);
                        System.out.printf("%d / %d = %.1f\n\n", n1, n2, quotient);
                    }
                    break;
                default:
                    System.out.println("잘못된 메뉴입니다.");
            }
        }

    }
}
