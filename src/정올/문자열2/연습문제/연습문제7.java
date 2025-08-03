package 정올.문자열2.연습문제;

import java.util.Scanner;

public class 연습문제7 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String[] words = {
                "champion", "tel", "pencil", "jungol", "olympiad",
                "class", "information", "lesson", "book", "lion"
        };

        System.out.print("문자를 입력하세요. ");
        String ch = sc.next();
        boolean foundChar = false;
        for (String word : words) {
            if (word.contains(ch)) {
                System.out.println(word);
                foundChar = true;
            }
        }
        if (!foundChar) {
            System.out.println("찾는 단어가 없습니다.");
        }

        System.out.print("문자열을 입력하세요. ");
        String str = sc.next();
        boolean foundStr = false;
        for (String word : words) {
            if (word.contains(str)) {
                System.out.println(word);
                foundStr = true;
            }
        }
        if (!foundStr) {
            System.out.println("찾는 단어가 없습니다.");
        }

        sc.close();
    }
}
