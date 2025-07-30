package java01.day.day05;

public class whileEx01 {
    public static void main(String[] args) {
        //1부터 10까지 출력하는 프로그램 while로 작성
        int loop = 1;
        while (loop <= 10){
            System.out.print(loop + " ");
            loop += 1;      //loop++;       loop = loop +1  //다 같은 의미
        }
    }
}
