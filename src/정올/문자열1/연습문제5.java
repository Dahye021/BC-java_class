package 정올.문자열1;

public class 연습문제5 {
    public static void main(String[] args) {
        char[] message = {'우','리','나','라',' ','대','한','민','국','!'};

        for (char ch : message) {
            System.out.print(ch);
        }
        System.out.println();
        System.out.println("위 문자열의 길이는 "+message.length + "입니다.");
    }
}
