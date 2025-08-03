package 정올.문자열2.연습문제;

import java.util.Scanner;

public class 연습문제3 {
    public static void main(String[] args) {
        String[] words = {"champion", "class", "apple", "car", "banana"};
        Scanner sc = new Scanner(System.in);

        System.out.print("문자를 입력하세요. ");
        char ch = sc.next().charAt(0);

        boolean found = false;
        for (String word : words) {
            if (word.charAt(0) == ch) {
                System.out.println(word);
                found = true;
            }
        }

        if (!found) {
            System.out.println("찾는 단어가 없습니다.");
        }

        sc.close();
    }
}
