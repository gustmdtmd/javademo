package java013_api;

import java.util.Scanner;

/*
 * 단입력 : 5
 * 5 X 1 = 5
 * 5 X 2 = 10
 * . . .
 * 5 X 9 = 45
 * 계속하시겠습니까?(종료:n, 계속:아무키)n
 * 프로그램종료
 */
public class Java143_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("단입력 : ");
			int dan = sc.nextInt();
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %2d\n", dan, i, dan * i);
			} // for end
			
			System.out.print("계속하시겠습니까?(종료:n, 계속:아무키) : ");
			String chk = sc.next();
			if (chk.equals("n")) {
			//if (chk=="n") { //주소값을 비교하기때문에 false
				break;
			} // if end
			
		} // while end
		System.out.print("프로그램종료");

	}// main() end

}// class end
