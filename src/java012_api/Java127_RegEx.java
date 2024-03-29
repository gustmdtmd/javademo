package java012_api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 정상적으로 주민번호가 입력이 되었으면 true를 반환하고 아니면
 * false를 반환하는 프로그램을 구현하시오.
 * 
 * [출력결과]
 * 851306-2689540승인이 완료되었습니다.
 * 750625-16843다시 입력하세요.
 */
public class Java127_RegEx {

	public static void main(String[] args) {
		System.out.print("851306-2689540");
		display(process("851306-2689540"));

		System.out.print("750625-16843");
		display(process("750625-16843"));

	}// main() end

	public static boolean process(String sn) {
		return sn.matches("\\d{6}-\\d{7}");
	}// process() end

	public static void display(boolean res) {
		if(res) {
			System.out.println("승인이 완료되었습니다.");
		}else {
			System.out.println("다시 입력하세요.");
		}
	}// display() end

}// class end
