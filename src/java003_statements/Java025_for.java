package java003_statements;

public class Java025_for {

	public static void main(String[] args) {
		// 누적된 값이 최초로 15이상 전 까지만 반복문을 수행

		int sum = 0;
		int i;

		for (i = 1;; i++) {
			sum += i;
			if (sum >= 15) {
				break;
			} // if end

		} // for end

		System.out.printf("i=%d sum=%d", i, sum);

	}// main() end

}// class end
