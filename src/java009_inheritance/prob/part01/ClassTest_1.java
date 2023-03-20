package java009_inheritance.prob.part01;

public class ClassTest_1 {
	private String name;
	private int salary;
	
	public ClassTest_1() {
		
	}

	ClassTest_1(String n, int s) {
		name = n;
		salary = s;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return salary;
	}

	public void getInformation() {
		System.out.printf("이름: %s 연봉: %d", name, salary);
	}

	public void prn() {
		System.out.println("수퍼클래스");
	}
} // end ClassTest_1



