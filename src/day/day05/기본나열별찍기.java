package day.day05;

public class 기본나열별찍기 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
