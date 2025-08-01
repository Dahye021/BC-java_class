package 정올.선택제어문.형성평가;

import java.util.Scanner;

public class 형성평가1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int diff = (a > b) ? (a - b) : (b - a);

        System.out.println(diff);
    }
}
