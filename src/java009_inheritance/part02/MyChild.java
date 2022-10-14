package java009_inheritance.part02;

public class MyChild extends MyFather {
	public MyChild() { // 실행순서 2
		super(); // 실행순서 3
		System.out.println("MyChild"); // 실행순서 11
	} // 실행순서 12
}
