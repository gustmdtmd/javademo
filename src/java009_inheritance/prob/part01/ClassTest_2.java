package java009_inheritance.prob.part01;

public class ClassTest_2 extends ClassTest_1 {
	String department;
	
	public ClassTest_2() {
	
	}
	
	ClassTest_2(String n, int s, String department) {
		super(n,s);
		this.department = department;
	}
	
	@Override
	public void getInformation() {
		System.out.printf("이름: %s 연봉: %d 부서: %s", getName(), getSalary(), department);
	}
	
	@Override
	public void prn() {
		super.prn();
		System.out.println("서브클래스");
	}
	
	public void callSuperThis() {
		prn();
		
	}
}
