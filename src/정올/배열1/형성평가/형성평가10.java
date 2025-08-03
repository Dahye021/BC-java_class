package 정올.배열1.형성평가;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 형성평가10 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n = in.nextInt();
        Integer[] scores = new Integer[n];

        for (int i = 0; i < n; i++) {
            scores[i] = in.nextInt();
        }

        Arrays.sort(scores, Collections.reverseOrder());

        for (int score : scores) {
            System.out.println(score);
        }

        in.close();
    }
}
