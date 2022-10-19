package java013_api;

import static java.lang.Math.*;

import java.util.Arrays;

public class Java137_Math {

	public static void main(String[] args) {
		int[] num = new int[5]; // 1부터 10까지

		for (int i = 0; i < num.length; i++) {
			// 난수 발생
			num[i] = (int) floor(random() * 10) + 1;

			// 중복체크
			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					i--;
					break;
				} // if end
			} // for end
		} // for end

		Arrays.sort(num); // 출력 전 정렬
		for (int data : num)
			System.out.printf("%4d", data);

	}// main() end

}// class end
