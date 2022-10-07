package java004_array;

public class Java039_array {

	public static void main(String[] args) {
		// javascript 배열 선언 방식(데이터 타입이 달라도 선언 가능)
		// myArray = [1, 2, 3, "홍길동", "아무개"];

		// java 배열 선언 방식(데이터 타입이 같아야 선언 가능)
		int[] data = { 10, 20, 30 };
		// 배열 초기값을 할당해주면 배열 생성할 때 배열의 크기를 지정할 수 없다.
		int[] jumsu = new int[] { 90, 80, 40 };

		for (int i = 0; i < data.length; i++) {
			System.out.printf("jumsu[%d]=%d\n", i, jumsu[i]);
		}

		System.out.println("=====Reverse=====");
		for (int i = jumsu.length - 1; i >= 0; i--) {
			System.out.printf("jumsu[%d]=%d\n", i, jumsu[i]);
		}

	}// main() end

}// class end
