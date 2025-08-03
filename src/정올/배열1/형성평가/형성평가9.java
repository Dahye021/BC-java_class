package 정올.배열1.형성평가;

import java.util.Scanner;

public class 형성평가9 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[100];
        int count = 0;

        while (count < 100) {
            int num = in.nextInt();
            if (num == 0) break;
            arr[count++] = num;
        }

        System.out.println(count);

        for (int i = 0; i < count; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print((arr[i] / 2) + " ");
            } else {
                System.out.print((arr[i] * 2) + " ");
            }
        }

        in.close();
    }
}
