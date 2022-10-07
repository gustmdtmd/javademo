package java004_array;

/*
 * [데이터]
 * 홍길동  90 85 40
 * 이영희 100 35 75
 * 
 * [출력결과]
 * 홍길동  90 85 40 215 71.7
 * 이영희 100 35 75 210 70.0 
 */
public class Java046_array {

	public static void main(String[] args) {
		String[] name = { "홍길동", "이영희" };
		// String[] name = new String[] {"홍길동", "이영희"};
		int[][] jumsu = { { 90, 85, 40 }, { 100, 35, 75 } };
		// int[][] jumsu = new int[][] {{90,85,40}, {100,35,75}};

		int sum;

		for (int index = 0; index < name.length; index++) {
			
			sum = 0;
			System.out.printf("%8s", name[index]);
			
			for (int col = 0; col < 3; col++) {
				System.out.printf("%4d", jumsu[index][col]);
				sum += jumsu[index][col];
			}//for end
			
			System.out.printf("%4d %6.1f\n", sum, (double)sum/jumsu[index].length);
			System.out.printf("\n");
		}//for end

//		int hap;
//		double avg = 0;
//		
//		for(int row = 0; row<jumsu.length; row++) {
		
//			hap=0;
//			System.out.printf("%s", name[row]);
		
//			for(int col = 0; col<jumsu[row].length; col++) {
//				hap+=jumsu[row][col];
//				avg=(double)hap/jumsu[row].length;
//				System.out.printf("%4d", jumsu[row][col]);
//			}
		
//			System.out.printf(" %d %.1f",hap, avg);
//			System.out.println();
//		}
//		

	}// main() end

}// class end
