package 정올.문자열1;

import java.util.Scanner;

public class 연습문제8 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String input = in.nextLine();
        String[] words = input.split(" ");

        for (String word : words){
            System.out.println(word);
        }
    }
}
