package ncs.test10;

public class Secrtary extends Employee implements Bouns{
	public Secrtary() {
	
	}
	
	public Secrtary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}
	
	@Override
	public double tax() {
		return getSalary() * 0.1;
	}
	
	public void incentive(int pay) {
		int sum = (int)(getSalary() + pay*0.8);
		setSalary(sum);
	}
	
}
