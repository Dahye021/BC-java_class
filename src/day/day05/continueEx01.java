package day.day05;

public class continueEx01 {
    //continue문은 반복문인 for, while, do-while 에서만 사용된다
    public static void main(String[] args) {
        //1부터 10사이의 수중 짝 수만 출력하고 홀수인 경우 스킵하고 반복으로 넘어가게 작성하세요

        for(int i = 1; i <= 10; i++){
            System.out.println("i =" + i);
            if(i % 2 != 0){
                continue; //홀수는 스킵

            }
            System.out.println("결과");
        }
    }
}
