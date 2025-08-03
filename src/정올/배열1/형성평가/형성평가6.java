package 정올.배열1.형성평가;

import java.util.Scanner;

public class 형성평가6 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        char[] arr = {'J', 'U', 'N', 'G', 'O', 'L'};
        char input = in.next().charAt(0);
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == input) {
                System.out.println(i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("none");
        }

        in.close();
    }
}
