package 정올.문자열2.연습문제;


import java.text.DecimalFormat;
import java.util.Scanner;

public class 연습문제11 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        StringBuilder intPart = new StringBuilder();
        StringBuilder fracPart = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            double num = sc.nextDouble();
            String formatted = df.format(num);  // 소수 둘째 자리까지 반올림하여 문자열로 변환

            String[] parts = formatted.split("\\."); // 정수부와 소수부 분리
            intPart.append(parts[0]);
            fracPart.append(parts[1]);
        }

        System.out.println(intPart);
        System.out.println(fracPart);

        sc.close();
    }
}
