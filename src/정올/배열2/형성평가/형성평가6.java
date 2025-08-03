package 정올.배열2.형성평가;

import java.util.Scanner;

public class 형성평가6 {

    public static void main(String[] args) {
        int rows = 5, cols = 5;
        int[][] arr = new int[rows][cols];

        // 1행의 1, 3, 5열을 1로 초기화 (인덱스 0, 2, 4)
        arr[0][0] = 1;
        arr[0][2] = 1;
        arr[0][4] = 1;

        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int left = (j - 1 >= 0) ? arr[i - 1][j - 1] : 0;
                int right = (j + 1 < cols) ? arr[i - 1][j + 1] : 0;
                arr[i][j] = left + right;
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
