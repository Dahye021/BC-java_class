package javabasic_02.day07.test.loop_array;

public class JavaBasic5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){ //줄 수
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
