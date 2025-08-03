package 정올.문자열2.연습문제;


import java.text.DecimalFormat;
import java.util.Scanner;

public class 연습문제10 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String intStr1 = sc.next();
        String intStr2 = sc.next();
        int intNum1 = Integer.parseInt(intStr1);
        int intNum2 = Integer.parseInt(intStr2);
        int intSum = intNum1 + intNum2;

        // 실수형 문자열 입력 및 합 계산
        String floatStr1 = sc.next();
        String floatStr2 = sc.next();
        double doubleNum1 = Double.parseDouble(floatStr1);
        double doubleNum2 = Double.parseDouble(floatStr2);
        double doubleSum = doubleNum1 + doubleNum2;

        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println(intNum1 + " + " + intNum2 + " = " + intSum);
        System.out.println(df.format(doubleNum1) + " + " + df.format(doubleNum2) + " = " + df.format(doubleSum));

        sc.close();
    }
}
