package 정올.배열2.형성평가;

import java.util.Scanner;

public class 형성평가5 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] counts = new int[4][3];
        int[] sums = new int[4];

        for (int i = 0; i < 4; i++) {
            System.out.print((i+1) + "class? ");
            for (int j = 0; j < 3; j++) {
                counts[i][j] = sc.nextInt();
                sums[i] += counts[i][j];
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.println((i+1) + "class : " + sums[i]);
        }

        sc.close();
    }
}
