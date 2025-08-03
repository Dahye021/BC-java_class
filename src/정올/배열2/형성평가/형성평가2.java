package 정올.배열2.형성평가;

import java.util.Scanner;

public class 형성평가2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] scoreCounts = new int[11]; // 0~10 구간, 100점은 10번 인덱스

        while (true) {
            int score = sc.nextInt();
            if (score == 0) break;
            int index = score / 10;
            if (score == 100) index = 10;
            scoreCounts[index]++;
        }

        for (int i = 10; i >= 0; i--) {
            if (scoreCounts[i] > 0) {
                System.out.println(i * 10 + " : " + scoreCounts[i] + " person");
            }
        }

        sc.close();
    }
}
