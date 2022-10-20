package java014_api.prob;

/*
 * [출력결과]
 *  영어 소문자 갯수:3
 *  영어 대문자 갯수:3
 *  숫자 갯수:2
 */

public class Prob007_String {

	public static void main(String[] args) {
		String data = "ke4RdTA5";

		display(process(data));
	}// end main()

	public static char[] process(String data) {
		char[] pc = data.toCharArray();
		
		return pc;
	}// end process()

	public static void display(char[] arr) {
		int Ecount=0;
		int ecount=0;
		int ncount=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>='A' && arr[i]<='Z')
				Ecount++;
			else if(arr[i]>='a' && arr[i]<='z')
				ecount++;
			else
				ncount++;
		}
		System.out.println("영어 대문자 갯수:"+Ecount);
		System.out.println("영어 소문자 갯수:"+ecount);
		System.out.println("숫자 갯수:"+ncount);
		
	}// end display()

}// end class
