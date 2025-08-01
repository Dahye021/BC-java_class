package 정올.연산자.자가진단;

import java.util.Scanner;

public class 자가진단1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long a = in.nextInt();
        long b = in.nextInt();
        long c = in.nextInt();

        long sum = a + b + c;

        long avg = sum / 3;

        System.out.println("sum : " + sum);
        System.out.println("avg : " + avg);
    }
}
