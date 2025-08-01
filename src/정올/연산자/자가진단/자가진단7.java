package 정올.연산자.자가진단;

import java.util.Scanner;

public class 자가진단7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        boolean boolA = (a != 0);
        boolean boolB = (b != 0);

        System.out.println((boolA && boolB) + " " + (boolA || boolB));
    }
}
