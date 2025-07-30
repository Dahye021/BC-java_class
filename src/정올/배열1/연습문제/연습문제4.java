package 정올.배열1.연습문제;

import java.util.Scanner;

public class 연습문제4 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int[] n = new int[100];
        int count = 0;

        while (count < 100) {
            int a = in.nextInt();
            if (a == 0) break;
            n [count] = a;
            count++;
        }
        for (int i = 1; i < count; i += 2) {
            System.out.print(n[i] + " ");
        }
    }
}
