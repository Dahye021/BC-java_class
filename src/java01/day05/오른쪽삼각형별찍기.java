package java01.day.day05;

public class 오른쪽삼각형별찍기 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++){
            for (int j = 5; j > 0; j--){
                if (i < j){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
