package 정올.배열2.형성평가;

import java.util.Scanner;

public class 형성평가8 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int rows = 4, cols = 2;
        int[][] arr = new int[rows][cols];

        int[] rowSum = new int[rows];
        int[] colSum = new int[cols];
        int totalSum = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
                rowSum[i] += arr[i][j];
                colSum[j] += arr[i][j];
                totalSum += arr[i][j];
            }
        }

        for (int i = 0; i < rows; i++) {
            System.out.print((rowSum[i] / cols) + " ");
        }
        System.out.println();

        for (int j = 0; j < cols; j++) {
            System.out.print((colSum[j] / rows) + " ");
        }
        System.out.println();

        System.out.println(totalSum / (rows * cols));

        sc.close();
    }
}
