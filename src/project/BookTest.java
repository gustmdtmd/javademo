package project;

import java.util.ArrayList;
import java.util.Scanner;

public class BookTest {

	private static ArrayList<Book> booklist = new ArrayList<Book>();
	private static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {

		boolean run = true;
		while (run) {
			System.out.println("=================================================");
			System.out.println("1.책 등록 | 2.책 리스트 | 3.책 조회 | 4.책 삭제 | 5.종료");
			System.out.println("=================================================");
			System.out.println("번호 입력 => ");
			int selectNum = Integer.parseInt(s.next());

			switch (selectNum) {
			case 1:
				creatBook();
				break;

			case 2:
				bookList();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				deleteBook();
				break;
			default:
				run = false;
				System.out.println("프로그램을 종료합니다.");
				break;
			}// end switch
		} // end while

	}// end main()
	
	public static void creatBook() {
		System.out.println("===책 등록===");
		System.out.print("책 제목: ");
		String title = s.next();
		System.out.print("저자: ");
		String author = s.next();
		System.out.println("도서번호: ");
		int number = s.nextInt();
		
		Book b = new Book();
		b.setTitle(title);
		b.setAuthor(author);
		b.setNumber(number);
		booklist.add(b);
	}// end creatBook()
	
	public static void bookList() {
		System.out.println("===책 리스트===");
		for (int i = 0; i < booklist.size(); i++) {
			System.out.println(booklist.get(i).getTitle());
		}
	}// end booklist()

	public static void searchBook() {
		System.out.println("===책 검색===");
		System.out.println("책 제목: ");
		String title = s.next();
		
		boolean result = false;
		for (int i = 0; i < booklist.size(); i++) {
			Book book = booklist.get(i);
			if (book.getTitle().equals(title)) {
				result = true;
				System.out.println("책 제목: " + book.getTitle());
				System.out.println("저자: " + book.getAuthor());
				System.out.println("도서번호: " + book.getNumber());
			}
		}

		if (!result) {
			System.out.println("검색하신 책은 찾을 수 없습니다.");
		}
	}// end searchBook()

	public static void deleteBook() {
		System.out.println("===책 삭제===");
		System.out.println("책 제목: ");
		String title = s.next();
		boolean result = false;
		for (int i = 0; i < booklist.size(); i++) {
			Book book = booklist.get(i);
			if (book.getTitle().equals(title)) {
				result = true;
				booklist.remove(i);
				System.out.println("감색하신 책 정보가 삭제되었습니다.");
			}
		}
		
		if(!result) {
			System.out.println("검색하신 책은 찾을 수 없습니다.");
		}
	}// end deleteBook()
}// end class
