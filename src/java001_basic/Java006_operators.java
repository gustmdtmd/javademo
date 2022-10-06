package java001_basic;

/*
  연산자(operator) : 어떠한 기능을 수행하는 기호(+,-,*,/,%,>,<,>=,<=,==,!=)
  피연산자(operand) : 연산자의 작업 대상(변수, 상수, 리터널, 수식...)
  
  연산자의 종류
  1. 산술 연산자(이항연산자) : +, -, *, /, %
  2. 비교 연산자(이항연산자) : >, < , >=, <=, ==, !=
  3. 논리 연산자(이항연산자) : &&(and), ||(or), !(not)
  4. 조건 연산자(삼항연산자) : (조건식) ? 참 : 거짓
  5. 대입 연산자(이항연산자) : =, +=, -=, *=, /=,>= ......
  6. 증감 연산자(단항연산자) : ++(1씩 증가), --(1씩 감소)
 */
public class Java006_operators {

	public static void main(String[] args) {
		int numX = 10;
		int numY = 5;
		
		//int = int + int
		int res = numX + numY;
		System.out.println(res); //15
		
		double avg = 4.5;
		double val = numX + avg; //데이터 타입이 다르면 데이터 타입값이 큰거로 받는다.
		System.out.println(val); //14.5
		
		short a = 3;
		short b = 4;
		
		//int 이하끼리 연산하면 int로 리턴한다.
		//Type mismatch: cannot convert from int to short
		//short c = a + b; 오류.
		int c = a + b;
		System.out.println(c); //7
		
		/*
		  int = short + short
		  int = byte + byte
		  int = char + char
		  int = short + byte
		  int = byte + char
		  int = int + byte 
		*/
		
		//자바에서 문자를 표현할 때 유니코드를 사용한다.
		char data ='0'; //48
		char alpa = 'A'; //65
		int sum = data + alpa;
		System.out.println(sum); //113
		
		
		
		
		
		
	}//main() end

}//class end
