package java010_abstract_interface.part01;

public class SenndaAbs extends CarAbs {
	int seat;
	
	public SenndaAbs() {
	
	}
	
	public SenndaAbs(int speed, String color, int seat) {
		super(speed, color);
		this.seat=seat;
	}
	
	@Override
	public void work() {
		System.out.println("승용차가 사람을 태우고 있습니다.");
	}
	
	@Override
	public void display() {
		super.display();
		System.out.printf("%d인용 차량입니다.\n", seat);
	}
}
