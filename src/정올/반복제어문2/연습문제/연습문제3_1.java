package javabasic_01.day.정올.반복제어문2;

import java.util.stream.IntStream;

public class 연습문제3_1 {
    public static void main(String[] args) {
        for(int i = 1 ; i <= 20 ; i++){
            if (i%2 ==1) System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("===================");

        IntStream intStream = IntStream.rangeClosed(1,20);
        intStream.filter(n-> n%2 == 1).forEach(e-> System.out.println(e+ " "));
    }
}
