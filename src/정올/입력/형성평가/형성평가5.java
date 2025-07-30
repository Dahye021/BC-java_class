package java01.day.정올.입력.형성평가;

import java.util.Scanner;

public class 형성평가5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("yard? ");
        double yard = scanner.nextDouble();
        double cm = yard * 91.44;

        System.out.printf("&.1fyard = %.1fcm", yard, cm);

    }
}
