package javabasic_01.day.day03;

import java.util.Scanner;

public class printfex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("상품의 가격 : %5d원 \n", 5000);
        System.out.printf("상품의 가격 : %7d원 \n", 5000);
        System.out.printf("상품의 가격 : %08d \n", 5000);

        System.out.println("반지름을 입력하세요.");
        int rad = sc.nextInt();
        System.out.printf("반지름이 %d인 원의 넓이 : %.1f",rad,rad*rad*Math.PI);
    }
}
