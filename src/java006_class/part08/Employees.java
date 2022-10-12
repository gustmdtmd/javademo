package java006_class.part08;

/*
 * 사원중에 부서가 결정되지 않은 경우 부서는 "보류", 급여는 3000으로
 * 기본값으로 설정한다.
 */
public class Employees {
	String name;
	String dept; //부서
	int salary;  //급여
	
	public Employees() {
		
	}//Employees() end
	
	public Employees(String name) { 
		this("보류", 3000); //생성자 호출시 맨위에 있어야만 사용가능.
		this.name = name;
	}//Employees() end
	
	public Employees(int salary) {
		this.salary = salary;
	}//Employees() end
	
	public Employees(String dept, int salary) {
		this.dept = dept;
		this.salary = salary;
	}//Employees() end

	public Employees(String name, String dept, int salary) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}//Employees() end
	
	public String toString() {
		return String.format("%s %s %d\n", name, dept, salary);
	}
	
	//toString() 
	//https://7942yongdae.tistory.com/178
	//String.format
	//https://velog.io/@yu-jin-song/JAVA-%EB%AC%B8%EC%9E%90%EC%97%B4-%ED%98%95%EC%8B%9D-%EC%A7%80%EC%A0%95
}//class end
