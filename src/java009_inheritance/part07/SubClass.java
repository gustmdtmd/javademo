package java009_inheritance.part07;

public class SubClass extends SuperClass {

	public SubClass() {

	}

	public SubClass(int a, int b, int c) { // 2
		// 여기를 구현하세요./////////////
		super(a, b, c); // 3
		display(); // 22
		sumData(); // 23
	} // 24

	public void sumData() {
		System.out.println("합 : " + (x + y + z));
	}
}
