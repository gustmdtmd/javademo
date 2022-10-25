package ncs.test10;

public class Secrtary extends Employee implements Bouns{
	public Secrtary() {
	
	}
	
	public Secrtary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}
	
	@Override
	public double tax() {
	
		return 0;
	}
	
	public void incentive(int pay) {
		
	}
	
}
