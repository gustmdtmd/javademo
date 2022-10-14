package java009_inheritance.part005;

public class Basketball {
	String name;
	int three;
	int two;
	
	Basketball(String name, int three, int two) {
		this.name = name;
		this.three = three;
		this.two = two;
	}
	
	public void res() {
		System.out.printf("%s님은 3점 %d개, 2점 %d개로 총 합 %d점으로 %c등급입니다.");
	}
	
	
}
