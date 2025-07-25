package day.day03;

import java.util.Scanner;

public class OperatorEx04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("국어 점수를 입력하세요!");
        int kor = sc.nextInt();

        char grade = (kor > 90) ? 'A' : (kor>80)? 'B' : 'C' ;

        System.out.println(grade);

        if (kor > 90) {
            System.out.println('A');
        }
        else if (kor > 80){
            System.out.println('B');
        }
        else {
            System.out.println('C');
        }
    }
}
