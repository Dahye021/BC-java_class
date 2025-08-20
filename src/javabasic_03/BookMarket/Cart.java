package javabasic_03.BookMarket;

public class Cart implements CartInterface {
    public CartItem[] mCartItem = new CartItem[100];
    public int mCartCount = 0;

    @Override
    public void printBookList(Book[] books) {
        System.out.println("도서 목록:");
        for (Book b : books) {
            if(b != null)
                System.out.println(b.getBookID() + " | " + b.getTitle() + " | " + b.getPrice());
        }
    }

    @Override
    public boolean isCartInBook(String bookID) {
        for (int i = 0; i < mCartCount; i++) {
            if (mCartItem[i].getBook().getBookID().equals(bookID)) {
                mCartItem[i].setQuantity(mCartItem[i].getQuantity() + 1);
                return true;
            }
        }
        return false;
    }

    @Override
    public void insertBook(Book book) {
        mCartItem[mCartCount++] = new CartItem(book);
    }

    @Override
    public void removeCart(int numId) {
        if (numId < 0 || numId >= mCartCount) return;
        for (int i = numId; i < mCartCount - 1; i++) {
            mCartItem[i] = mCartItem[i + 1];
        }
        mCartCount--;
    }

    @Override
    public void deleteBook() {
        mCartCount = 0;
    }

    public void printCart() {
        System.out.println("---------------------------------------");
        System.out.println("순번 | 도서ID | 수량 | 합계");
        for (int i = 0; i < mCartCount; i++) {
            System.out.println(i + " | " + mCartItem[i].getBook().getBookID() + " | "
                    + mCartItem[i].getQuantity() + " | " + mCartItem[i].getTotalPrice());
        }
        System.out.println("---------------------------------------");
    }

    public int getTotalPrice() {
        int total = 0;
        for (int i = 0; i < mCartCount; i++) total += mCartItem[i].getTotalPrice();
        return total;
    }
}