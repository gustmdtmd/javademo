package java003_statements.prob;
/*
 * 
 * 2001부터 2012년사이에서 윤년을 구하시오 
 * 출력결과
 2004
 2008
 2012
 */

public class Prob_02 {

	public static void main(String[] args) {
		for (int year = 2001; year <= 2012; year++) {
			boolean leapYear = year % 4 == 0 && year != 100 || year % 400 == 0;
			if (leapYear) {
				System.out.println(year);
			}// if end
		}//for end

	}// end main()

}// end class
