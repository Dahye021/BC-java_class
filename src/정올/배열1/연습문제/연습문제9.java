package 정올.배열1.연습문제;
import java.util.Arrays;

public class 연습문제9 {
    public static void main(String[] args) {
        int[] arr = {95, 75, 85, 100, 50};

        Arrays.sort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
