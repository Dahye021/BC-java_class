package day.day04;

public class forEx02 {
    public static void main(String[] args) {
        int result = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;

        System.out.println(result);
        System.out.println("===============");
        result = 0; // 그동안 쌓여있던 값 초기화
        for (int i = 1; i <= 10 ; i++) {
            int result1 = 0;
            result1 += i;
        }

        System.out.println("for문을 이용한 합 : " + result);
    }
}
