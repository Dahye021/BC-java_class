package jungol.입력;

import java.util.Scanner;

public class 연습문제6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("당신의 나이는 몇 살입니까? ");
        int age = scanner.nextInt();

        System.out.println("당신의 나이는 " + age + "살이군요.");

        scanner.close();
    }
}
