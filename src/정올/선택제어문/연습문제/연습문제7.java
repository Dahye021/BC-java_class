package java01.day.정올.선택제어문;

import java.util.Scanner;

import static java.lang.System.in;

public class 연습문제7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);

        System.out.println("1. 삽입");
        System.out.println("2. 수정");
        System.out.println("3. 삭제");
        System.out.println("숫자를 선택하세요.");
        int number = sc.nextInt();

        if (number == 1) System.out.println("삽입을 선택하셨습니다.");
        else if (number == 2) System.out.println("수정을 선택하셨습니다.");
        else if (number == 3) System.out.println("삭제를 선택하셨습니다.");
        else System.out.println("1,2,3 중에 선택해주세요.");
    }
}