package 나홀로_연습.연산자.연습문제;

public class 연습문제7 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 2;

        int co1 = (a != 0) && (b != 0) ? 1 : 0;
        int co2 = (a != 0) || (b != 0) ? 1 : 0;
        int co3 = (b != 0) && (c != 0) ? 1 : 0;
        int co4 = (a == 0) ? 1 : 0;

        System.out.printf("%d %d %d %d", co1, co2, co3, co4);
    }
}
