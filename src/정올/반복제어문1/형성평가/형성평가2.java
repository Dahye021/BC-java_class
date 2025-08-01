package 정올.반복제어문1.형성평가;

import java.util.Scanner;

public class 형성평가2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int oddCount = 0;
        int evenCount = 0;

        while (true) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }

            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("odd : " + oddCount);
        System.out.println("even : " + evenCount);
    }
}
