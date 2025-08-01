package javabasic_01.day.정올.반복제어문1.연습문제;

public class 연습문제1 {
    public static void main(String[] args) {
        for (char c = 'A'; c <= 'Z'; c++ ){  //char 은 문자를 저장하는 변수, A부터Z까지 유니코드기준으로 순서가 정해져있음
            System.out.print(c + " ");
        }
    }
}
