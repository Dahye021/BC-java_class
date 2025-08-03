package 정올.배열2.형성평가;

import java.util.Scanner;

public class 형성평가10 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        char[][] arr = new char[3][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.next().charAt(0);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(Character.toLowerCase(arr[i][j]) + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
