package 정올.배열1.연습문제;

public class 연습문제2 {
    public static void main(String[] args) {
        char[] alphabet = new char[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char) ('A' + i);
        }
        for (int i = 25; i >= 0; i--){
            System.out.println(alphabet[i]);
            if (i > 0){
                System.out.print(" ");
            }
        }
    }
}
