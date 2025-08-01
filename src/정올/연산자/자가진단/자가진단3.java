package 정올.연산자.자가진단;

import java.util.Scanner;

public class 자가진단3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(num++);
        System.out.println(++num);
    }
}
