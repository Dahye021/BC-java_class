package 정올.문자열2.연습문제;

import java.util.Scanner;

public class 연습문제8 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String str1 = sc.next();
        String str2 = sc.next();

        if (str1.compareTo(str2) > 0) {
            System.out.println(str1 + " 가(이) 더 큽니다.");
        } else if (str1.compareTo(str2) < 0) {
            System.out.println(str2 + " 가(이) 더 큽니다.");
        } else {
            System.out.println("두 문자열이 같습니다.");
        }

        String front1 = str1.length() >= 3 ? str1.substring(0, 3) : str1;
        String front2 = str2.length() >= 3 ? str2.substring(0, 3) : str2;

        if (front1.equals(front2)) {
            System.out.println("앞의 세 문자가 같습니다.");
        } else {
            System.out.println("앞의 세 문자가 같지 않습니다.");
        }

        sc.close();
    }
}
