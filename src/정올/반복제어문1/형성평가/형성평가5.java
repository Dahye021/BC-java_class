package 정올.반복제어문1.형성평가;

import java.text.DecimalFormat;
import java.util.Scanner;

public class 형성평가5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        char cont;

        do {
            System.out.print("Base = ");
            double base = sc.nextDouble();

            System.out.print("Height = ");
            double height = sc.nextDouble();

            double area = (base * height) / 2;
            System.out.println("Triangle width = " + df.format(area));

            System.out.print("Continue? ");
            cont = sc.next().charAt(0);
        } while (cont == 'Y' || cont == 'y');
    }
}
