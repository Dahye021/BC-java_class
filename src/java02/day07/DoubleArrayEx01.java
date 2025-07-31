package java02.day07;

public class DoubleArrayEx01 {
    public static void main(String[] args) {
        //학생 3명의 국어, 영어, 수학 점수를 관리하는 이차원 배열을 만드세요
        int[][] scores = new int[3][3];
        //1번학생의 국어 : 90 영어:50 수학:80을 저장하고 출력
        scores[0][0] = 90;
        scores[0][1] = 50;
        scores[0][2] = 80;
        //2번 학생의
        scores[1][0] = 80;
        scores[1][1] = 100;
        scores[1][2] = 90;
        //3번 학생의
        scores[2][0] = 100;
        scores[2][1] = 90;
        scores[2][2] = 90;

        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            System.out.print((i + 1) + "번 학생\t");

            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(scores[i][j] + "\t");
                sum += scores[i][j];
            }
            double avg = sum / 3.0;
            System.out.print(sum + "\t");
            System.out.printf("%.2f\n", avg);
        }
    }
}
