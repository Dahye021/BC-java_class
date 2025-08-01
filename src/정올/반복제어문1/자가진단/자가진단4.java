package 정올.반복제어문1.자가진단;

import java.text.DecimalFormat;
import java.util.Scanner;

public class 자가진단4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int num;

        while (true) {
            num = sc.nextInt();
            sum += num;
            count++;

            if (num >= 100) {
                break;
            }
        }

        double avg = (double) sum / count;

        DecimalFormat df = new DecimalFormat("0.0");

        System.out.println(sum);
        System.out.println(df.format(avg));

    }
}
