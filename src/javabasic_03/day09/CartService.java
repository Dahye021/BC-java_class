package javabasic_03.day09;

import java.util.*;

public class CartService {
    private Map<String, CartItem> cart = new HashMap<>();
    private List<Book> bookList = new ArrayList<>();
    private String customerName;
    private String customerPhone;

    public CartService(String name, String phone) {
        this.customerName = name;
        this.customerPhone = phone;
        initBooks();
    }

    // 도서 초기화
    private void initBooks() {
        bookList.add(new Book("001", "자바의 정석", 25000));
        bookList.add(new Book("002", "스프링 입문", 30000));
        bookList.add(new Book("003", "자료구조", 27000));
    }

    public void menuGuestInfo() {
        System.out.println("고객 정보 확인");
        System.out.println("이름: " + customerName);
        System.out.println("연락처: " + customerPhone);
    }

    public void menuCartItemList() {
        System.out.println("장바구니 상품 목록:");
        if (cart.isEmpty()) {
            System.out.println("장바구니가 비어 있습니다.");
        } else {
            for (CartItem item : cart.values()) {
                System.out.println(item);
            }
        }
    }

    public void menuCartClear() {
        cart.clear();
        System.out.println("장바구니를 비웠습니다.");
    }

    public void menuCartAddItem(Scanner sc) {
        System.out.println("도서 목록:");
        for (Book b : bookList) {
            System.out.println(b);
        }

        System.out.print("추가할 도서의 ISBN을 입력하세요: ");
        String isbn = sc.nextLine();
        Book selected = null;
        for (Book b : bookList) {
            if (b.getIsbn().equals(isbn)) {
                selected = b;
                break;
            }
        }

        if (selected == null) {
            System.out.println("해당 ISBN의 도서가 없습니다.");
            return;
        }

        System.out.print("수량을 입력하세요: ");
        int qty = Integer.parseInt(sc.nextLine());

        if (cart.containsKey(isbn)) {
            cart.get(isbn).addQuantity(qty);
        } else {
            cart.put(isbn, new CartItem(selected, qty));
        }
        System.out.println("장바구니에 추가되었습니다.");
    }

    public void menuCartRemoveItemCount(Scanner sc) {
        System.out.print("수량을 줄일 도서의 ISBN 입력: ");
        String isbn = sc.nextLine();

        CartItem item = cart.get(isbn);
        if (item == null) {
            System.out.println("해당 도서가 장바구니에 없습니다.");
            return;
        }

        System.out.print("줄일 수량 입력: ");
        int qty = Integer.parseInt(sc.nextLine());

        if (item.getQuantity() <= qty) {
            cart.remove(isbn);
            System.out.println("도서를 장바구니에서 제거했습니다.");
        } else {
            item.subtractQuantity(qty);
            System.out.println("수량을 줄였습니다.");
        }
    }

    public void menuCartRemoveItem(Scanner sc) {
        System.out.print("삭제할 도서의 ISBN 입력: ");
        String isbn = sc.nextLine();
        if (cart.remove(isbn) != null) {
            System.out.println("항목이 삭제되었습니다.");
        } else {
            System.out.println("해당 도서가 장바구니에 없습니다.");
        }
    }

    public void menuCartBill() {
        int total = 0;
        System.out.println("영수증:");
        for (CartItem item : cart.values()) {
            System.out.println(item);
            total += item.getTotalPrice();
        }
        System.out.println("총 합계: " + total + "원");
    }

    public void menuExit() {
        System.out.println("이용해주셔서 감사합니다.");
    }
}
