package 정올.선택제어문.형성평가;

import java.util.Scanner;

public class 형성평가3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("leap year");
        } else {
            System.out.println("common year");
        }
    }
}
