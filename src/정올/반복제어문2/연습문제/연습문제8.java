package 정올.반복제어문2.연습문제;

public class 연습문제8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int dan = 2; dan <= 4; dan++) {
                // 출력 포맷 맞추기 위해 결과 자리 2칸 확보 (오른쪽 정렬)
                System.out.printf("%d * %d = %2d   ", dan, i, dan * i);
            }
            System.out.println();
        }
    }
}
