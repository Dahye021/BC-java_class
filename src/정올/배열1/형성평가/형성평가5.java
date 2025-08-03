package 정올.배열1.형성평가;

import java.util.Scanner;

public class 형성평가5 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        double sum = 0;

        for (int i = 0; i < 6; i++) {
            sum += in.nextDouble();
        }

        double avg = sum / 6;
        System.out.printf("%.1f\n", avg);

        in.close();
    }
}
