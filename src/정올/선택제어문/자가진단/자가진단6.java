package 정올.선택제어문.자가진단;

import java.util.Scanner;

public class 자가진단6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char gender = sc.next().charAt(0);
        int age = sc.nextInt();

        if (gender == 'M') {
            if (age >= 18) {
                System.out.println("MAN");
            } else {
                System.out.println("BOY");
            }
        } else if (gender == 'F') {
            if (age >= 18) {
                System.out.println("WOMAN");
            } else {
                System.out.println("GIRL");
            }
        }
    }
}
