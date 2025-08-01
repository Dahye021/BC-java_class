package 정올.반복제어문2.연습문제;

import java.text.DecimalFormat;
import java.util.Scanner;

public class 연습문제6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        int sum = 0;
        int count = 5;

        for (int i = 0; i < count; i++) {
            int score = sc.nextInt();
            sum += score;
        }

        double avg = (double) sum / count;

        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + df.format(avg));
    }
}
