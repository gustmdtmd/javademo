package java005_method;

public class Java055_method {

	public static void main(String[] args) {
		int year = 2013;
		boolean result =isLeapYear(year);

		if(result) {
			System.out.printf("%d년도는 윤년입니다.\n", year);
		}else {
			System.out.printf("%d년도는 평년입니다.\n",  year);
		}//if end
		
	}// main() end

	public static boolean isLeapYear(int year) {
		//어떤 년도가 윤년이면 true, 평년이면 false를 리턴하는 프로그램 구현
		
		//boolean chk; 
		
		if((year%4 == 0 && year%100 != 0) || year%400 == 0) {
			//chk = true;
			return  true;
		}else {
			//chk = false;
			return false;
		}//if end
		
		//return chk;
		
	}// isLeapYear end
	
}// class end
