package 정올.반복제어문2.연습문제;

public class 연습문제7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println();

        // 두 번째 패턴 출력
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
