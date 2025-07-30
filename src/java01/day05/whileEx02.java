package java01.day.day05;

public class whileEx02 {
    public static void main(String[] args) {
        int loop = 1;
        int sum = 0;

        while (loop <= 100){
            sum += loop;
            loop += 1;
        }
        System.out.println("1부터 100까지의 합: " + sum);
    }
}
