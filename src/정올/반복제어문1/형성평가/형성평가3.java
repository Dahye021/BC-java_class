package 정올.반복제어문1.형성평가;

import java.text.DecimalFormat;
import java.util.Scanner;

public class 형성평가3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            int num = sc.nextInt();
            if (num < 0 || num > 100) {
                break;
            }
            sum += num;
            count++;
        }

        double avg = (count == 0) ? 0 : (double) sum / count;
        DecimalFormat df = new DecimalFormat("0.0");

        System.out.println("sum : " + sum);
        System.out.println("avg : " + df.format(avg));
    }
}
