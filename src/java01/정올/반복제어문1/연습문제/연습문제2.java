package java01.day.정올.반복제어문1.연습문제;

public class 연습문제2 {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        while (num <= 10) { //num이 10보다 크거나 같아질때 까지 반복
            sum += num;     // sum = sum + num
            num++;          // num을 1씩 증가시킨다 그래서 다시 위로 가서
        }
        System.out.println("1부터 10까지의 합 = " + sum);
        System.out.println("while문이 끝난 후의 num의 값 = " + num);
    }
}
