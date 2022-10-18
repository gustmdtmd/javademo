package java012_api;

import java.util.regex.Pattern;
/*
 * [출력결과]
 * ymy232
 *  로그인이 되었습니다.
 *  korea
 *   회원이 아닙니다.

 */
public class Java128_RegEx {

	public static void main(String[] args) {
		System.out.println("ymy232");
		display(process("ymy232"));

		System.out.println("korea");
		display(process("korea"));
	}//main() end

	public static boolean process(String sn) {
	return	sn.matches("[a-zA-Z][a-zA-Z0-9]{4,9}") && Pattern.compile("\\d").matcher(sn).find();
	}//process() end
	
	public static void display(boolean res) {
		if(res) {
			System.out.println(" 로그인이 되었습니다.");
		}else {
			System.out.println(" 회원이 아닙니다.");
		}
	}
}//class end
