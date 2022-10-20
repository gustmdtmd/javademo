package java014_api;

import java.text.SimpleDateFormat;

public class Java148_System {

	public static void main(String[] args) {
		// currentTimeMillis() : 1970. 1. 1.부터 초단위로
		// 누적한 값을 밀리세컨드로 리턴한다.
		// 하루는 86400초이다. 1초는 1000밀리세컨드이다.
		long curr = System.currentTimeMillis();
		System.out.println(curr);
		
		// HH: 24시간, hh: 12시간
		String pattern = "yyyy-MM-dd HH:mm:ss a EEE";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		//long -> Long -> Object
		//auto boxing -> up-casting
		String data = sdf.format(curr);
		System.out.println(data);
	}//main() end

}//class end