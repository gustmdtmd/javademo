package java009_inheritance.part005;

public class Score extends Basketball {
	public Score(String name, int three, int two) {
		super(name, three, two);
	}
	
	int total() {
		int total = three*6 + two*4;
		return total;
	}
	
	char grade() {
		switch(total()/10) {
		case 10:
			case 9: return 'A';
			case 8: return 'B';
			case 7: return 'C';
			case 6: return 'D';
			default: return 'F';
		}
	}
	
	@Override
	public void res() {
		System.out.printf("%s님은 3점 %d개, 2점 %d개로 총 합 %d점으로 %c등급입니다.\n",
				name, three, two, total(), grade());
	}
}
