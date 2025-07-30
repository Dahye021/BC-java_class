package java01.day.정올.연산자.형성평가;

import java.util.Scanner;

public class 형성평가5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a1 = in.nextInt();
        int b1 = in.nextInt();
        int a2 = in.nextInt();
        int b2 = in.nextInt();

        boolean result = (a1 > a2) && (b1 > b2);        //boolean = 참과 거짓을 결과를 저장하는 자료형 변수로 result라는 변수에 저장하겠다 선언
        System.out.println(result ? 1 : 0);
    }
}
