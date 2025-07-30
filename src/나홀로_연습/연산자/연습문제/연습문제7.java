package java01.day.정올.연산자.연습문제;

public class 연습문제7 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 2;

        int result1 = (a != 0 && b != 0) ? 1 : 0; //&&(논리 AND 연산자) = 두 조건이 모두 true일 때만 결과가 true
        int result2 = (a != 0 || b != 0) ? 1 : 0; //||(논리 OR 연산자) = 두 조건 중 하나라도 true면 결과가 true
        int result3 = (b != 0 && c != 0) ? 1 : 0;
        int result4 = (!(a != 0)) ? 1 : 0;

        System.out.printf("%d %d %d %d", result1, result2, result3, result4);
    }
}
