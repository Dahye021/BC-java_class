package 정올.반복제어문1.형성평가;

import java.util.Scanner;

public class 형성평가4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        while (true) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }

            if (num % 3 != 0 && num % 5 != 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
