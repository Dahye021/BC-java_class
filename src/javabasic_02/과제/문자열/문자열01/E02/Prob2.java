package javabasic_02.과제.문자열.문자열01.E02;

import java.util.Scanner;

public class Prob2 {

    public static void main(String[] args) {
        String inputStr;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("문자를 입력하세요. : ");
        inputStr = keyboard.nextLine();

        // 문자열을 역순으로 뒤집고 대문자로 변환
        String result = new StringBuilder(inputStr)
                .reverse()
                .toString()
                .toUpperCase();

        // 결과 출력
        System.out.println(result);

        keyboard.close();
    }
}
