package 정올.배열2.형성평가;

import java.util.Scanner;

public class 형성평가3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] seq = new int[10];
        seq[0] = sc.nextInt();
        seq[1] = sc.nextInt();

        for (int i = 2; i < 10; i++) {
            seq[i] = (seq[i - 2] + seq[i - 1]) % 10;
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(seq[i] + (i < 9 ? " " : ""));
        }

        sc.close();
    }
}
