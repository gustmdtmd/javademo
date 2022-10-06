package java001_basic;

/*
  리터널(literal) : 그 자체의 값(1,2,3,..., 'a','b','c',...,true,false)
  변수(variable) : 하나의 값을 저장하기 위한 메모리 공간
  자바에서 제공하는 데이터 타입
  1. primitive DataType (기본 데이터 타입)
  	  문자 - char(2byte)
  	  숫자 - 정수 - byte(1byte) - short(2byte)- int(4byte) - long(8byte)
  	  	  - 실수 - float(4byte) - double(8byte)
  	  논리 - boolean(1byte)
  
  2. Reference DataType (참조 데이터 타입)
  	  Array, Class, Interface
  	  
  ★시스템에서 인식하는 데이터 타입 크기
  byte < char, short < int < long < float <double
*/
public class Java003_dataType {
	public static void main(String[] args) {
		
		//ⓐ 변수 선언
		int data; //데이터타입 변수명;
		
		//ⓑ 값을 할당
		data = 3; //data 변수에 3값을 할당(저장)
		
		//int data = 3; ⓐ와ⓑ를 한번에 가능하다.
		
		System.out.println(data); //3
		
		//data 변수에 새로운 값 할당
		data = 10;
		System.out.println(data); //10
		
		double avg = 4;
		System.out.println(avg); //4.0
		//int num = 4.0; 
		//오류. 데이터타입의 크기가 int 보다 double이 크기때문에
		double ko = 4.0f;
		
		int x = 0101; //8진수
		System.out.println(x);

		int y = 65; //10진수
		System.out.println(y);
		
		int z = 0B101; //2진수 (0B101 == 0b101)
		System.out.println(z);

		int k = 0X101; //16진수 (0X101 == 0x101)
		System.out.println(k);
				
		//2진수는 0B, 8진수는 0, 16진수는 0X앞에 입력해서 출력함.		
	}
}



