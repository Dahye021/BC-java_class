package com.market.cart;

import com.market.bookitem.Book;

public interface CartInterface {
    void printBookList(Book[] books);
    boolean isCartInBook(String bookID);
    void insertBook(Book book);
    void removeCart(int numId);
    void deleteBook();
}
