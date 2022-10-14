package java009_inheritance.part05;
// import java.lang.Override; 
// import java.lang.System;
// import java.lang.String;
// java.lang 패키지에 있는 것은 적용하지 않아도 자동적용된다.

public class Second extends First{
	int b = 20;

	@Override
	void display() {
		System.out.println("b=" + b);
	}
	
	void superThisMethod() {
		super.display();
		this.display();
	}
	
	
}
