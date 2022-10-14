package java009_inheritance.part01;

public class Father /*extends Object*/{
	int a = 3;
	private int c = 10; //상속안됨
	
	public Father() {
		System.out.println("Father");
	}
	
	public Father(int a) {
		int k = a+3;
		System.out.println(k);
	}
	
	void display() {
		System.out.println("a=" + a);
	}
}
