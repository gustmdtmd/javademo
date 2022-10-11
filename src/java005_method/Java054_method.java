package java005_method;

/*
 * [출력결과]
 * 홍길동님은 회원입니다.
 * 3000포인트가 적립되었습니다.
 */
public class Java054_method {

	public static void main(String[] args) {  //순서 1
		member("홍길동", true); //순서 2
		plus(3000); //순서 7

	}//main() end  순서 11

	//회원여부
	public static void member(String name, boolean chk) { //순서  3
		if(chk) { //순서 4
			System.out.printf("%s님은 회원입니다.\n", name);
		}else {
			System.out.printf("%s님은 비회원입니다.\n", name);
		}//if end  순서 5
	}//member() end 순서 6
	
	//포인트 적립
	public static void plus(int point) { // 순서 8
		System.out.printf("%d포인트가 적립되었습니다.\n", point); //순서 9
	}//plus() end 순서 10
	
}//class end
