package ncs_start;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTest {

	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar(1995,12,10);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		System.out.println("생일 : " + sdf.format(gc.getTime()));
		
		GregorianCalendar qc = new GregorianCalendar();
		SimpleDateFormat sd = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println("현재 : " + sd.format(qc.getTime()));
		
		System.out.println("나이 : " + (qc.get(Calendar.YEAR) - gc.get(Calendar.YEAR)+1) + "세");
		
	}

}
