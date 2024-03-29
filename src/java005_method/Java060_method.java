package java005_method;

/*[출력결과]
 * 10일 때 => 10는(은) 짝수입니다.
 * 9일 때 => 9는(은) 홀수입니다.
 */
public class Java060_method {

	public static void main(String[] args) {
		int data = 10;

		// if문 활용
//		if (process(data)) {
//			System.out.printf("%d는(은) 짝수입니다.\n", data);
//		} else {
//			System.out.printf("%d는(은) 홀수입니다.\n", data);
//		} // if end

		// 삼항연산자 활용
//		String result = process(data)? "짝수" : "홀수";
//		System.out.printf("%d는(은) %s입니다.\n", data, result);

		// 삼항연산자를 바로 출력값으로 넣어서 한줄로 줄이기.
		System.out.printf("%d는(은) %s입니다.\n", data, process(data) ? "짝수" : "홀수");

//		int a = 1;
//		System.out.printf("%d %d %d\n", ++a, ++a, ++a); // 2 3 4
//		System.out.printf("%d %d %d\n", a++, a++, a++); // 1 2 3

	}// main() end

	public static boolean process(int data) {
		// data매개변수의 값이 짝수이면 true,
		// 홀수이면 false을 리턴하는 메소드 구현

		//if문 활용
//		if (data % 2 == 0) {
//			return true;
//		} else {
//			return false;
//		} // if end

		//삼항연산자 활용
		return data % 2 == 0 ? true : false;

	}// process() end

}// class end
