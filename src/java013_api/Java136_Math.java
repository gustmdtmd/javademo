package java013_api;

import static java.lang.Math.*;

/*
 * 난수를 이용해서 소수점 첫째자리까지 반올림해서 구하시오.
 * ex) 0.5689.... => 5.7
 */
public class Java136_Math {

	public static void main(String[] args) {
		double num = random();
		System.out.println(num); // 기본 난수
		System.out.println(num*100); // 자릿수 체크
		System.out.println(round(num*100)); // 반올림
		System.out.println(round(num*100)/10.0); //소수점 첫째자리
		
	}//main() end

}//class end
