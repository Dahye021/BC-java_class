package BookMarket;

public class Cart implements CartInterface {
    private Book[] cartItems;
    private int count;

    public Cart(int size) {
        cartItems = new Book[size];
        count = 0;
    }

    @Override
    public void printBookList(Book[] p) {
        System.out.println("---------------------------------------");
        System.out.println("    도서ID \t|     수량 \t|      합계");
        for (int i = 0; i < count; i++) {
            int total = Integer.parseInt(cartItems[i].getPrice());
            System.out.println("    " + cartItems[i].getId() + " \t| 1 \t| " + total);
        }
        System.out.println("---------------------------------------");
    }

    @Override
    public boolean isCartInBook(String id) {
        for (int i = 0; i < count; i++) {
            if (cartItems[i].getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void insertBook(Book p) {
        if (!isCartInBook(p.getId()) && count < cartItems.length) {
            cartItems[count++] = p;
        }
    }

    @Override
    public void removeCart(int numId) {
        if (numId >= 0 && numId < count) {
            for (int i = numId; i < count - 1; i++) {
                cartItems[i] = cartItems[i + 1];
            }
            cartItems[--count] = null;
        }
    }

    @Override
    public void deleteBook() {
        for (int i = 0; i < count; i++) {
            cartItems[i] = null;
        }
        count = 0;
    }

    public int getCount() { return count; }
}
