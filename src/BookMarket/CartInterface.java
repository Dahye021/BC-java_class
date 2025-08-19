package BookMarket;

import BookMarket.Book;

public interface CartInterface {
    void printBookList(Book[] books);
    boolean isCartInBook(String bookID);
    void insertBook(Book book);
    void removeCart(int numId);
    void deleteBook();
}