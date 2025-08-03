package 정올.배열2.형성평가;

import java.util.Scanner;

public class 형성평가7 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] arr1 = new int[2][3];
        int[][] arr2 = new int[2][3];
        int[][] result = new int[2][3];

        System.out.println("first array");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("second array");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = arr1[i][j] * arr2[i][j];
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
