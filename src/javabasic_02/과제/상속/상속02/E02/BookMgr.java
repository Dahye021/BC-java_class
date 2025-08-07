package javabasic_02.과제.상속.상속02.E02;

public class BookMgr {
    private Book[] booklist;

    // 생성자
    public BookMgr(Book[] booklist) {
        this.booklist = booklist;
    }

    // 책 제목만 출력
    public void printBooklist() {
        for (Book book : booklist) {
            System.out.println(book.getTitle());
        }
    }

    // 책 가격 총합 출력
    public void printTotalPrice() {
        int total = 0;
        for (Book book : booklist) {
            total += book.getPrice();
        }
        System.out.println("전체 책 가격의 합 : " + total);
    }
}