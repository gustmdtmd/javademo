package ncs.test03;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTest {

	public static void main(String[] args) {
		int nYear;
		int nMonth;
		int nDay;
		
		Calendar cal = new GregorianCalendar();
		nYear = cal.get(Calendar.YEAR);
		nMonth = cal.get(Calendar.MONTH)+1;
		nDay = cal.get(Calendar.DAY_OF_MONTH);
		System.out.printf("현재 : %d년 %d월 %d일\n", nYear, nMonth, nDay);
	}//end main()

}//end class
