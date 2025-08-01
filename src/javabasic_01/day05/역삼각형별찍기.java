package javabasic_01.day.day05;

public class 역삼각형별찍기 {
    public static void main(String[] args) {
        for(int i = 1; i <= 4; i++){
            for(int j = 4; j > 0; j--){
                if(i > j) {
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
