package 정올.문자열2.연습문제;

import java.util.Scanner;

public class 연습문제2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");

        for (String word : words) {
            System.out.println(word);
        }

        sc.close();
    }
}
