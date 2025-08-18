package com.market.cart;

import com.market.bookitem.Book;

public class CartItem {
	private Book book;
	private int quantity;
	private int totalPrice;

	public CartItem(Book book) {
		this.book = book;
		this.quantity = 1;
		updateTotalPrice();
	}

	public Book getBook() { return book; }
	public int getQuantity() { return quantity; }
	public int getTotalPrice() { return totalPrice; }

	public void setQuantity(int quantity) {
		this.quantity = quantity;
		updateTotalPrice();
	}

	public void updateTotalPrice() {
		totalPrice = book.getPrice() * quantity;
	}
}
