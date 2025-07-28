package 정올.입력;

import java.util.Scanner;

public class 입력연습문제8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("키를 입력하세요.");
        int num = scanner.nextInt();

        System.out.println("몸무게를 입력하세요.");
        int num2 = scanner.nextInt();
        scanner.nextLine(); //nextInt() 호출 후 이름 입력 건너뛰어지는 현상으로 인해 한번 더 호출

        System.out.println("이름을 입력하세요.");
        String name = scanner.nextLine();


        System.out.println("키 =" + num);
        System.out.println("몸무게 =" + num2);
        System.out.println("이름 =" + name);

        scanner.close();
    }
}
