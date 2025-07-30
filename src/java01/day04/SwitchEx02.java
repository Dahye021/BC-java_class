package java01.day.day04;

import java.util.Scanner;

public class SwitchEx02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("A, B, C 중 한 문자를 입력하세요.");
        char grade = in.next().charAt(0);

            // 사용자에게 A~C중 한문자를 받아서 'A' ==> "매우 우수"      'B' "우수"    'C' => "노력하세요"

            switch (grade) {
                case 'A':
                    System.out.println("매우 우수");
                    break;
                case 'B':
                    System.out.println("우수");
                    break;
                case 'C':
                    System.out.println("노력하세요.");
                    break;

                default:
                    System.out.println("잘못된 입력입니다.");
        }
    }
}
