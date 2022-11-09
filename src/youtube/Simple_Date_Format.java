package youtube;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Simple_Date_Format {

	public static void main(String[] args) {
		//SimpleDateFormat : 날짜와 시간을 다양한 형식으로 출력할 수 있게 해준다.
		Date today = new Date();
				
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf1 = new SimpleDateFormat("yy년 MM월 dd일");
		
		System.out.println(sdf.format(today));
		System.out.println(sdf1.format(today));
		
		
		
	}

}
