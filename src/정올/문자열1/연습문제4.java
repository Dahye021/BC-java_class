package 정올.문자열1;

import java.util.Scanner;
import java.util.SplittableRandom;

public class 연습문제4 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String input = in.nextLine();

        System.out.println("입력받은 문자열의 길이는 " + input.length() + "입니다.");

        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }
    }
}
