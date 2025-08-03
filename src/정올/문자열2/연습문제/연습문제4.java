package 정올.문자열2.연습문제;

import java.util.Scanner;

public class 연습문제4 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String str1 = sc.next();
        String str2 = sc.next();

        if (str1.length() < str2.length()) {
            System.out.println(str1);
            System.out.println(str2);
        } else if (str1.length() > str2.length()) {
            System.out.println(str2);
            System.out.println(str1);
        } else {
            System.out.println(str1);
            System.out.println(str2);
        }

        sc.close();
    }
}
