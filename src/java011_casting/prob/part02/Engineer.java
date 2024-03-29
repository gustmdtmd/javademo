package java011_casting.prob.part02;

public class Engineer extends Employee{
	public Engineer() {
		super();
	}

	public Engineer(String name, int salary) {
		super(name, salary);
	}

	@Override
	public int getBonus() {
		return 150000;
	}

	@Override
	public int special() {
		int special = (int)(salary*0.13);
		return special;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\t "+getBonus()+"\t  "+special();
	}
}