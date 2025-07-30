package java01.day.day05;

public class 오늘쪽역삼각형별찍기 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++){
            for (int j =1; j <= i; j++){
                System.out.print("_");
            }
            for (int star = 0; star < 5-i; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
