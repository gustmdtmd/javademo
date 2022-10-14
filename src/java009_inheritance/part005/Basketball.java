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
		System.out.printf("%s님은 3점 %d개, 2점 %d개입니다.\n",
				name, three, two);
	}
	
	
}
