package 정올.문자열2.연습문제;

import java.util.Arrays;
import java.util.Scanner;

public class 연습문제9 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String[] words = new String[5];

        System.out.println("단어 5개를 입력하세요.");
        for (int i = 0; i < 5; i++) {
            words[i] = sc.next();
        }

        Arrays.sort(words);

        for (String word : words) {
            System.out.println(word);
        }

        sc.close();
    }
}
