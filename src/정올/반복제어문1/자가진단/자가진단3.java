package 정올.반복제어문1.자가진단;

import java.util.Scanner;

public class 자가진단3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("number? ");
            int num = sc.nextInt();

            if (num == 0) {
                break;  // 0 입력되면 종료
            } else if (num > 0) {
                System.out.println("positive integer");
            } else {
                System.out.println("negative number");
            }
        }
    }
}
