package 정올.반복제어문2.형성평가;

import java.util.Scanner;

public class 형성평가2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int s = Math.min(a,b);
        int e = Math.max(a,b);

        for (int i = s; i <= e; i++) {
            System.out.print(i);
            if (i != e) {
                System.out.print(" ");
            }
        }
    }
}
