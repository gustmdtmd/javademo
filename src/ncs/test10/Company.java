package ncs.test10;

public class Company {

	public static void main(String[] args) {
		Employee[] employees = new Employee[2];
	
		Secrtary sc = new Secrtary("Hilery", 1, "secrtary", 800);
		employees[0] = sc;
		
		Secrtary se = new Secrtary("Clinten", 1, "sales", 1200);
		employees[1] = sc;
		
		System.out.println("name\t department\t salary");
		System.out.println("------------------------------------");
		for(int i=0; i<employees.length; i++) {
			System.out.printf("%s\t%s\t%d\n",
					employees[i].getName(), employees[i].getDepartment(), employees[i].getSalary());
		}
		
		System.out.println("인센티브 100지급");
		sc.incentive(100);
		se.incentive(100);
		
		System.out.println("name\t department\t salary\t tax");
		System.out.println("------------------------------------");
		for(int i=0; i<employees.length; i++) {
			System.out.printf("%s\t%s\t%d\t%.1f\n",
					employees[i].getName(), employees[i].getDepartment(),
					employees[i].getSalary(), employees[i].tax());
		}
	}//end main() 

}//end class
