package 정올.연산자.연습문제;

public class 연습문제3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        System.out.printf("최소 값 a = %d, b = %d\n", a, b++);
        System.out.println();
        System.out.printf("a++ = %d, ++b = %d\n", a++, b);
        System.out.printf("실행후 a = %d, b = %d\n", a, --b);
        System.out.println();
        System.out.printf("a-- = %d, --b = %d\n", a--, b);
        System.out.printf("실행후 a = %d, b = %d", a, b);
    }
}
