package java01.day.day05;

public class 왼쪽삼각형별찍기 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++){
            for(int j = 1; j <= i; j++) {  //i만큼 별을 찍으면서 포문을 돌려라
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
