package java012_api;

/*
 * [출력결과]
 * aerok
 * korea
 */
public class Java119_String {

	public static void main(String[] args) {
		String sn = "korea";
		char[] data = display(sn);
		System.out.println(data);
		System.out.println(sn);

	}//main() end
	
	public static char[] display(String alpa) {
		// alpa 매개변수에 저장된 문자열을 reverse 한 후 반환하는 프로그램을 구현하세요.
		String copy = alpa;
		char[] reverse = new char[copy.length()];
		for(int i=reverse.length-1; i>=0; i--) {
			reverse[reverse.length-1-i]+= copy.charAt(i);
		}
		return reverse;
	}//display() end
}//class end
