package 정올.배열1.연습문제;

import java.util.Scanner;

public class 연습문제7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] num = new int[10];
        int maxEven = Integer.MIN_VALUE;
        int minOdd = Integer.MAX_VALUE;

        for (int i = 0; i < 10; i++){
            num[i] = in.nextInt();

            if (num[i] % 2 == 0) {
                if (num[i] > maxEven) {
                    maxEven = num[i];
                }
            }else {
                if (num[i] < minOdd) {
                    minOdd = num[i];
                }
            }
        }
        System.out.println(minOdd + " " + maxEven);
    }
}
