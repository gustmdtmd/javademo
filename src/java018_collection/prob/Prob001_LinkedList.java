package java018_collection.prob;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

/*
 * LinkedList
 * 1 List : 순서적으로 데이터를 저장
 * 2 Stack : LIFO
 * 3 Queue : FIFO
 */

public class Prob001_LinkedList {

	public static void main(String[] args) {
		/*
		 * booklist.txt파일의 데이터를 Stack으로 처리하여 출력되도록 프로그램을 구현하시오. title publisher writer
		 * price JSP Programming JSPPub JSPExpert 21000 Servlet Programming WeBBest
		 * GoodName 20000 JDBC Programming JDBCBest NaDo SQL 30000 SQL Fundmental
		 * SQLBest Na SQL 47000 Java Programming JavaBest Kim kava 25000
		 */
		File file = new File("src/java018_collection/prob/booklist.txt");
		LinkedList<Book> stack = new LinkedList<Book>();
		try (Scanner sc = new Scanner(file);) {
			while (sc.hasNextLine()) {
				String[] data = sc.nextLine().split("/");
				Book book = new Book(data[0], data[1], data[2], data[3]);
				stack.push(book);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
		}

		System.out.println("title               publisher writer    price");
//		for(Book book : stack) {
//			System.out.printf("%-19s %-9s %-9s %s\n",
//					book.getTitle(), book.getPublisher(), book.getWriter(), book.getPrice());
//		}

		while (!stack.isEmpty()) {
			Book book = stack.pop();
			System.out.printf("%-19s %-9s %-9s %s\n", book.getTitle(), book.getPublisher(), book.getWriter(),
					book.getPrice());
		}
	}// end main()

}// end class
