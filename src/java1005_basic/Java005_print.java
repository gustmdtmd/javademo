package java1005_basic;

public class Java005_print {
	
	public static void main(String[] args) {
		byte bNum = 2;
		short sNum = 4;
		int xNum = 5;
		long lNum = 6L; //L or l을 뒤에 입력.
		float fNum = 2.5f; //F or f를 뒤에 입력.
		double dNum = 7.4; //D or d를 입력해도 되고 안해도 됨
		char cData = 'a'; //''필수이고 오직 하나만 가능
		boolean eNum = true; //true or false 만 가능!!
		String sData = "java"; //문자열 ""필수
		
		System.out.println(bNum + "," + sNum); //2,4 문자열과 더해지면 문자열로 변경된다.
		
		/*
		   System.out.printf("출력형식", 값1, 값2, 값3...)
		   출력기호
		   %d : 정수(byte, short, int, long)
		   %f : 실수(float, double)
		   %b : 논리(boolean)
		   %c : 문자(char)
		   %s : 문자열(String)
		   %% : %
		   \n : 줄바꿈
		   \t : 탭
		*/
		
		System.out.printf("%d %d %d %d %f %f %b %c %s \n", 
				bNum, sNum, xNum, lNum, fNum, dNum, eNum, cData, sData);
		//2 4 5 6 2.500000 7.400000 true a java 
		
		System.out.printf("%d %% %d = %d\n", 5, 2, (5%2));
		//5 % 2 = 1
		
		System.out.print("java");//출력만 되고 줄바꿈이 일어나지않음
		System.out.println("program");
		System.out.println();//자동 줄바꿈
		System.out.println("jsp");
		System.out.println("test");
	}//main() end

}//class end
