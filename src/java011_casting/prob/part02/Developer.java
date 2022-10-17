package java011_casting.prob.part02;

public class Developer extends Employee{
	public Developer() {
		super();
	}

	public Developer(String name, int salary) {
		super(name, salary);
	}

	@Override
	public int getBonus() {
		return 100000;
	}

	@Override
	public int special() {
		int special = (int)(salary*0.15);
		return special;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\t "+getBonus()+"\t  "+special();
	}
}