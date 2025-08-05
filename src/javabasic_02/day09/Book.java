package javabasic_03.day09;

public class Book {
    private String isbn;
    private String title;
    private int price;

    public Book(String isbn, String title, int price) {
        this.isbn = isbn;
        this.title = title;
        this.price = price;
    }

    public String getIsbn() { return isbn; }
    public String getTitle() { return title; }
    public int getPrice() { return price; }

    @Override
    public String toString() {
        return "[" + isbn + "] " + title + " - " + price + "원";
    }
}
