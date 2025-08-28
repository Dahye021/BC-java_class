package 개인.나홀로_연습.정올연습.반복제어문2.형성평가;

import java.util.Scanner;

public class 형성평가 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nu1 = sc.nextInt();

        for (int i = 1; i <= nu1; i++ ) { //i가 nu1보다 작거나 같을때까지 반복수행하며 한번 돌고 나서 i는 1씩 증가한다
            System.out.println("hi");
        }
    }
}
