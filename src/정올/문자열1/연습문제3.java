package 정올.문자열1;

import java.util.Scanner;

public class 연습문제3 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String str = "jungol olympiad";

        int [] indices = new int[5];
        for (int i = 0; i < 5; i++){
            indices[i] = in.nextInt();
        }
        for (int i = 0; i < 5; i++){
            System.out.print(str.charAt(indices[i]));
        }
    }
}
