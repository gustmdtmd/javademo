package java004_array.prob;
/*
 * 4행 4열 data배열에 가로 세로 합계를 구하는 프로그램을 구현하시오.
 * [출력결과]
 *  1   2   3   6
 *  4   5   6  15
 *  7   8   9  24
 * 12  15  18  45
 */

public class Prob_02 {

	public static void main(String[] args) {
		int[][] data = new int[4][4];
		int cnt = 1;

		// 여기를 구현하시오.

		// data[3][j] 및 data[i][3]을 제외한 배열 값 넣어주기
		for (int i = 0; i < data.length - 1; i++) {
			for (int j = 0; j < data[i].length - 1; j++) {
				data[i][j] = cnt++;
			} // for end
		} // for end

		// data[3][j] 및 data[i][3] 값 넣어주기
		for (int i = 0; i < data.length - 1; i++) {
			for (int j = 0; j < data[i].length - 1; j++) {
				data[3][i] += data[i][j];
				data[i][3] += data[j][i];
			} // for end
			data[3][3] += data[3][i];
		} // for end

		// data 배열 출력
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.printf("%4d", data[i][j]);
			} // for end
			System.out.printf("\n");
		} // for end
	}// end main()

}// end class
