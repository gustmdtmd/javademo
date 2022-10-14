package java009_inheritance.part02;

public class MyFather extends MyGrand {
	public MyFather() { // 실행순서 4
		super(); // 실행순서 5
		System.out.println("MyFather"); // 실행순서 9
	} // 실행순서 10
}
