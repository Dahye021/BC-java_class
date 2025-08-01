package 정올.문자열1;

import java.util.Scanner;

public class 연습문제7 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String input = in.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                result.append((char)(ch + 32));
            } else if (ch >= 'a' && ch <= 'z') {
                result.append((char)(ch - 32));
            } else {
                result.append(ch);
            }
        }
        System.out.println(result.toString());
    }
}
