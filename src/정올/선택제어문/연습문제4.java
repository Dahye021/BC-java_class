package 정올.선택제어문;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 연습문제4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {

            System.out.print("점수를 입력하세요. ");
            int n1 = sc.nextInt();
            char n2 = 0;

            if ((n1 >= 90) && (n1 <= 100)) n2 = 'A';
            else if ((n1 >= 80) && (n1 <= 90)) n2 = 'B';
            else if ((n1 >= 70) && (n1 <= 80)) n2 = 'C';
            else if ((n1 >= 60) && (n1 <= 70)) n2 = 'D';
            else if ((n1 >= 0) && (n1 <= 60)) n2 = 'F';
            else System.out.println("0부터 100사이의 숫자를 입력해 주세요.");

            System.out.println(n2);
        }
        catch (InputMismatchException e) {
            System.out.println("숫자만 입력이 가능합니다.");
        }
    }
}
