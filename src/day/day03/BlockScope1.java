package day.day03;

public class BlockScope1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        for ( i = 1; i <= 5; i++ ) {
            sum = sum + i;
            System.out.println(i + " " + sum);
        }

    }
}
