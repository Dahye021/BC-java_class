package javabasic_01.day.day03;

public class OperatorEx05 {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;

        int result1 = ++x + 10; //(x = x+1) + 10 ==> 12
        System.out.println(result1);

        int result2 = y++ + 10;
        System.out.println(result2 + " " + y);

        System.out.println(y++ + 10);

    }
}
