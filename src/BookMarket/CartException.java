package BookMarket;

public class CartException extends Exception {
    public CartException() {
        super("장바구니 처리 중 오류가 발생했습니다.");
    }

    public CartException(String message) {
        super(message);
    }
}