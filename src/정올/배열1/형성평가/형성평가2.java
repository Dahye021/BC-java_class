package 정올.배열1.형성평가;

import java.util.Scanner;

public class 형성평가2 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int[] num = new int[5];

        for (int i = 0; i < 5; i++) {
            num[i] = in.nextInt();
        }

        int sum = num[0] + num[2] + num[4];
        System.out.println(sum);
    }
}
