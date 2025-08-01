package 정올.반복제어문1.자가진단;

import java.util.Scanner;

public class 자가진단6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Korea");
            System.out.println("2. USA");
            System.out.println("3. Japan");
            System.out.println("4. China");
            System.out.print("number? ");

            int num = sc.nextInt();

            if (num == 1) {
                System.out.println("\nSeoul\n");
            } else if (num == 2) {
                System.out.println("\nWashington\n");
            } else if (num == 3) {
                System.out.println("\nTokyo\n");
            } else if (num == 4) {
                System.out.println("\nBeijing\n");
            } else {
                System.out.println("\nnone");
                break;
            }
        }
    }
}
