package java01.day.정올.반복제어문2.자가진단;

import java.util.Scanner;

public class 자가진단1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char ch = in.next().charAt(0);

        for (int i = 1; i <= 20; i++){
             System.out.println(ch);
        }


    }
}