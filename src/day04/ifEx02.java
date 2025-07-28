package day04;

public class ifEx02 {
    public static void main(String[] args) {
        // score 변수에 93 점을 저장한다.
         int score = 80;

         if(score >= 90 ){
             System.out.println("점수가 90점 이상입니다.");
             System.out.println("A");
         }
         else {
             System.out.println("Fail");
         }

         if (score < 90) {
             System.out.println("Fail");
         }

        // 현재 score 변수의 값이 90점 이상이면 A
        //  90점 미만이면 Fail  출력하시오


    }
}
