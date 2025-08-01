package 정올.반복제어문1.자가진단;

import java.util.Scanner;

public class 자가진단5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int num = sc.nextInt();

            if (num == -1) {
                break;
            }

            if (num % 3 == 0) {
                System.out.println(num / 3);
            }
        }
    }
}
