package java005_method;

/*
 * [출력결과]
 * java test
 * tset avaj
 * java test
 */
public class Java065_method {

	public static void main(String[] args) {
		char[] arr = { 'j', 'a', 'v', 'a', ' ', 't', 'e', 's', 't' };
		System.out.println(arr);
		System.out.println(reverse(arr));
		System.out.println(arr);
	}// main() end

	// shallow copy : 주소 복사
	// deep copy : 요소 복사
	public static char[] reverse(char[] data) {
		// data의 요소 앞뒤를 바꿔서 리턴하는 프로그램 구현
		// 새로운 배열을 만들어 data요소를 역방향으로 넣어주어야 한다.

		char[] arr = new char[data.length]; // 배열의 크기 구해주기

		// arr[0] = data[8];
		// arr[1] = data[7];
		// ...
		// arr[8] = data[0];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = data[arr.length - 1 - i];
		} // for end

		return arr;
	}// reverse() end

}// class end