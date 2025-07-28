package 정올.연산자.연습문제;

public class 연습문제8 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 2;

        int result = (a == b || b == 0) ? 1 : 0;
        int result1 = (a < b && b > 0) ? 1 : 0;
        int result2 = (a != 0 && b == 1) ? 1 : 0;
        int result3 = (!(a == b)) ? 1 : 0; //여기서 !는 결과값을 바꿔줌 그렇기 때문에 true출력이 가능함

        System.out.printf("%d %d %d %d", result, result1, result2, result3);
    }
}
