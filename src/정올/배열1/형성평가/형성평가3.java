package 정올.배열1.형성평가;

import java.util.Scanner;

public class 형성평가3 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int odd = 0;
        int even = 0;
        for (int i = 0; i < 10; i++) {
            int num = in.nextInt();
            if ((i + 1) % 2 == 1) {
                odd += num;
            } else {
                even += num;
            }
        }
        System.out.println("odd : " + odd);
        System.out.println("even : " + even);
        in.close();
    }
}
