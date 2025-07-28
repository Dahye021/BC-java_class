package day.day01;

public class ex01 {

    public static void main(String[] args) {
        //3개의 정수를 10, 11,12를 더하여 결과를 출력
        int num1, num2, num3, sum; //정수형 변수 선언

        //각 변수에 값을 할당
        num1 = 10;
        num2 = 11;
        num3 = 12;

        //연산
        sum = num1 + num2 + num3;

        //출력
        System.out.println("10+11+12 = "+sum); //문자열이기 때문에 정수룰 변경해도 변경 안됨
        System.out.println(num1 + "+" + num2 + "+" + num3 + "=" + sum); //문자열 구분
        System.out.printf("%d + %d + %d + = %d" ,num1,num2,num3,sum); //순서대로 넣어서 출력
    }
}
