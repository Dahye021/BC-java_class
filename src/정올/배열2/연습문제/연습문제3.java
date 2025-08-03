package 정올.배열2.연습문제;


public class 연습문제3 {
    public static long fibonacci(int n) {
        if (n == 1 || n == 2) return 1;
        long a = 1, b = 1, c = 0;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
    public static void main(String[] args) {
        int[] targets = {10, 20, 30, 40};
        for (int n : targets) {
            System.out.println("피보나치 수열 " + n + "항 : " + fibonacci(n));
        }
    }

}
