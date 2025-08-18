package BookMarket;

import java.util.Scanner;
import java.io.*;

public class Welcome {
	static final int NUM_BOOK = 100;
	static final int NUM_ITEM = 7;
	static User mUser;
	static Book[] mBooks = new Book[NUM_BOOK];
	static int bookCount;
	static Cart cart = new Cart(NUM_BOOK);

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("당신의 이름을 입력하세요 : ");
		String userName = input.next();
		System.out.print("연락처를 입력하세요 : ");
		int userMobile = input.nextInt();
		mUser = new User(userName, userMobile);

		bookCount = totalFileToBookList();
		setFileToBookList();

		boolean quit = false;
		while (!quit) {
			System.out.println("***********************************************");
			System.out.println("\tWelcome to Shopping Mall");
			System.out.println("\tWelcome to Book Market!");
			menuIntroduction();
			System.out.print("메뉴 번호를 선택해주세요 ");
			int n = input.nextInt();
			if (n < 1 || n > 9) System.out.println("1부터 9까지의 숫자를 입력하세요.");
			else switch (n) {
				case 1: menuGuestInfo(); break;
				case 2: cart.printBookList(mBooks); break;
				case 3: menuCartClear(); break;
				case 4: menuCartAddItem(); break;
				case 5: System.out.println("5. 장바구니의 항목 수량 줄이기"); break;
				case 6: menuCartRemoveItem(); break;
				case 7: System.out.println("7. 영수증 표시하기"); break;
				case 8: System.out.println("8. 종료"); quit = true; break;
				case 9: menuAdminLogin(); break;
			}
		}
	}

	public static void menuIntroduction() {
		System.out.println("***********************************************");
		System.out.println(" 1. 고객 정보 확인하기 \t4. 바구니에 항목 추가하기");
		System.out.println(" 2. 장바구니 상품 목록 보기 \t5. 장바구니의 항목 수량 줄이기");
		System.out.println(" 3. 장바구니 비우기 \t6. 장바구니의 항목 삭제하기");
		System.out.println(" 7. 영수증 표시하기 \t8. 종료");
		System.out.println(" 9. 관리자 로그인");
		System.out.println("***********************************************");
	}

	public static void menuGuestInfo() {
		System.out.println("현재 고객 정보 : ");
		System.out.println("이름 " + mUser.getName() + "   연락처 " + mUser.getPhone());
	}

	public static int totalFileToBookList() {
		int count = 0;
		try (BufferedReader br = new BufferedReader(new FileReader("book.txt"))) {
			while (br.readLine() != null) count++;
		} catch (Exception e) { e.printStackTrace(); }
		return count / NUM_ITEM;
	}

	public static void setFileToBookList() {
		try (BufferedReader br = new BufferedReader(new FileReader("book.txt"))) {
			String line;
			int index = 0;
			while ((line = br.readLine()) != null) {
				String[] info = new String[NUM_ITEM];
				info[0] = line;
				for (int i = 1; i < NUM_ITEM; i++) info[i] = br.readLine();
				mBooks[index++] = new Book(info);
			}
		} catch (Exception e) { e.printStackTrace(); }
	}

	public static void menuCartAddItem() {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < bookCount; i++) {
			String[] b = mBooks[i].toArray();
			for (int j = 0; j < NUM_ITEM; j++) System.out.print(b[j] + " | ");
			System.out.println();
		}

		System.out.print("장바구니에 추가할 도서의 ID를 입력하세요 : ");
		String id = input.nextLine();
		for (int i = 0; i < bookCount; i++) {
			if (mBooks[i].getId().equals(id)) {
				if (!cart.isCartInBook(id)) cart.insertBook(mBooks[i]);
				System.out.println(id + " 도서가 장바구니에 추가되었습니다.");
				return;
			}
		}
		System.out.println("입력한 ID가 존재하지 않습니다.");
	}

	public static void menuCartClear() { cart.deleteBook(); System.out.println("장바구니를 비웠습니다."); }
	public static void menuCartRemoveItem() {
		Scanner input = new Scanner(System.in);
		System.out.print("삭제할 장바구니 순번 입력 : ");
		int idx = input.nextInt();
		cart.removeCart(idx - 1);
		System.out.println("장바구니 항목이 삭제되었습니다.");
	}

	public static void menuAdminLogin() {
		Scanner input = new Scanner(System.in);
		System.out.print("아이디 : ");
		String adminId = input.next();
		System.out.print("비밀번호 : ");
		String adminPW = input.next();
		Admin admin = new Admin(mUser.getName(), mUser.getPhone());
		if (adminId.equals(admin.getId()) && adminPW.equals(admin.getPassword())) {
			System.out.println("관리자 인증 완료");
			System.out.println("새로운 도서 정보를 입력하세요.");
			String[] newBook = new String[NUM_ITEM];
			input.nextLine(); // 버퍼 비우기
			System.out.print("도서ID : "); newBook[0] = input.nextLine();
			System.out.print("제목 : "); newBook[1] = input.nextLine();
			System.out.print("가격 : "); newBook[2] = input.nextLine();
			System.out.print("저자 : "); newBook[3] = input.nextLine();
			System.out.print("설명 : "); newBook[4] = input.nextLine();
			System.out.print("카테고리 : "); newBook[5] = input.nextLine();
			System.out.print("출판일 : "); newBook[6] = input.nextLine();
			mBooks[bookCount++] = new Book(newBook);

			// book.txt 저장
			try (BufferedWriter bw = new BufferedWriter(new FileWriter("book.txt", true))) {
				for (int i = 0; i < NUM_ITEM; i++) bw.write(newBook[i] + "\n");
			} catch (Exception e) { e.printStackTrace(); }
			System.out.println("도서가 추가되었습니다.");
		} else System.out.println("관리자 정보가 일치하지 않습니다.");
	}
}
