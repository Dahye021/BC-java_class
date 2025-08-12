package javabasic_02.과제.문자열.문자열03.E01;

public class FindNumbers {

    public static void main(String[] args) {
        FindNumbers fn = new FindNumbers();

        long number = 228754462;
        System.out.println("입력 숫자 = " + number);
        System.out.println("2 횟수 => " + fn.countNumber(number, 2)); // 3 리턴
        System.out.println("4 횟수 => " + fn.countNumber(number, 4)); // 2 리턴
    }

    public int countNumber(long number, int i) {
        int count = 0;

        while (number > 0) {
            int digit = (int)(number % 10); // 마지막 자리 숫자
            if (digit == i) {
                count++;
            }
            number /= 10; // 다음 자리 이동
        }

        return count;
    }
}
