package 정올.문자열2.연습문제;

import java.util.Scanner;

public class 연습문제6 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String str1 = sc.next();
        String str2 = sc.next();

        String str1Front = str1.length() >= 3 ? str1.substring(0, 3) : str1;
        String str2Front = str2.length() >= 3 ? str2.substring(0, 3) : str2;

        String newStr1 = str2Front + str1.substring(3);
        String newStr2 = str2 + str1Front;

        System.out.println(newStr1);
        System.out.println(newStr2);

        sc.close();
    }
}
