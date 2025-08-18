package com.market.main;

import com.market.member.*;
import com.market.bookitem.*;
import com.market.cart.*;
import java.util.Scanner;
import java.io.*;

public class Welcome {
	static final int MAX_BOOK = 100;
	static Book[] books = new Book[MAX_BOOK];
	static int bookCount = 0;

	static User mUser;
	static Cart cart = new Cart();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("당신의 이름을 입력하세요: ");
		String name = sc.next();
		System.out.print("연락처를 입력하세요: ");
		int phone = sc.nextInt();
		mUser = new User(name, phone);

		loadBooksFromFile();

		boolean quit = false;
		while (!quit) {
			printMenu();
			int choice = sc.nextInt();
			switch (choice) {
				case 1: printUserInfo(); break;
				case 2: cart.printCart(); break;
				case 3: cart.deleteBook(); break;
				case 4: menuAddToCart(); break;
				case 5: menuDecreaseQuantity(); break;
				case 6: menuRemoveCartItem(); break;
				case 7: menuPrintBill(); break;
				case 8: quit = true; break;
				case 9: menuAdminLogin(); break;
				default: System.out.println("1~9 숫자 입력"); break;
			}
		}
	}

	static void printMenu() {
		System.out.println("*****************************");
		System.out.println(" 1. 고객 정보 확인하기 \t4. 바구니에 항목 추가하기");
		System.out.println(" 2. 장바구니 상품 목록 보기 \t5. 장바구니의 항목 수량 줄이기");
		System.out.println(" 3. 장바구니 비우기 \t6. 장바구니의 항목 삭제하기");
		System.out.println(" 7. 영수증 표시하기 \t8. 종료");
		System.out.println(" 9. 관리자 로그인");
		System.out.println("*****************************");
		System.out.print("메뉴 번호를 선택해주세요: ");
	}

	static void printUserInfo() {
		System.out.println("현재 고객 정보: 이름 " + mUser.getName() + " 연락처 " + mUser.getPhone());
	}

	static void menuAddToCart() {
		for (int i = 0; i < bookCount; i++) {
			System.out.println(i + ". " + books[i].getBookID() + " | " + books[i].getTitle() + " | " + books[i].getPrice());
		}
		System.out.print("장바구니에 추가할 도서 번호: ");
		int idx = sc.nextInt();
		if (idx >= 0 && idx < bookCount) {
			if (!cart.isCartInBook(books[idx].getBookID()))
				cart.insertBook(books[idx]);
		}
	}

	static void menuDecreaseQuantity() {
		System.out.print("수량 줄일 항목 번호: ");
		int idx = sc.nextInt();
		if (idx >= 0 && idx < cart.mCartCount) {
			int q = cart.mCartItem[idx].getQuantity();
			if (q > 1) cart.mCartItem[idx].setQuantity(q - 1);
			else cart.removeCart(idx);
		}
	}

	static void menuRemoveCartItem() {
		System.out.print("삭제할 항목 번호: ");
		int idx = sc.nextInt();
		cart.removeCart(idx);
	}

	static void menuPrintBill() {
		System.out.print("배송지 입력: ");
		sc.nextLine(); // 개행 제거
		String addr = sc.nextLine();
		mUser.setAddress(addr);

		System.out.println("------ 영수증 ------");
		System.out.println("고객: " + mUser.getName());
		System.out.println("연락처: " + mUser.getPhone());
		System.out.println("배송지: " + mUser.getAddress());
		cart.printCart();
		System.out.println("총 합계: " + cart.getTotalPrice());
		System.out.println("------------------");
	}

	static void menuAdminLogin() {
		System.out.print("관리자 ID: ");
		String id = sc.next();
		System.out.print("비밀번호: ");
		String pw = sc.next();
		Admin admin = new Admin(mUser.getName(), mUser.getPhone());
		if (id.equals(admin.getId()) && pw.equals(admin.getPassword())) {
			System.out.println("관리자 로그인 성공");
			System.out.print("도서ID: "); String bookID = sc.next();
			sc.nextLine();
			System.out.print("제목: "); String title = sc.nextLine();
			System.out.print("가격: "); int price = sc.nextInt();
			sc.nextLine();
			System.out.print("저자: "); String author = sc.nextLine();
			System.out.print("설명: "); String desc = sc.nextLine();
			System.out.print("분류: "); String category = sc.nextLine();
			System.out.print("출판일: "); String pubDate = sc.nextLine();

			Book newBook = new Book(bookID, title, price, author, desc, category, pubDate);
			books[bookCount++] = newBook;
			saveBookToFile(newBook);
		} else System.out.println("관리자 정보가 일치하지 않습니다");
	}

	static void saveBookToFile(Book b) {
		try(FileWriter fw = new FileWriter("book.txt", true);
			BufferedWriter bw = new BufferedWriter(fw)) {
			bw.write(b.getBookID() + "," + b.getTitle() + "," + b.getPrice() + "," +
					b.getAuthor() + "," + b.getDesc() + "," + b.getCategory() + "," + b.getPubDate());
			bw.newLine();
		} catch(Exception e){ e.printStackTrace(); }
	}

	static void loadBooksFromFile() {
		try (BufferedReader br = new BufferedReader(new FileReader("book.txt"))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] arr = line.split(",");
				if (arr.length == 7) {
					books[bookCount++] = new Book(arr[0], arr[1], Integer.parseInt(arr[2]), arr[3], arr[4], arr[5], arr[6]);
				}
			}
		} catch(Exception e){ e.printStackTrace(); }
	}
}
