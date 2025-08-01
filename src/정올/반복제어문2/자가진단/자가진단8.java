package 정올.반복제어문2.자가진단;

public class 자가진단8 {
    public static void main(String[] args) {
        for (int dan = 2; dan <= 4; dan++) {
            for (int i = 1; i <= 5; i++) {

                System.out.printf("%d * %d = %2d   ", dan, i, dan * i);
            }
            System.out.println(); // 각 단마다 줄 바꿈
        }
    }
}
