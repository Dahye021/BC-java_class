package 정올.배열1.형성평가;

import java.util.Scanner;

public class 형성평가4 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[100];
        int count = 0;

        while (count < 100) {
            int num = in.nextInt();
            if (num == -1) break;
            arr[count] = num;
            count++;
        }

        int start = count >= 3 ? count - 3 : 0;
        for (int i = start; i < count; i++) {
            System.out.print(arr[i] + " ");
        }

        in.close();
    }
}
