package 과제;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;

public class BoardMain {
    private static List<Board> boards = new ArrayList<>();
    private static int sequence = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("메인 메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit");
            System.out.print("메뉴 선택: ");
            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1 -> createBoard(sc);
                case 2 -> readBoardList();
                case 3 -> clearBoards();
                case 4 -> {
                    System.out.println("프로그램 종료");
                    sc.close();
                    return;
                }
                default -> System.out.println("잘못된 선택입니다.");
            }
        }
    }

    // 📌 게시물 생성
    private static void createBoard(Scanner sc) {
        System.out.println("[새 게시물 입력]");
        System.out.print("제목: ");
        String title = sc.nextLine();
        System.out.print("내용: ");
        String content = sc.nextLine();
        System.out.print("작성자: ");
        String writer = sc.nextLine();

        System.out.println("보조 메뉴: 1.Ok | 2.Cancel");
        System.out.print("메뉴 선택: ");
        int subMenu = Integer.parseInt(sc.nextLine());

        if (subMenu == 1) {
            Board board = new Board(sequence++, title, content, writer, LocalDate.now());
            boards.add(board);
            System.out.println("게시물이 저장되었습니다.");
        } else {
            System.out.println("게시물 작성이 취소되었습니다.");
        }
    }

    // 📌 게시물 목록 조회
    private static void readBoardList() {
        System.out.println("[게시물 목록]");
        System.out.println("no\twriter\tdate\ttitle");
        for (int i = boards.size() - 1; i >= 0; i--) {  // 최신 글부터 표시
            Board b = boards.get(i);
            System.out.printf("%d\t%s\t%s\t%s\n",
                    b.getNo(), b.getWriter(), b.getDate(), b.getTitle());
        }
    }

    // 📌 게시판 전체 삭제
    private static void clearBoards() {
        boards.clear();
        System.out.println("모든 게시물이 삭제되었습니다.");
    }
}
