package javabasic_03.day09;

import java.util.Scanner;

public class Example05 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("사용자 아이디를 입력해 주세요");
        String id = in.nextLine();
        System.out.println("비밀번호를 입력해 주세요");
        String pwd = in.nextLine();
        idPEPrint(id,pwd);
    }
    public static void idPEPrint (String id, String pw) {
        System.out.println("id : " + id +" " + "password : " + pw);
    }
}
