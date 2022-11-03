package project_01;

import java.util.List;
import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {
		BookController bController = new BookController();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("=================================================");
		System.out.println("1.책 등록 | 2.책 리스트 | 3.책 조회 | 4.책 삭제 | 5.종료");
		System.out.println("=================================================");
		System.out.println("번호 입력 => ");
		int input = Integer.parseInt(sc.nextLine());
		
		if(input==1) {
			insertCall(bController, sc);
		}else if(input==2) {
			listCall(bController, sc);
		}else if(input==3) {
			searchCall(bController, sc);
		}else if(input==4) {
			deleteCall(bController, sc);
		}else if(input==5) {
			System.out.println("시스템을 종료합니다.");
			System.exit(0);
		}
		}
	}//end main()

	private static void insertCall(BookController bController, Scanner sc) {
		System.out.println("책 제목 입력: ");
		String title = sc.nextLine();
		System.out.println("작가 입력: ");
		String author = sc.nextLine();
		BookDTO dto = new BookDTO(title, author);
		int chk = bController.insertProcess(dto);
		if(chk>0)
			System.out.printf("%d개 추가되었습니다.\n", chk);
		else
			System.out.println("추가를 실패했습니다.");
	}//end insertCall()
	
	private static void listCall(BookController bController, Scanner sc) {
		List<BookDTO> aList = bController.listProcess();
		for(BookDTO dto : aList) {
			System.out.printf("%d %s %s\n",
					dto.getNum(), dto.getTitle(), dto.getAuthor());
		}
	}//end listCall()
	
	private static void searchCall(BookController bController, Scanner sc) {
		System.out.println("책 제목 입력: ");
		String title = sc.nextLine();
		List<BookDTO> aList = bController.searchProcess(title);
		for(BookDTO dto : aList) {
			System.out.printf("%d %s %s\n",
					dto.getNum(), dto.getTitle(), dto.getAuthor());
		}
	}//end searchCall()
	
	private static void deleteCall(BookController bController, Scanner sc) {
		System.out.println("도서 번호 입력: ");
		int num = Integer.parseInt(sc.nextLine());
		int chk = bController.deleteProcess(num);
		if(chk>=0)
			System.out.printf("%d개 삭제되었습니다.\n", chk);
		else
			System.out.println("삭제를 실패했습니다.");
	}
	
}//end class
