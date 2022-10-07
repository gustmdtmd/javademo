package java004_array;

public class Java051_array {

	public static void main(String[] args) {
		//1차원 배열은 가변생성 불가능하고 2차원 배열이상은 가변배열 생성가능하다.
		//가변 배열을 생성할 때는 제일 마지막의 배열크기는 지정하지 않는다.
		//가변 배열을 제공하는 이유는 메모리 손실을 최소화 하기 위한 쪽이다.
		
//		int[][] num = new int [3][];
//		num[0] = new int[2]; //0행에 2열이 생성
//		num[1] = new int[3]; //1행에 3열이 생성
//		num[2] = new int[5]; //2행에 5열이 생성
		
		int[][] num = new int[][] {{1, 2},{3, 4, 5},{6, 7, 8, 9, 10}};
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				System.out.printf("%4d", num[i][j]);
			} // for end
			System.out.printf("\n");
		} // for end
		
		
		
	}//main() end

}//class end
