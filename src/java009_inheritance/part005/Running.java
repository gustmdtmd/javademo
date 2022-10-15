package java009_inheritance.part005;

public class Running extends Shooting {
	double run;

	public Running(String name, int three, int two, double run) {
		super(name, three, two);
		this.run = run;
	}

	//달리기 기록애 따라 점수
	int runJumsu() {
		if (run < 20) {
			switch (((int) run) % 10) {
			case 0:
			case 1:
			case 9:
				return 50;
			case 2:
				return 40;
			case 3:
				return 30;
			case 4:
				return 20;
			default:
				return 10;
			}
		} else {
			return 0;
		}
	}
	
	//슈팅과 달리기 점수 총 합
	int hap() {
		return total()+runJumsu();
		
	}
	
	//총합을 가지고 등급 정하기
	char grade() {
		switch(hap()/10) {
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
		System.out.printf("%s님의 슈팅점수는 %d점, 100m 달리기점수는 %d점, 총 합 %d점으로 %c등급입니다.\n", name, total(), runJumsu(),hap(), grade());
	}

}
