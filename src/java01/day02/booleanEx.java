package day02;

public class booleanEx {
    public static void main(String[] args) {
        boolean stop = true;

        int x = 30;

        boolean result1 = (x == 20);
        boolean result2 = (x != 20);
        boolean result3 = (x > 0 && x < 30);
        boolean result4 = (x <= 0 || x >= 30);

        System.out.println("x의 값이 20인가? : " + result1);
        System.out.println("x의 값이 20이 아닌가? :" + result2);
        System.out.println("x의 값이 0보다 크고 30보다 작은가? :" + result3);
        System.out.println("x의 값이 0보다 적거나 30보다 크거나 같은가? :" + result4);
    }
}
    //int x = 30;
    //변수 x의 값이 20인가? 결과 result1에 저장
    //변수 x의 값이 20이 아닌가? 결과 result2 저장
    //변수 x의 값이 0보다 크고 30보다 작은가? 결과 result3 저장
    //변수 x의 값이 0보다 적거나 30보다 크거나 같은가? 결과 result4 저장

    //각 결과 출력
