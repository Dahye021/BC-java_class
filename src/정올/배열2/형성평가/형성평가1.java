package 정올.배열2.형성평가;

import java.util.Scanner;

public class 형성평가1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] counts = new int[7]; // 인덱스 1~6 사용

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            counts[num]++;
        }

        for (int i = 1; i <= 6; i++) {
            System.out.println(i + " : " + counts[i]);
        }

        sc.close();
    }
}
