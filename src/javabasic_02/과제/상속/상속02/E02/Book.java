package javabasic_02.과제.상속.상속02.E02;

public class Book {
    private String title;
    private int price;

    // 기본 생성자
    public Book() {}

    // 모든 멤버변수를 초기화하는 생성자
    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    // setter & getter
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}