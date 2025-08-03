package 정올.배열1.형성평가;

import java.util.Scanner;

public class 형성평가7 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int count = 0;

        while (count < 100) {
            int num = in.nextInt();
            if (num == 999) break;
            if (num > 999 || num < -999) continue;
            if (num > max) max = num;
            if (num < min) min = num;
            count++;
        }

        System.out.println("max : " + max);
        System.out.println("min : " + min);

        in.close();
    }
}
