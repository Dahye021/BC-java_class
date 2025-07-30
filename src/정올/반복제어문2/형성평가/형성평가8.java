package java01.day.정올.반복제어문2.형성평가;

public class 형성평가8 {
    public static void main(String[] args) {
        int row = 3;
        int col = 4;

        for(int i = 1; i <= row; i++){

            for(int j = 1; j <= col; j++){
                System.out.print(i*j+" ");
            }
            System.out.println();
        }

    }
}
