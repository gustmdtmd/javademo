package youtube;

import java.util.Calendar;

public class Calendar_date {

	public static void main(String[] args) {
		
		int year = 1995;
		int month = 12;
		int dayOfWeek = 0;
		int endDay = 0;
		
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();
		
		//월의 1일과 다음달 1일
		sDay.set(year, month-1, 1);
		eDay.set(year, month,1);
		
		//월의 마지막날
		eDay.add(Calendar.DATE,-1);
		
		//1일 요일
		dayOfWeek = sDay.get(Calendar.DAY_OF_WEEK);
		
		// eDay의 날짜
		endDay = eDay.get(Calendar.DATE);
		
		System.out.println("     "+ year +"년"+ month + "월");
		System.out.println(" SU MO TU WE TH FR SA");
		
		for(int i=1; i<dayOfWeek; i++) 
			System.out.print("   ");
		
		for(int i=1, n=dayOfWeek; i<endDay; i++, n++) {
			System.out.print((i<10) ? "  "+i : " "+i);
			if(n%7==0) System.out.println();
		}
		
	}

}
