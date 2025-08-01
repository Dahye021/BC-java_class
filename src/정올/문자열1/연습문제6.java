package 정올.문자열1;

import java.util.Scanner;

public class 연습문제6 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            String input = in.nextLine();
            if(input.isEmpty()) continue;

            char ch = input.charAt(0);

            if (ch >= 'a' && ch <= 'z'){
                System.out.println("소문자입니다.");
            } else if (ch >= 'A' && ch <= 'Z'){
                System.out.println("대문자입니다.");
            } else if (ch >= '0' && ch <= '9') {
                System.out.println("숫자문자입니다.");
            } else {
                System.out.println("영문, 숫자 이외의 문자이니다.");
                break;
            }
        }
    }
}
