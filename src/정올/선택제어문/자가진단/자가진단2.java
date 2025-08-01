package 정올.선택제어문.자가진단;

import java.util.Scanner;

public class 자가진단2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int height = sc.nextInt(); // 키 입력
        int weight = sc.nextInt(); // 몸무게 입력

        int obesityIndex = weight + 100 - height;

        System.out.println(obesityIndex);

        if (obesityIndex > 0) {
            System.out.println("Obesity");
        }
    }
}
