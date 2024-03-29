package ncs.test10;

public class Sales extends Employee implements Bouns {
	public Sales() {
	}

	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	public double tax() {
		return super.getSalary() * 0.13;
	}

	@Override
	public void incentive(int pay) {
		int sum = (int) (getSalary() + pay * 1.2);
		setSalary(sum);
	}
}
