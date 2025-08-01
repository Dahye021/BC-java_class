package 정올.연산자.자가진단;

import java.util.Scanner;

public class 자가진단4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = a++ * --b;

        System.out.println(a + " " + b + " " + result);
    }
}
