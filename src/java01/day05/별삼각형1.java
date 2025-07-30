package java01.day.정올;

import java.util.Scanner;

public class 별삼각형1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = n; i <= m; i++){
            for (int j = m; j <= i; j++){
                System.out.println("*");
            }
        }
    }
}
