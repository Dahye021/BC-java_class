package 정올.연산자.자가진단;

import java.util.Scanner;

public class 자가진단8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int isMax = (a > b && a > c) ? 1 : 0;

        int isEqual = (a == b && b == c) ? 1 : 0;

        System.out.println(isMax + " " + isEqual);
    }
}
