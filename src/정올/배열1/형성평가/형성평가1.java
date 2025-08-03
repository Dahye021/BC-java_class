package 정올.배열1.형성평가;

import java.util.Scanner;

public class 형성평가1 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        char[] letters = new char[10];

        for (int i = 0; i < 10; i++) {
            letters[i] = in.next().charAt(0);
        }

        for (int i = 9; i >= 0; i--) {
            System.out.print(letters[i] + " ");
        }
    }
}
