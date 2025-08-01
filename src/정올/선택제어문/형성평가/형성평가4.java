package 정올.선택제어문.형성평가;

import java.util.Scanner;

public class 형성평가4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number? ");
        int num = sc.nextInt();

        if (num == 1) {
            System.out.println("dog");
        } else if (num == 2) {
            System.out.println("cat");
        } else if (num == 3) {
            System.out.println("chick");
        } else {
            System.out.println("I don't know.");
        }
    }
}
