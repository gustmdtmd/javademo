package java005_method.prob;

public class Prob006_method {

	public static void main(String[] args) {
		System.out.println("<< 15 까지의 소수 >>");
		primeNumber(15);
		System.out.println("<< 32 까지의 소수 >>");
		primeNumber(32);
	}// end main( )

	private static void primeNumber(int num) {
		// 구현하세요.
		int[] data = new int[num];
		int cnt=1;
		System.out.println(2);
		System.out.println(3);
		for(int i = 0; i<num; i++) {
			data[i]=cnt++;
			if(data[i]>=2 && data[i]%2 != 0 && data[i]%3 != 0 ) {
				System.out.println(data[i]);
			}
		}
		
	}// end primeNumber( )
}// end class