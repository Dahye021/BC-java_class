package 정올.배열1.형성평가;

import java.util.Scanner;

public class 형성평가8 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        while (count < 100) {
            int num = in.nextInt();
            if (num == 0) break;
            if (num % 5 == 0) {
                count++;
                sum += num;
            }
        }

        double avg = count == 0 ? 0 : (double) sum / count;
        System.out.println("Multiples of 5 : " + count);
        System.out.println("sum : " + sum);
        System.out.printf("avg : %.1f\n", avg);

        in.close();
    }
}
