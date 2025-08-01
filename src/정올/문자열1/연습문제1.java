package 정올.문자열1;

import java.util.Scanner;

public class 연습문제1 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        while (true){
            String input = in.nextLine();
            char ch = input.charAt(0);

            System.out.println(ch + "->" + (int) ch);

            if (ch == '0'){
                break;
            }
        }
    }
}
