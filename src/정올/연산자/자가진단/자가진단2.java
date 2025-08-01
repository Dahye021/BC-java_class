package 정올.연산자.자가진단;

import java.util.Scanner;

public class 자가진단2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        num1 = num1 + 100;
        num2 = num2 % 10;
        System.out.println(num1 + " " + num2);
    }
}
