package 과제;

import java.util.*;

public class BoardExample {
    private List<Board> boardList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // 초기 게시물 추가
    public BoardExample() {
        boardList.add(new Board(1, "봄의 정원", "내용1", "winter", new Date(124, 0, 2)));
        boardList.add(new Board(2, "크리스마스", "내용2", "winter", new Date(124, 0, 1)));
        boardList.add(new Board(3, "눈 오는 날", "내용3", "winter", new Date(124, 0, 1)));
    }

    public static void main(String[] args) {
        BoardExample boardExample = new BoardExample();
        boardExample.list();
    }

    public void list() {
        System.out.println("[게시물 목록]");
        System.out.println("no\twriter\tdate\t\ttitle");

        for (Board b : boardList) {
            System.out.printf("%d\t%s\t%tF\t%s%n",
                    b.getBno(), b.getBwriter(), b.getBdate(), b.getBtitle());
        }
        mainMenu();
    }

    public void mainMenu() {
        System.out.println();
        System.out.println("메인 메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit");
        System.out.print("메뉴 선택: ");
        int menu = Integer.parseInt(scanner.nextLine());

        switch (menu) {
            case 1 -> create();
            case 2 -> read();
            case 3 -> clear();
            case 4 -> exit();
            default -> {
                System.out.println("잘못된 입력입니다.");
                mainMenu();
            }
        }
    }

    public void create() {
        System.out.println("\n*** create() 메소드 실행됨");
        list();
    }

    public void read() {
        System.out.println("\n*** read() 메소드 실행됨");
        list();
    }

    public void clear() {
        System.out.println("\n*** clear() 메소드 실행됨");
        list();
    }

    public void exit() {
        System.out.println("\n*** exit() 메소드 실행됨");
        System.exit(0);
    }
}
