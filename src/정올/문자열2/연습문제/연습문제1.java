package 정올.문자열2.연습문제;

import java.util.Scanner;

public class 연습문제1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String[] words = new String[5];

        for (int i = 0; i < 5; i++) {
            words[i] = sc.next();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(words[i]);
        }

        sc.close();
    }
}
