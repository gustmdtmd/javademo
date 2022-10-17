package java011_casting.prob.part03;

public class Contract extends Member {
	int count;
	int day;

	public Contract(String name, String dept, String grade, int count, int day) {
		super(name, dept, grade);
		this.count = count;
		this.day = day;
	}
	
	@Override
	public int pay() {
		int CTotal = count*day;
		return CTotal;
	}
	
	@Override
	public String toString() {
		return String.format("%s 총급여 %d", name, pay());
	}
}
