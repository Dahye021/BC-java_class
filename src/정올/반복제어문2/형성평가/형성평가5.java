package 정올.반복제어문2.형성평가;

import java.util.Scanner;

public class 형성평가5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 0;

        for (int i = 0; i < 10; i++) {
            int num1 = sc.nextInt();
            if (num1 % 2 == 0) {
                a++;
            } else {
                b++;
            }
        }
        System.out.println("even : " + a);
        System.out.println("odd : " + b);
    }
}
