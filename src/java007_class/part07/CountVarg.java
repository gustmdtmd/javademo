package java007_class.part07;

/*
 * spread operator(...)
 * 1. jdk5이전 버전에서는 특정 메소드를 정의할 때 인자와 매개변수의 갯수 및 타입의 수를 정해놓고
 *    호출할 때 일치하지 않으면 오류가 발생했다.
 * 2. 이를 유연하게 처리할 수 있도록 variable argument 기능을 제공해주고 있다.
 * 3. 리턴타입 메소드명(데이터타입...가변매개변수){}
 */
public class CountVarg {
	void addValue(double...arr) {
		double sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
		
	}//addValue() end
	
	void sumValue(String name, int...arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.printf("name=%s, sum=%d\n", name, sum);
	}//sumValue() end
	
}//class end
