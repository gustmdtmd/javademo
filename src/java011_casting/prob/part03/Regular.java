package java011_casting.prob.part03;

public class Regular extends Member {
	int total;
	int extra;

	public Regular(String name, String dept, String grade, int total, int extra) {
		super(name, dept, grade);
		this.total = total;
		this.extra = extra;
	}
	
	@Override
	public int pay() {
		int RTotal = total+extra;
		return RTotal;
	}
	
	@Override
	public String toString() {
		return String.format("%s 총급여 %d", name, pay());
	}
}
