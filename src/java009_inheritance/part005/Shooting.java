package java009_inheritance.part005;

public class Shooting {
	String name;
	int three;
	int two;

	Shooting(String name, int three, int two) {
		this.name = name;
		this.three = three;
		this.two = two;
	}
	
	//슈팅 점수
	int total() {
		int total = three*3 + two*2;
		return total;
	}
	
	public void res() {
		System.out.printf("%s님은 3점 %d개, 2점 %d개로 슈팅 총 합은 %d점입니다.\n",
				name, three, two, total());
	}

}
