package javabasic_01.day.day05;

import java.util.Scanner;

public class whileEx03 {
    public static void main(String[] args) {
        //키보드에서 "1" 입력했을때 속도 증가, "2"입력하면 속도 감소, "3"은 프로그램 종료
        
        //1. 입력기능
        Scanner sc = new Scanner(System.in);
        
        //2. 증감, 감소를 비교할 변수 선언
        boolean run = true;
        
        //3. 속도 값 조절 변수
        int speed = 0;
        
        while (run){
            System.out.println("-----------------------------------");
            System.out.println("1. 속도 증가 | 2. 속도 감소 | 3. 종료");
            System.out.println("-----------------------------------");
            System.out.println("선택하세요 : ");
            
            String stringNum = sc.nextLine();
            
            if (stringNum.equals("1")){
                speed ++;
                System.out.println("현재 속도 = "+speed);
                
            }else if (stringNum.equals("2")) {
                speed --;
                System.out.println("현재 속도 = "+speed);
            }
            else if (stringNum.equals("3")) {
                run = false;
                System.out.println("엔진 끄기");
            }

        }
        System.out.println("프로그램 종료");
        
    }
}
