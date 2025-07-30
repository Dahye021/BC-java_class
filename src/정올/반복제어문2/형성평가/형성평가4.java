package java01.day.정올.반복제어문2.형성평가;

import java.util.Scanner;

public class 형성평가4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i ++){
            sum += sc.nextInt();
        }
        double average = (double) sum / n;

        System.out.printf("%.2f", average);
    }
}
