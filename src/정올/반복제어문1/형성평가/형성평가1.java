package 정올.반복제어문1.형성평가;

import java.util.Scanner;

public class 형성평가1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            if (i < n) {
                System.out.print(" ");
            }
        }
    }
}
