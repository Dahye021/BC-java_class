package 정올.반복제어문2;

public class 연습문제2 {
    public static void main(String[] args) {
        /*
        아래는 연습문제2 풀이
        
        int ch = 65;

        for (int i = 1; i <= 26; i++){
            
            System.out.printf("%c", ch);
            ch = ch + 1;
        }
        */
        
        int total = 0; //누적합 결과 저장
        for (int i = 1; i<= 100; i++) {
            total = total + i;
        }
        System.out.println("1-100의 총합" + total);
    }
}
