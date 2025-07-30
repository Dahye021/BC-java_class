package jungol.입력;

public class 입력연습문제4 {
    public static void main(String[] args) {
        int radius = 5;
        double pi = 3.14; //실수형 자료형 소수점 값 저장
        double 입력연습문제4 = 2 * radius * pi;
        double area = radius * radius * pi;

        System.out.printf("원주 = %d * 2 * %.6f = %.6f\n", radius, pi, 입력연습문제4);
        System.out.printf("넓이 = %d * %d * %.6f = %.6f\n", radius, radius, pi, area);
    }
}
