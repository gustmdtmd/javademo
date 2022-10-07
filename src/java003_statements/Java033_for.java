package java003_statements;

/*
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 1 2 3 4 5
 */
public class Java033_for {

	public static void main(String[] args) {
		for (int row = 0; row <= 3; row++) {
			for (int col = 1; col <= 5; col++) {
				System.out.printf("%4d", col);
			}//for col end
			System.out.println();
		}//for row end

	}// main() end

}// class end
