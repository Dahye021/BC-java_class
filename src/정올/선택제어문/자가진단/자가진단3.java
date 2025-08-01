package 정올.선택제어문.자가진단;

import java.util.Scanner;

public class 자가진단3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if (age >= 20) {
            System.out.println("adult");
        } else {
            int yearsLater = 20 - age;
            System.out.println(yearsLater + " years later");
        }
    }
}
