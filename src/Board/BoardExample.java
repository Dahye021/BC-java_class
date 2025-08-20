package Board;

import java.util.Scanner;

public class BoardExample {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        BoardExample borads1 = new BoardExample();
        borads1.list();

    }

    public void list() {
        String menu = """
               [게시물 목록]
               ---------------------------------------------------------------------
               no    writer      date        title
               ---------------------------------------------------------------------
               1     writer      2024.01.02  게시판에 오신 것을 환영합니다.
               2     writer      2024.01.01  올 겨울은 많이 춥습니다.
               """;
        System.out.println(menu);
        mainMenu();
    }
    public void mainMenu(){
        String menu = """
                --------------------------------------------------------------------
                메인 메뉴 : 1.Create | 2. Read | 3. Clear | 4. Exit
                """;
        System.out.println(menu);

        boolean stop = false;
        while (!stop) {
            System.out.print("메뉴 선택 : ");
            String choice = in.nextLine();

            switch (choice) {
                case "1" -> System.out.println("**** Create() 메소드 실행");
                case "2" -> System.out.println("**** Read() 메소드 실행");
                case "3" -> System.out.println("**** Clear() 메소드 실행");
                case "4" -> {
                    System.out.println("**** Exit() 메소드 실행");
                    stop = true;
                    break;
                }
            }
        }
    }
}