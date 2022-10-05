package java1005_basic;

/*
 * Ctrl + SpaceBar  : 자동완성
 * Ctrl + / : 한 라인 주석 설정 및 해제
 * Ctrl + Shift + / : 여러 라인 주석 설정
 * Ctrl + Shift + \ : 여러 라인 주석 해제
 * Ctrl + Shift + F : 자동 정렬 (Window - Preferences - General - Keys - Ctrl+Shift+F를 Ctrl+F로 변겅)
 *  
 */
public class Java004_casting {

	public static void main(String[] args) {
	
		byte bNum = 2;
		short sNum = 4;
		int xNum = 5;
		long lNum = 6L; //L or l을 뒤에 입력.
		float fNum = 2.5f; //F or f를 뒤에 입력.
		double dNum = 7.4; //D or d를 입력해도 되고 안해도 됨
		char cData = 'a'; //''필수이고 오직 하나만 가능
		boolean eNum = true; //true or false 만 가능!!
		
		System.out.println(lNum);
		System.out.println(fNum);
		
		//형변환(casting)
		//묵시적 형변환 : 작은 데이터 타입을 큰 데이터 타입으로 변환할 때 발생
		//명시적 형변환 : 큰 데이터 타입을 작은 데이터 타입으로 변환할 때 발생
		long gNum = 6; //int => long 묵시적 형변환.
		System.out.println(gNum); //6 long타입의 6이다.
		
		float tNum =(float) 2.5; 
		// 명시적 형변환 : double => float 반드시 앞에 데이터 타입을 입력해주어야한다.
		System.out.println(tNum);
		
		//데이터 손실이 발생되는 경우
		byte data = (byte)128;
		//-128
		System.out.println(data); //-128
				
		
	}//main() end
	
}//class end






