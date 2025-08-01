package 정올.문자열1;

import java.util.Scanner;

public class 연습문제9 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String str = in.nextLine();
        int len = str.length();

        for (int i = 0; i < len; i++){
            String rotated = str.substring(i+1) + str.substring(0, i + 1 - (len == 1 ? 0 : 1));
            System.out.println(rotated);
        }
    }
}
