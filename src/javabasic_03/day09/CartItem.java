package javabasic_03.day09;

public class CartItem {
    private Book book;
    private int quantity;

    public CartItem(Book book, int quantity) {
        this.book = book;
        this.quantity = quantity;
    }

    public Book getBook() { return book; }
    public int getQuantity() { return quantity; }

    public void addQuantity(int qty) {
        this.quantity += qty;
    }

    public void subtractQuantity(int qty) {
        this.quantity -= qty;
    }

    public int getTotalPrice() {
        return book.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return book.toString() + " | 수량: " + quantity + " | 합계: " + getTotalPrice() + "원";
    }
}
