package 정올.배열1.연습문제;

import javax.swing.event.ListDataListener;
import java.time.Year;
import java.util.Scanner;

public class 연습문제5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        while (true){
            System.out.print("YEAR = ");
            int YEAR = in.nextInt();

            System.out.print("MONTH = ");
            int MONTH = in.nextInt();

            if (MONTH == 0) break;

            if (MONTH < 1 || MONTH > 12) {
                System.out.println("잘못 입력하였습니다.");
                continue;
            }

            int days = daysInMonth[MONTH];
            if (MONTH == 2 && isLeapYear(YEAR)) {
                days = 29;
            }
            System.out.println("입력하신 달의 날 수는" + days + "일입니다.");
        }
    }
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
