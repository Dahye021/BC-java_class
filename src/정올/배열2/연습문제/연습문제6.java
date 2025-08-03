package 정올.배열2.연습문제;

import java.util.Scanner;

public class 연습문제6 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] scores = new int[3][3];
        int[] sumSubject = new int[3]; // 국어, 영어, 수학 과목별 합계
        int[] sumStudent = new int[3]; // 학생별 총점
        int totalSum = 0;

        for (int i = 0; i < 3; i++) {
            // 학생 i 점수 입력 받기
            for (int j = 0; j < 3; j++) {
                scores[i][j] = in.nextInt();
                sumSubject[j] += scores[i][j];
                sumStudent[i] += scores[i][j];
                totalSum += scores[i][j];
            }
        }

        System.out.println("     국어 영어 수학 총점");
        for (int i = 0; i < 3; i++) {
            System.out.printf(" %d번 %3d %3d %3d %4d\n",
                    i + 1, scores[i][0], scores[i][1], scores[i][2], sumStudent[i]);
        }
        System.out.printf("합계 %3d %3d %3d %4d\n",
                sumSubject[0], sumSubject[1], sumSubject[2], totalSum);

        in.close();
    }

}
