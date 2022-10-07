package java004_array;

/*
 * a  b  c  d
 * a  b  c  d
 * a  b  c  d
 * a  b  c  d
 * 
 * 
 * [출력결과]
 * * a b c d
 * a * b c d
 * a b * c d
 * a b c * d
 * a b c d *
 */
public class Java050_array {

	public static void main(String[] args) {
		
		char[][] alpa = new char[][] {
			{ 'a', 'b', 'c', 'd' },
			{ 'a', 'b', 'c', 'd' },
			{ 'a', 'b', 'c', 'd' },
			{ 'a', 'b', 'c', 'd' }
		    };
		
		for(int row = 0; row<alpa.length; row++) {
			for(int col = 0; col<alpa[row].length; col++) {
				
				if(row == col) {
					System.out.printf("%2c", '*');
				}
					System.out.printf("%2c", alpa[row][col]);
			}
			System.out.printf("\n");
			//맨 마지막줄 출력을 위한 식
			if(row==alpa.length-1) {
				for(int i = 0; i<alpa[row].length; i++) {
					System.out.printf("%2c", alpa[row][i]);
				}
				System.out.printf("%2c", '*');
			}

		}

	}//main() end

}//class end
