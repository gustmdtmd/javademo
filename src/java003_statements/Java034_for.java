package java003_statements;
/*
 * 반복문에서 특정 위치로 이동(continue)을 하거나 빠져나올 때(break)
 * 반복문에서 label을 선언하고 호출하면 된다.
 */
public class Java034_for {

	public static void main(String[] args) {

		move: // label선언
		for (int k = 1; k < 5; k++) {
			go: // label선언
			for (int i = 1; i <= 3; i++) {
				for (int j = 1; j <= 2; j++) {
					//break move;
					//continue move;
					//break go;
					break;
				} // for j end
				System.out.printf("i=%d\n", i);
			} // for i end
			System.out.println("kkk");
		} // for k end
		System.out.println("program end");

	}// main() end

}// class end
