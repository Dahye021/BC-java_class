package 나홀로_연습.연산자.연습문제;

import java.util.Scanner;

public class 연습문제1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("두 개의 수를 입력하시오. ");

        int a = in.nextInt();
        int b = in.nextInt();
        int num = a + b;
        int num1 = a - b;
        int num2 = a * b;
        int num3 = a / b;
        int num4 = a % b;

        System.out.println(a + " + " + b + " = " + num);
        System.out.println(a + " - " + b + " = " + num1);
        System.out.println(a + " * " + b + " = " + num2);
        System.out.println(a + " / " + b + " = " + num3);
        System.out.println(a + " % " + b + " = " + num4);
    }
}
