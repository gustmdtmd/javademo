package java010_abstract_interface.part07;

public class FinalTest {
	
	final int CODE = 1; //final이 선언 변수는 초기값을 할당해야 한다. 멤버변수는 모두 대문자 사용.
	
	public FinalTest() {
	
	}
	
	void display() {
		System.out.println("display");
	}
	
	final void process() {
		System.out.println("process");
	}
}
