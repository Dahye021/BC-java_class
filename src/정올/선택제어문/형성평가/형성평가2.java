package 정올.선택제어문.형성평가;

import java.util.Scanner;

public class 형성평가2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("zero");
        } else if (num > 0) {
            System.out.println("plus");
        } else {
            System.out.println("minus");
        }
    }
}
