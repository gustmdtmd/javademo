package java007_class.part07;

public class Java080_class {
	public static void main(String[] args) {
		CountVarg cv = new CountVarg();
		cv.addValue(4, 8);
		cv.addValue(2, 3, 9);
		cv.addValue(1, 5, 2, 4, 9);
		cv.addValue(1.3, 2.5);
		//고정변수와 가변을 함께 사용시
		//고정변수 먼저 선언 후 가변 선언 
		//가변은 딱 한번만 선언가능
		cv.sumValue("홍길동", 70, 80, 65); 
		
		
	}// main() end
}// class end
