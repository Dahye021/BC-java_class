package 정올.반복제어문1.자가진단;

import java.util.Scanner;

public class 자가진단2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }

        System.out.println(sum);
    }
}
