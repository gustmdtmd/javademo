package java013_api;

import java.util.Random;

public class Java138_Random {

	public static void main(String[] args) {
		Random ran = new Random();
		double r1 = ran.nextDouble(); // 1.0미만 난수
		System.out.println(r1);
		
		int r2 = ran.nextInt();  // 10진수 난수
		System.out.println(r2); 
		
		int r3 = ran.nextInt(10); //10이란 값을 넣어주어 0~9까지로 범위 제한
		System.out.println(r3);
		
		//1부터 10까지
		System.out.println(r3+1);

	}//main() end

}//class end
