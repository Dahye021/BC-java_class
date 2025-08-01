package 정올.선택제어문.자가진단;

import java.util.Scanner;

public class 자가진단9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int minAB = (a < b) ? a : b;
        int min = (minAB < c) ? minAB : c;

        System.out.println(min);
    }
}
