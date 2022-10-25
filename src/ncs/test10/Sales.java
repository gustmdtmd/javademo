package ncs.test10;

public class Sales extends Employee implements Bouns {
	public Sales() {

	}

	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}
	
	@Override
	public double tax() {
	
		return 0;
	}
	
	public void incetive(int pay) {
		
	}
}
